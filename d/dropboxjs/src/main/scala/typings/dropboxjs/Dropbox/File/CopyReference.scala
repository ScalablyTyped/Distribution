package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyReference extends js.Object {
  var expiresAt: Date
  var tag: String
  def toJSON(): js.Object
}

object CopyReference {
  @scala.inline
  def apply(expiresAt: Date, tag: String, toJSON: () => js.Object): CopyReference = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CopyReference]
  }
}

