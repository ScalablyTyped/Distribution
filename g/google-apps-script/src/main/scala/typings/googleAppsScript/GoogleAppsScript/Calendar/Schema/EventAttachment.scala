package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAttachment extends js.Object {
  var fileId: js.UndefOr[String] = js.native
  var fileUrl: js.UndefOr[String] = js.native
  var iconLink: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object EventAttachment {
  @scala.inline
  def apply(): EventAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttachment]
  }
  @scala.inline
  implicit class EventAttachmentOps[Self <: EventAttachment] (val x: Self) extends AnyVal {
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
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setFileUrl(value: String): Self = this.set("fileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUrl: Self = this.set("fileUrl", js.undefined)
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

