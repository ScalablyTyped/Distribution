package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthError extends js.Object {
  var code: String
  var description: String
  var uri: String
}

object AuthError {
  @scala.inline
  def apply(code: String, description: String, uri: String): AuthError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthError]
  }
}

