package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareUrl extends js.Object {
  var expiresAt: Date
  var isDirect: Boolean
  var isPreview: Boolean
  var url: String
  def toJSON(): js.Object
}

object ShareUrl {
  @scala.inline
  def apply(expiresAt: Date, isDirect: Boolean, isPreview: Boolean, toJSON: () => js.Object, url: String): ShareUrl = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], isDirect = isDirect.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareUrl]
  }
}

