package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.native
  var fileId: String = js.native
  var modifiedDateBehavior: js.UndefOr[String] = js.native
  var newRevision: js.UndefOr[Boolean] = js.native
  var ocr: js.UndefOr[Boolean] = js.native
  var ocrLanguage: js.UndefOr[String] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var removeParents: js.UndefOr[String] = js.native
  var resource: js.UndefOr[FileResource] = js.native
  var setModifiedDate: js.UndefOr[Boolean] = js.native
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  var timedTextLanguage: js.UndefOr[String] = js.native
  var timedTextTrackName: js.UndefOr[String] = js.native
  var updateViewedData: js.UndefOr[Boolean] = js.native
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}

object PatchParameters {
  @scala.inline
  def apply(fileId: String): PatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParameters]
  }
  @scala.inline
  implicit class PatchParametersOps[Self <: PatchParameters] (val x: Self) extends AnyVal {
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setModifiedDateBehavior(value: String): Self = this.set("modifiedDateBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedDateBehavior: Self = this.set("modifiedDateBehavior", js.undefined)
    @scala.inline
    def setNewRevision(value: Boolean): Self = this.set("newRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewRevision: Self = this.set("newRevision", js.undefined)
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
    def setRemoveParents(value: String): Self = this.set("removeParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveParents: Self = this.set("removeParents", js.undefined)
    @scala.inline
    def setResource(value: FileResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setSetModifiedDate(value: Boolean): Self = this.set("setModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetModifiedDate: Self = this.set("setModifiedDate", js.undefined)
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
    def setUpdateViewedData(value: Boolean): Self = this.set("updateViewedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateViewedData: Self = this.set("updateViewedData", js.undefined)
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = this.set("useContentAsIndexableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContentAsIndexableText: Self = this.set("useContentAsIndexableText", js.undefined)
  }
  
}

