package typings.ffmpeg.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  IARL :string,   IART :string,   ICMS :string,   ICMT :string,   ICOP :string,   ICRD :string | std.Date,   ICRP :string,   IDIM :string,   IDPI :string,   IENG :string,   IGNR :string,   IKEY :string,   ILGT :string,   ILNG :string,   IMED :string,   INAM :string,   IPLT :string,   IPRD :string,   ISBJ :string,   ISFT :string,   ISHP :string,   ISRC :string,   ISRF :string,   ITCH :string}> */
@js.native
trait AVIMetadata extends js.Object {
  var IARL: js.UndefOr[String] = js.native
  var IART: js.UndefOr[String] = js.native
  var ICMS: js.UndefOr[String] = js.native
  var ICMT: js.UndefOr[String] = js.native
  var ICOP: js.UndefOr[String] = js.native
  var ICRD: js.UndefOr[String | Date] = js.native
  var ICRP: js.UndefOr[String] = js.native
  var IDIM: js.UndefOr[String] = js.native
  var IDPI: js.UndefOr[String] = js.native
  var IENG: js.UndefOr[String] = js.native
  var IGNR: js.UndefOr[String] = js.native
  var IKEY: js.UndefOr[String] = js.native
  var ILGT: js.UndefOr[String] = js.native
  var ILNG: js.UndefOr[String] = js.native
  var IMED: js.UndefOr[String] = js.native
  var INAM: js.UndefOr[String] = js.native
  var IPLT: js.UndefOr[String] = js.native
  var IPRD: js.UndefOr[String] = js.native
  var ISBJ: js.UndefOr[String] = js.native
  var ISFT: js.UndefOr[String] = js.native
  var ISHP: js.UndefOr[String] = js.native
  var ISRC: js.UndefOr[String] = js.native
  var ISRF: js.UndefOr[String] = js.native
  var ITCH: js.UndefOr[String] = js.native
}

object AVIMetadata {
  @scala.inline
  def apply(): AVIMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AVIMetadata]
  }
  @scala.inline
  implicit class AVIMetadataOps[Self <: AVIMetadata] (val x: Self) extends AnyVal {
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
    def setIARL(value: String): Self = this.set("IARL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIARL: Self = this.set("IARL", js.undefined)
    @scala.inline
    def setIART(value: String): Self = this.set("IART", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIART: Self = this.set("IART", js.undefined)
    @scala.inline
    def setICMS(value: String): Self = this.set("ICMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICMS: Self = this.set("ICMS", js.undefined)
    @scala.inline
    def setICMT(value: String): Self = this.set("ICMT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICMT: Self = this.set("ICMT", js.undefined)
    @scala.inline
    def setICOP(value: String): Self = this.set("ICOP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICOP: Self = this.set("ICOP", js.undefined)
    @scala.inline
    def setICRD(value: String | Date): Self = this.set("ICRD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICRD: Self = this.set("ICRD", js.undefined)
    @scala.inline
    def setICRP(value: String): Self = this.set("ICRP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICRP: Self = this.set("ICRP", js.undefined)
    @scala.inline
    def setIDIM(value: String): Self = this.set("IDIM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIDIM: Self = this.set("IDIM", js.undefined)
    @scala.inline
    def setIDPI(value: String): Self = this.set("IDPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIDPI: Self = this.set("IDPI", js.undefined)
    @scala.inline
    def setIENG(value: String): Self = this.set("IENG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIENG: Self = this.set("IENG", js.undefined)
    @scala.inline
    def setIGNR(value: String): Self = this.set("IGNR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIGNR: Self = this.set("IGNR", js.undefined)
    @scala.inline
    def setIKEY(value: String): Self = this.set("IKEY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIKEY: Self = this.set("IKEY", js.undefined)
    @scala.inline
    def setILGT(value: String): Self = this.set("ILGT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteILGT: Self = this.set("ILGT", js.undefined)
    @scala.inline
    def setILNG(value: String): Self = this.set("ILNG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteILNG: Self = this.set("ILNG", js.undefined)
    @scala.inline
    def setIMED(value: String): Self = this.set("IMED", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIMED: Self = this.set("IMED", js.undefined)
    @scala.inline
    def setINAM(value: String): Self = this.set("INAM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteINAM: Self = this.set("INAM", js.undefined)
    @scala.inline
    def setIPLT(value: String): Self = this.set("IPLT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPLT: Self = this.set("IPLT", js.undefined)
    @scala.inline
    def setIPRD(value: String): Self = this.set("IPRD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPRD: Self = this.set("IPRD", js.undefined)
    @scala.inline
    def setISBJ(value: String): Self = this.set("ISBJ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISBJ: Self = this.set("ISBJ", js.undefined)
    @scala.inline
    def setISFT(value: String): Self = this.set("ISFT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISFT: Self = this.set("ISFT", js.undefined)
    @scala.inline
    def setISHP(value: String): Self = this.set("ISHP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISHP: Self = this.set("ISHP", js.undefined)
    @scala.inline
    def setISRC(value: String): Self = this.set("ISRC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISRC: Self = this.set("ISRC", js.undefined)
    @scala.inline
    def setISRF(value: String): Self = this.set("ISRF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISRF: Self = this.set("ISRF", js.undefined)
    @scala.inline
    def setITCH(value: String): Self = this.set("ITCH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteITCH: Self = this.set("ITCH", js.undefined)
  }
  
}

