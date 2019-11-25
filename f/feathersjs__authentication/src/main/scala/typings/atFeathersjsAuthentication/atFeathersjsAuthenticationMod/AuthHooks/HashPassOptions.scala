package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.AuthHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashPassOptions extends js.Object {
  var passwordField: String
}

object HashPassOptions {
  @scala.inline
  def apply(passwordField: String): HashPassOptions = {
    val __obj = js.Dynamic.literal(passwordField = passwordField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashPassOptions]
  }
}

