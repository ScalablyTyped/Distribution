package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileId extends js.Object {
  var fileId: String = js.native
  var fileUrl: String = js.native
  var iconLink: String = js.native
  var mimeType: String = js.native
  var title: String = js.native
}

object FileId {
  @scala.inline
  def apply(fileId: String, fileUrl: String, iconLink: String, mimeType: String, title: String): FileId = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], fileUrl = fileUrl.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileId]
  }
  @scala.inline
  implicit class FileIdOps[Self <: FileId] (val x: Self) extends AnyVal {
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
    def setFileUrl(value: String): Self = this.set("fileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

