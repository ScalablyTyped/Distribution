package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Options */
trait AuthenticateOptions extends js.Object {
  var interactive: Boolean
}

object AuthenticateOptions {
  @scala.inline
  def apply(interactive: Boolean): AuthenticateOptions = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

