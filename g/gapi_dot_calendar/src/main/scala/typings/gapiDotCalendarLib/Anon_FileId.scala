package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileId extends js.Object {
  var fileId: java.lang.String
  var fileUrl: java.lang.String
  var iconLink: java.lang.String
  var mimeType: java.lang.String
  var title: java.lang.String
}

object Anon_FileId {
  @scala.inline
  def apply(
    fileId: java.lang.String,
    fileUrl: java.lang.String,
    iconLink: java.lang.String,
    mimeType: java.lang.String,
    title: java.lang.String
  ): Anon_FileId = {
    val __obj = js.Dynamic.literal(fileId = fileId, fileUrl = fileUrl, iconLink = iconLink, mimeType = mimeType, title = title)
  
    __obj.asInstanceOf[Anon_FileId]
  }
}

