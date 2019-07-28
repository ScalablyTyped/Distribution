package typings.gapiDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileId extends js.Object {
  var fileId: String
  var fileUrl: String
  var iconLink: String
  var mimeType: String
  var title: String
}

object Anon_FileId {
  @scala.inline
  def apply(fileId: String, fileUrl: String, iconLink: String, mimeType: String, title: String): Anon_FileId = {
    val __obj = js.Dynamic.literal(fileId = fileId, fileUrl = fileUrl, iconLink = iconLink, mimeType = mimeType, title = title)
  
    __obj.asInstanceOf[Anon_FileId]
  }
}

