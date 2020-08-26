package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcbRating extends js.Object {
  /**
    * The videos Australian Classification Board (ACB) rating.
    */
  var acbRating: String = js.native
  /**
    * The videos British Board of Film Classification (BBFC) rating.
    */
  var bbfcRating: String = js.native
  /**
    * The videos Central Board of Film Certification (CBFC - India) rating.
    */
  var cbfcRating: String = js.native
  /**
    * The videos Canadian Home Video Rating System (CHVRS) rating.
    */
  var chvrsRating: String = js.native
  /**
    * The videos Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.
    */
  var djctqRating: String = js.native
  /**
    * The videos Eirin rating. Eirin is the Japanese rating system.
    */
  var eirinRating: String = js.native
  /**
    * The videos Centre national du cinéma et de limage animé (French Ministry of Culture) rating.
    */
  var fmocRating: String = js.native
  /**
    * The videos Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.
    */
  var fskRating: String = js.native
  /**
    * The videos Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.
    */
  var icaaRating: String = js.native
  /**
    * The videos Korea Media Rating Board rating. The KMRB rates videos in South Korea.
    */
  var kmrbRating: String = js.native
  /**
    * The videos Motion Picture Association of America (MPAA) rating.
    */
  var mpaaRating: String = js.native
  /**
    * The videos Office of Film and Literature Classification (OFLC - New Zealand) rating.
    */
  var oflcRating: String = js.native
  /**
    * The videos General Directorate of Radio, Television and Cinematography (Mexico) rating.
    */
  var rtcRating: String = js.native
  /**
    * The videos National Film Registry of the Russian Federation (MKRF - Russia) rating.
    */
  var russiaRating: String = js.native
  /**
    * The videos TV Parental Guidelines (TVPG) rating.
    */
  var tvpgRating: String = js.native
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
  implicit class AcbRatingOps[Self <: AcbRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcbRating(value: String): Self = this.set("acbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbfcRating(value: String): Self = this.set("bbfcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setCbfcRating(value: String): Self = this.set("cbfcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setChvrsRating(value: String): Self = this.set("chvrsRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setDjctqRating(value: String): Self = this.set("djctqRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setEirinRating(value: String): Self = this.set("eirinRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setFmocRating(value: String): Self = this.set("fmocRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setFskRating(value: String): Self = this.set("fskRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcaaRating(value: String): Self = this.set("icaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmrbRating(value: String): Self = this.set("kmrbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpaaRating(value: String): Self = this.set("mpaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setOflcRating(value: String): Self = this.set("oflcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtcRating(value: String): Self = this.set("rtcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setRussiaRating(value: String): Self = this.set("russiaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvpgRating(value: String): Self = this.set("tvpgRating", value.asInstanceOf[js.Any])
  }
  
}

