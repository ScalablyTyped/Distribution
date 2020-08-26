package typings.evernote.anon

import typings.evernote.mod.Types.Data
import typings.evernote.mod.Types.ResourceAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlternateData extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var alternateData: js.UndefOr[Data] = js.native
  var attributes: js.UndefOr[ResourceAttributes] = js.native
  var data: js.UndefOr[Data] = js.native
  var duration: js.UndefOr[Double] = js.native
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var height: js.UndefOr[Double] = js.native
  var mime: js.UndefOr[String] = js.native
  var noteguid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var recognition: js.UndefOr[Data] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AlternateData {
  @scala.inline
  def apply(): AlternateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateData]
  }
  @scala.inline
  implicit class AlternateDataOps[Self <: AlternateData] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlternateData(value: Data): Self = this.set("alternateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateData: Self = this.set("alternateData", js.undefined)
    @scala.inline
    def setAttributes(value: ResourceAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setNoteguid(value: typings.evernote.mod.Types.Guid): Self = this.set("noteguid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteguid: Self = this.set("noteguid", js.undefined)
    @scala.inline
    def setRecognition(value: Data): Self = this.set("recognition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecognition: Self = this.set("recognition", js.undefined)
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

