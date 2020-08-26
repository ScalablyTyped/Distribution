package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Options */
@js.native
trait AuthenticateOptions extends js.Object {
  var interactive: Boolean = js.native
}

object AuthenticateOptions {
  @scala.inline
  def apply(interactive: Boolean): AuthenticateOptions = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
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
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
  }
  
}

