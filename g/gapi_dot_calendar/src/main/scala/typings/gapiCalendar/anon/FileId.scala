package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileId extends js.Object {
  var fileId: String
  var fileUrl: String
  var iconLink: String
  var mimeType: String
  var title: String
}

object FileId {
  @scala.inline
  def apply(fileId: String, fileUrl: String, iconLink: String, mimeType: String, title: String): FileId = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], fileUrl = fileUrl.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileId]
  }
}

