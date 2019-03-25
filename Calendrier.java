import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Calendrier {
	private static Scanner lectureClavier;
	//La fonction Centrer texte
	public static String centrerTexte(String texte, int taille){
		int longueur = texte.length();
		String result = "";
		
		int nombreEspaces = (taille - longueur) / 2;
		for(int i = 0; i<nombreEspaces; i++){
		result = result + " ";
		}
		result += texte ;
		for(int i = 0; i<nombreEspaces; i++){
			result += " ";
		}
		return result;
	}
		
	public static void main(String[] args) {
		lectureClavier = new Scanner(System.in);
		System.out.print("Saisir l'annee desiree: ");
		int annee = lectureClavier.nextInt();
		
		//Affichage et centrage de l'annee
		System.out.println(centrerTexte(""+annee, 66));
		System.out.println( );

	//declaration du tableau pour le nom des mois
	final String[] moisAlpha = {"Janvier", "Fevrier", "Mars", "Avril",		 
								"Mai", "Juin", "Juillet", "Août",
								"Septembre", "Octobre", "Novembre", "Decembre"};
	//Declaration et initialisation des compteurs de jours pour chaque mois
	int[] cpts = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	//Declaration du tableau pour le premier jour du mois
	int[] premierJourDuMois = new int[12];
	//Declaration et remplissage du tableau pour le dernier jour du mois
	int[] dernierJourDuMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//Declaration et iitialisation du calendrier 
	GregorianCalendar calendrier;
	calendrier = new GregorianCalendar(2010, 0, 1);
	//Condition pour les annees Bisextiles
	boolean EstBisextile = calendrier.isLeapYear(annee);
		if(EstBisextile){
			dernierJourDuMois[1] = 29;
		}
	//Construction de la boucle pour les 3 premier mois (Janvier, Fevrier, Mars)
	//Affichage et Centrage des Mois
	for (int j = 0; j < 3; j++) {
	System.out.print(centrerTexte(moisAlpha[j], 21)+"  ");
	}System.out.println( );
	//Affichage des jours de la semaine
	for (int j = 0; j < 3; j++) {
		calendrier = new GregorianCalendar(annee, j, 1);
		premierJourDuMois[j] = calendrier.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%2s%3s%3.5s%3.65s%3.75s%3.9s%3.8s","Di", "Lu", "Ma", "Me", "Je", "Ve", "Sa");
		System.out.print("   ");
	}System.out.println( );

	for(int k = 0; k < 6; k++){
		for (int j = 0; j < 3; j++) {
		
			for (int i = 0; i < 7; i++) {
				if((i < premierJourDuMois[j]-1) && k == 0){
					System.out.print("   ");
					}
			else if(cpts[j] >= dernierJourDuMois[j]+1){
					System.out.print("   ");	
					} 
			else {
					if((cpts[j] < 10))
						System.out.print(centrerTexte(" "+cpts[j]+" ", 2));
					else 
						System.out.print(centrerTexte(""+cpts[j]+" ", 2)); 
						cpts [j]++;
					}
			}System.out.print("  ");
		}System.out.println( );
	}
	//Construction de la boucle pour les 3 mois suivants (Avril, Mais, Juin)
	for (int j = 3; j < 6; j++) {
		System.out.print(centrerTexte(moisAlpha[j], 21)+"  ");
		}System.out.println( );

	for (int j = 3; j < 6; j++){
		calendrier = new GregorianCalendar(annee, j, 1);
		premierJourDuMois[j] = calendrier.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%2s%3s%3.5s%3.65s%3.75s%3.9s%3.8s","Di", "Lu", "Ma", "Me", "Je", "Ve", "Sa");
		System.out.print("   ");
		}System.out.println( );

	for(int k = 0; k < 6; k++){
		for (int j = 3; j < 6; j++) {
			for (int i = 0; i < 7; i++) {
				if((i < premierJourDuMois[j]-1) && k == 0){
					System.out.print("   ");
					}
				else if(cpts[j] >= dernierJourDuMois[j]+1){
					   	System.out.print("   ");	
					}
				else {
					if((cpts[j] < 10))	
						System.out.print(centrerTexte(" "+cpts[j]+" ", 2));
					else 
						System.out.print(centrerTexte(""+cpts[j]+" ", 2)); 
						cpts [j]++;
					  }
			}System.out.print("  ");
		}System.out.println( );
	}
	//Construction de la boucle pour les 3 mois suivants (Juillet, Aout, Septembre)
	for (int j = 6; j < 9; j++) {
		System.out.print(centrerTexte(moisAlpha[j], 21)+"  ");
		}System.out.println( );

	for (int j = 6; j < 9; j++){
		calendrier = new GregorianCalendar(annee, j, 1);
		premierJourDuMois[j] = calendrier.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%2s%3s%3.5s%3.65s%3.75s%3.9s%3.8s","Di", "Lu", "Ma", "Me", "Je", "Ve", "Sa");
		System.out.print("   ");
		}System.out.println( );

	for(int k = 0; k < 6; k++){
		for (int j = 6; j < 9; j++) {
			for (int i = 0; i < 7; i++) {
				if((i < premierJourDuMois[j]-1) && k == 0){
				System.out.print("   ");
				}
				else if(cpts[j] >= dernierJourDuMois[j]+1){
					System.out.print("   ");	
				}
				else {
					if((cpts[j] < 10))	
						System.out.print(centrerTexte(" "+cpts[j]+" ", 2));
					else 
						System.out.print(centrerTexte(""+cpts[j]+" ", 2)); 
						cpts [j]++;
					 }
			}System.out.print("  ");
		}System.out.println( );
	}
	//Construction de la boucle pour les 3 derniers mois (Octobre, Novembre, Decembre)
	for (int j = 9; j < 12; j++) {
		System.out.print(centrerTexte(moisAlpha[j], 21)+"  ");
		}System.out.println( );

	for (int j = 9; j < 12; j++){
		calendrier = new GregorianCalendar(annee, j, 1);
		premierJourDuMois[j] = calendrier.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%2s%3s%3.5s%3.65s%3.75s%3.9s%3.8s","Di", "Lu", "Ma", "Me", "Je", "Ve", "Sa");
		System.out.print("   ");
		}System.out.println( );

	for(int k = 0; k < 6; k++){
		for (int j = 9; j < 12; j++) {
			for (int i = 0; i < 7; i++) {
				if((i < premierJourDuMois[j]-1) && k == 0){
					System.out.print("   ");
					}
				else if(cpts[j] >= dernierJourDuMois[j]+1){
					   System.out.print("   ");	
						}
				else {
					if((cpts[j] < 10))	
						System.out.print(centrerTexte(" "+cpts[j]+" ", 2));
					else 
						System.out.print(centrerTexte(""+cpts[j]+" ", 2)); 
						cpts [j]++;
					  }
			}System.out.print("  ");
		}System.out.println( );
	   }
	  }

}
