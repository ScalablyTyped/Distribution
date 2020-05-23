package typings.feathersjsAuthenticationLocal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var passwordField: String
  var usernameField: String
}

object Name {
  @scala.inline
  def apply(name: String, passwordField: String, usernameField: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

