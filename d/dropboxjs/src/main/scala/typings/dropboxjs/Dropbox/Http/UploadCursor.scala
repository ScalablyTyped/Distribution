package typings.dropboxjs.Dropbox.Http

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadCursor extends js.Object {
  var expiresAt: Date
  var offset: Double
  var tag: String
  def toJSON(): js.Object
}

object UploadCursor {
  @scala.inline
  def apply(expiresAt: Date, offset: Double, tag: String, toJSON: () => js.Object): UploadCursor = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[UploadCursor]
  }
}

