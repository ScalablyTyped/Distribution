package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcbRating extends StObject {
  
  /**
    * The videos Australian Classification Board (ACB) rating.
    */
  var acbRating: String
  
  /**
    * The videos British Board of Film Classification (BBFC) rating.
    */
  var bbfcRating: String
  
  /**
    * The videos Central Board of Film Certification (CBFC - India) rating.
    */
  var cbfcRating: String
  
  /**
    * The videos Canadian Home Video Rating System (CHVRS) rating.
    */
  var chvrsRating: String
  
  /**
    * The videos Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.
    */
  var djctqRating: String
  
  /**
    * The videos Eirin rating. Eirin is the Japanese rating system.
    */
  var eirinRating: String
  
  /**
    * The videos Centre national du cinéma et de limage animé (French Ministry of Culture) rating.
    */
  var fmocRating: String
  
  /**
    * The videos Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.
    */
  var fskRating: String
  
  /**
    * The videos Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.
    */
  var icaaRating: String
  
  /**
    * The videos Korea Media Rating Board rating. The KMRB rates videos in South Korea.
    */
  var kmrbRating: String
  
  /**
    * The videos Motion Picture Association of America (MPAA) rating.
    */
  var mpaaRating: String
  
  /**
    * The videos Office of Film and Literature Classification (OFLC - New Zealand) rating.
    */
  var oflcRating: String
  
  /**
    * The videos General Directorate of Radio, Television and Cinematography (Mexico) rating.
    */
  var rtcRating: String
  
  /**
    * The videos National Film Registry of the Russian Federation (MKRF - Russia) rating.
    */
  var russiaRating: String
  
  /**
    * The videos TV Parental Guidelines (TVPG) rating.
    */
  var tvpgRating: String
}
object AcbRating {
  
  @scala.inline
  def apply(
    acbRating: String,
    bbfcRating: String,
    cbfcRating: String,
    chvrsRating: String,
    djctqRating: String,
    eirinRating: String,
    fmocRating: String,
    fskRating: String,
    icaaRating: String,
    kmrbRating: String,
    mpaaRating: String,
    oflcRating: String,
    rtcRating: String,
    russiaRating: String,
    tvpgRating: String
  ): AcbRating = {
    val __obj = js.Dynamic.literal(acbRating = acbRating.asInstanceOf[js.Any], bbfcRating = bbfcRating.asInstanceOf[js.Any], cbfcRating = cbfcRating.asInstanceOf[js.Any], chvrsRating = chvrsRating.asInstanceOf[js.Any], djctqRating = djctqRating.asInstanceOf[js.Any], eirinRating = eirinRating.asInstanceOf[js.Any], fmocRating = fmocRating.asInstanceOf[js.Any], fskRating = fskRating.asInstanceOf[js.Any], icaaRating = icaaRating.asInstanceOf[js.Any], kmrbRating = kmrbRating.asInstanceOf[js.Any], mpaaRating = mpaaRating.asInstanceOf[js.Any], oflcRating = oflcRating.asInstanceOf[js.Any], rtcRating = rtcRating.asInstanceOf[js.Any], russiaRating = russiaRating.asInstanceOf[js.Any], tvpgRating = tvpgRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcbRating]
  }
  
  @scala.inline
  implicit class AcbRatingMutableBuilder[Self <: AcbRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcbRating(value: String): Self = StObject.set(x, "acbRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbfcRating(value: String): Self = StObject.set(x, "bbfcRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCbfcRating(value: String): Self = StObject.set(x, "cbfcRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChvrsRating(value: String): Self = StObject.set(x, "chvrsRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDjctqRating(value: String): Self = StObject.set(x, "djctqRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEirinRating(value: String): Self = StObject.set(x, "eirinRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmocRating(value: String): Self = StObject.set(x, "fmocRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFskRating(value: String): Self = StObject.set(x, "fskRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcaaRating(value: String): Self = StObject.set(x, "icaaRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmrbRating(value: String): Self = StObject.set(x, "kmrbRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpaaRating(value: String): Self = StObject.set(x, "mpaaRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOflcRating(value: String): Self = StObject.set(x, "oflcRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcRating(value: String): Self = StObject.set(x, "rtcRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRussiaRating(value: String): Self = StObject.set(x, "russiaRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvpgRating(value: String): Self = StObject.set(x, "tvpgRating", value.asInstanceOf[js.Any])
  }
}
