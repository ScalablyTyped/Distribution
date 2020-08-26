package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRating extends js.Object {
  var acbRating: js.UndefOr[String] = js.native
  var agcomRating: js.UndefOr[String] = js.native
  var anatelRating: js.UndefOr[String] = js.native
  var bbfcRating: js.UndefOr[String] = js.native
  var bfvcRating: js.UndefOr[String] = js.native
  var bmukkRating: js.UndefOr[String] = js.native
  var catvRating: js.UndefOr[String] = js.native
  var catvfrRating: js.UndefOr[String] = js.native
  var cbfcRating: js.UndefOr[String] = js.native
  var cccRating: js.UndefOr[String] = js.native
  var cceRating: js.UndefOr[String] = js.native
  var chfilmRating: js.UndefOr[String] = js.native
  var chvrsRating: js.UndefOr[String] = js.native
  var cicfRating: js.UndefOr[String] = js.native
  var cnaRating: js.UndefOr[String] = js.native
  var cncRating: js.UndefOr[String] = js.native
  var csaRating: js.UndefOr[String] = js.native
  var cscfRating: js.UndefOr[String] = js.native
  var czfilmRating: js.UndefOr[String] = js.native
  var djctqRating: js.UndefOr[String] = js.native
  var djctqRatingReasons: js.UndefOr[js.Array[String]] = js.native
  var ecbmctRating: js.UndefOr[String] = js.native
  var eefilmRating: js.UndefOr[String] = js.native
  var egfilmRating: js.UndefOr[String] = js.native
  var eirinRating: js.UndefOr[String] = js.native
  var fcbmRating: js.UndefOr[String] = js.native
  var fcoRating: js.UndefOr[String] = js.native
  var fmocRating: js.UndefOr[String] = js.native
  var fpbRating: js.UndefOr[String] = js.native
  var fpbRatingReasons: js.UndefOr[js.Array[String]] = js.native
  var fskRating: js.UndefOr[String] = js.native
  var grfilmRating: js.UndefOr[String] = js.native
  var icaaRating: js.UndefOr[String] = js.native
  var ifcoRating: js.UndefOr[String] = js.native
  var ilfilmRating: js.UndefOr[String] = js.native
  var incaaRating: js.UndefOr[String] = js.native
  var kfcbRating: js.UndefOr[String] = js.native
  var kijkwijzerRating: js.UndefOr[String] = js.native
  var kmrbRating: js.UndefOr[String] = js.native
  var lsfRating: js.UndefOr[String] = js.native
  var mccaaRating: js.UndefOr[String] = js.native
  var mccypRating: js.UndefOr[String] = js.native
  var mcstRating: js.UndefOr[String] = js.native
  var mdaRating: js.UndefOr[String] = js.native
  var medietilsynetRating: js.UndefOr[String] = js.native
  var mekuRating: js.UndefOr[String] = js.native
  var menaMpaaRating: js.UndefOr[String] = js.native
  var mibacRating: js.UndefOr[String] = js.native
  var mocRating: js.UndefOr[String] = js.native
  var moctwRating: js.UndefOr[String] = js.native
  var mpaaRating: js.UndefOr[String] = js.native
  var mpaatRating: js.UndefOr[String] = js.native
  var mtrcbRating: js.UndefOr[String] = js.native
  var nbcRating: js.UndefOr[String] = js.native
  var nbcplRating: js.UndefOr[String] = js.native
  var nfrcRating: js.UndefOr[String] = js.native
  var nfvcbRating: js.UndefOr[String] = js.native
  var nkclvRating: js.UndefOr[String] = js.native
  var oflcRating: js.UndefOr[String] = js.native
  var pefilmRating: js.UndefOr[String] = js.native
  var rcnofRating: js.UndefOr[String] = js.native
  var resorteviolenciaRating: js.UndefOr[String] = js.native
  var rtcRating: js.UndefOr[String] = js.native
  var rteRating: js.UndefOr[String] = js.native
  var russiaRating: js.UndefOr[String] = js.native
  var skfilmRating: js.UndefOr[String] = js.native
  var smaisRating: js.UndefOr[String] = js.native
  var smsaRating: js.UndefOr[String] = js.native
  var tvpgRating: js.UndefOr[String] = js.native
  var ytRating: js.UndefOr[String] = js.native
}

object ContentRating {
  @scala.inline
  def apply(): ContentRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRating]
  }
  @scala.inline
  implicit class ContentRatingOps[Self <: ContentRating] (val x: Self) extends AnyVal {
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
    def deleteAcbRating: Self = this.set("acbRating", js.undefined)
    @scala.inline
    def setAgcomRating(value: String): Self = this.set("agcomRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgcomRating: Self = this.set("agcomRating", js.undefined)
    @scala.inline
    def setAnatelRating(value: String): Self = this.set("anatelRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnatelRating: Self = this.set("anatelRating", js.undefined)
    @scala.inline
    def setBbfcRating(value: String): Self = this.set("bbfcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbfcRating: Self = this.set("bbfcRating", js.undefined)
    @scala.inline
    def setBfvcRating(value: String): Self = this.set("bfvcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBfvcRating: Self = this.set("bfvcRating", js.undefined)
    @scala.inline
    def setBmukkRating(value: String): Self = this.set("bmukkRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmukkRating: Self = this.set("bmukkRating", js.undefined)
    @scala.inline
    def setCatvRating(value: String): Self = this.set("catvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatvRating: Self = this.set("catvRating", js.undefined)
    @scala.inline
    def setCatvfrRating(value: String): Self = this.set("catvfrRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatvfrRating: Self = this.set("catvfrRating", js.undefined)
    @scala.inline
    def setCbfcRating(value: String): Self = this.set("cbfcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCbfcRating: Self = this.set("cbfcRating", js.undefined)
    @scala.inline
    def setCccRating(value: String): Self = this.set("cccRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCccRating: Self = this.set("cccRating", js.undefined)
    @scala.inline
    def setCceRating(value: String): Self = this.set("cceRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCceRating: Self = this.set("cceRating", js.undefined)
    @scala.inline
    def setChfilmRating(value: String): Self = this.set("chfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChfilmRating: Self = this.set("chfilmRating", js.undefined)
    @scala.inline
    def setChvrsRating(value: String): Self = this.set("chvrsRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChvrsRating: Self = this.set("chvrsRating", js.undefined)
    @scala.inline
    def setCicfRating(value: String): Self = this.set("cicfRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCicfRating: Self = this.set("cicfRating", js.undefined)
    @scala.inline
    def setCnaRating(value: String): Self = this.set("cnaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCnaRating: Self = this.set("cnaRating", js.undefined)
    @scala.inline
    def setCncRating(value: String): Self = this.set("cncRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCncRating: Self = this.set("cncRating", js.undefined)
    @scala.inline
    def setCsaRating(value: String): Self = this.set("csaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsaRating: Self = this.set("csaRating", js.undefined)
    @scala.inline
    def setCscfRating(value: String): Self = this.set("cscfRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscfRating: Self = this.set("cscfRating", js.undefined)
    @scala.inline
    def setCzfilmRating(value: String): Self = this.set("czfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCzfilmRating: Self = this.set("czfilmRating", js.undefined)
    @scala.inline
    def setDjctqRating(value: String): Self = this.set("djctqRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDjctqRating: Self = this.set("djctqRating", js.undefined)
    @scala.inline
    def setDjctqRatingReasonsVarargs(value: String*): Self = this.set("djctqRatingReasons", js.Array(value :_*))
    @scala.inline
    def setDjctqRatingReasons(value: js.Array[String]): Self = this.set("djctqRatingReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDjctqRatingReasons: Self = this.set("djctqRatingReasons", js.undefined)
    @scala.inline
    def setEcbmctRating(value: String): Self = this.set("ecbmctRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcbmctRating: Self = this.set("ecbmctRating", js.undefined)
    @scala.inline
    def setEefilmRating(value: String): Self = this.set("eefilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEefilmRating: Self = this.set("eefilmRating", js.undefined)
    @scala.inline
    def setEgfilmRating(value: String): Self = this.set("egfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgfilmRating: Self = this.set("egfilmRating", js.undefined)
    @scala.inline
    def setEirinRating(value: String): Self = this.set("eirinRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEirinRating: Self = this.set("eirinRating", js.undefined)
    @scala.inline
    def setFcbmRating(value: String): Self = this.set("fcbmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFcbmRating: Self = this.set("fcbmRating", js.undefined)
    @scala.inline
    def setFcoRating(value: String): Self = this.set("fcoRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFcoRating: Self = this.set("fcoRating", js.undefined)
    @scala.inline
    def setFmocRating(value: String): Self = this.set("fmocRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFmocRating: Self = this.set("fmocRating", js.undefined)
    @scala.inline
    def setFpbRating(value: String): Self = this.set("fpbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpbRating: Self = this.set("fpbRating", js.undefined)
    @scala.inline
    def setFpbRatingReasonsVarargs(value: String*): Self = this.set("fpbRatingReasons", js.Array(value :_*))
    @scala.inline
    def setFpbRatingReasons(value: js.Array[String]): Self = this.set("fpbRatingReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpbRatingReasons: Self = this.set("fpbRatingReasons", js.undefined)
    @scala.inline
    def setFskRating(value: String): Self = this.set("fskRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFskRating: Self = this.set("fskRating", js.undefined)
    @scala.inline
    def setGrfilmRating(value: String): Self = this.set("grfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrfilmRating: Self = this.set("grfilmRating", js.undefined)
    @scala.inline
    def setIcaaRating(value: String): Self = this.set("icaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcaaRating: Self = this.set("icaaRating", js.undefined)
    @scala.inline
    def setIfcoRating(value: String): Self = this.set("ifcoRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfcoRating: Self = this.set("ifcoRating", js.undefined)
    @scala.inline
    def setIlfilmRating(value: String): Self = this.set("ilfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIlfilmRating: Self = this.set("ilfilmRating", js.undefined)
    @scala.inline
    def setIncaaRating(value: String): Self = this.set("incaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncaaRating: Self = this.set("incaaRating", js.undefined)
    @scala.inline
    def setKfcbRating(value: String): Self = this.set("kfcbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKfcbRating: Self = this.set("kfcbRating", js.undefined)
    @scala.inline
    def setKijkwijzerRating(value: String): Self = this.set("kijkwijzerRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKijkwijzerRating: Self = this.set("kijkwijzerRating", js.undefined)
    @scala.inline
    def setKmrbRating(value: String): Self = this.set("kmrbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmrbRating: Self = this.set("kmrbRating", js.undefined)
    @scala.inline
    def setLsfRating(value: String): Self = this.set("lsfRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLsfRating: Self = this.set("lsfRating", js.undefined)
    @scala.inline
    def setMccaaRating(value: String): Self = this.set("mccaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMccaaRating: Self = this.set("mccaaRating", js.undefined)
    @scala.inline
    def setMccypRating(value: String): Self = this.set("mccypRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMccypRating: Self = this.set("mccypRating", js.undefined)
    @scala.inline
    def setMcstRating(value: String): Self = this.set("mcstRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMcstRating: Self = this.set("mcstRating", js.undefined)
    @scala.inline
    def setMdaRating(value: String): Self = this.set("mdaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdaRating: Self = this.set("mdaRating", js.undefined)
    @scala.inline
    def setMedietilsynetRating(value: String): Self = this.set("medietilsynetRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedietilsynetRating: Self = this.set("medietilsynetRating", js.undefined)
    @scala.inline
    def setMekuRating(value: String): Self = this.set("mekuRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMekuRating: Self = this.set("mekuRating", js.undefined)
    @scala.inline
    def setMenaMpaaRating(value: String): Self = this.set("menaMpaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenaMpaaRating: Self = this.set("menaMpaaRating", js.undefined)
    @scala.inline
    def setMibacRating(value: String): Self = this.set("mibacRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMibacRating: Self = this.set("mibacRating", js.undefined)
    @scala.inline
    def setMocRating(value: String): Self = this.set("mocRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocRating: Self = this.set("mocRating", js.undefined)
    @scala.inline
    def setMoctwRating(value: String): Self = this.set("moctwRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoctwRating: Self = this.set("moctwRating", js.undefined)
    @scala.inline
    def setMpaaRating(value: String): Self = this.set("mpaaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpaaRating: Self = this.set("mpaaRating", js.undefined)
    @scala.inline
    def setMpaatRating(value: String): Self = this.set("mpaatRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpaatRating: Self = this.set("mpaatRating", js.undefined)
    @scala.inline
    def setMtrcbRating(value: String): Self = this.set("mtrcbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtrcbRating: Self = this.set("mtrcbRating", js.undefined)
    @scala.inline
    def setNbcRating(value: String): Self = this.set("nbcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNbcRating: Self = this.set("nbcRating", js.undefined)
    @scala.inline
    def setNbcplRating(value: String): Self = this.set("nbcplRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNbcplRating: Self = this.set("nbcplRating", js.undefined)
    @scala.inline
    def setNfrcRating(value: String): Self = this.set("nfrcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfrcRating: Self = this.set("nfrcRating", js.undefined)
    @scala.inline
    def setNfvcbRating(value: String): Self = this.set("nfvcbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfvcbRating: Self = this.set("nfvcbRating", js.undefined)
    @scala.inline
    def setNkclvRating(value: String): Self = this.set("nkclvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNkclvRating: Self = this.set("nkclvRating", js.undefined)
    @scala.inline
    def setOflcRating(value: String): Self = this.set("oflcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOflcRating: Self = this.set("oflcRating", js.undefined)
    @scala.inline
    def setPefilmRating(value: String): Self = this.set("pefilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePefilmRating: Self = this.set("pefilmRating", js.undefined)
    @scala.inline
    def setRcnofRating(value: String): Self = this.set("rcnofRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRcnofRating: Self = this.set("rcnofRating", js.undefined)
    @scala.inline
    def setResorteviolenciaRating(value: String): Self = this.set("resorteviolenciaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResorteviolenciaRating: Self = this.set("resorteviolenciaRating", js.undefined)
    @scala.inline
    def setRtcRating(value: String): Self = this.set("rtcRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtcRating: Self = this.set("rtcRating", js.undefined)
    @scala.inline
    def setRteRating(value: String): Self = this.set("rteRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRteRating: Self = this.set("rteRating", js.undefined)
    @scala.inline
    def setRussiaRating(value: String): Self = this.set("russiaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRussiaRating: Self = this.set("russiaRating", js.undefined)
    @scala.inline
    def setSkfilmRating(value: String): Self = this.set("skfilmRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkfilmRating: Self = this.set("skfilmRating", js.undefined)
    @scala.inline
    def setSmaisRating(value: String): Self = this.set("smaisRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmaisRating: Self = this.set("smaisRating", js.undefined)
    @scala.inline
    def setSmsaRating(value: String): Self = this.set("smsaRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsaRating: Self = this.set("smsaRating", js.undefined)
    @scala.inline
    def setTvpgRating(value: String): Self = this.set("tvpgRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvpgRating: Self = this.set("tvpgRating", js.undefined)
    @scala.inline
    def setYtRating(value: String): Self = this.set("ytRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYtRating: Self = this.set("ytRating", js.undefined)
  }
  
}

