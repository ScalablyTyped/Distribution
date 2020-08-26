package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.native
  var ocr: js.UndefOr[Boolean] = js.native
  var ocrLanguage: js.UndefOr[String] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  var timedTextLanguage: js.UndefOr[String] = js.native
  var timedTextTrackName: js.UndefOr[String] = js.native
  var uploadType: String = js.native
  var usecontentAsIndexableText: js.UndefOr[Boolean] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object InsertParameters {
  @scala.inline
  def apply(uploadType: String): InsertParameters = {
    val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertParameters]
  }
  @scala.inline
  implicit class InsertParametersOps[Self <: InsertParameters] (val x: Self) extends AnyVal {
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
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setOcr(value: Boolean): Self = this.set("ocr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcr: Self = this.set("ocr", js.undefined)
    @scala.inline
    def setOcrLanguage(value: String): Self = this.set("ocrLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcrLanguage: Self = this.set("ocrLanguage", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTimedTextLanguage(value: String): Self = this.set("timedTextLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedTextLanguage: Self = this.set("timedTextLanguage", js.undefined)
    @scala.inline
    def setTimedTextTrackName(value: String): Self = this.set("timedTextTrackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedTextTrackName: Self = this.set("timedTextTrackName", js.undefined)
    @scala.inline
    def setUsecontentAsIndexableText(value: Boolean): Self = this.set("usecontentAsIndexableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsecontentAsIndexableText: Self = this.set("usecontentAsIndexableText", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

