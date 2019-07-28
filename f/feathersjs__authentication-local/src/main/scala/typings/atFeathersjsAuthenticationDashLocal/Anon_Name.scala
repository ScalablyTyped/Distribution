package typings.atFeathersjsAuthenticationDashLocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var passwordField: String
  var usernameField: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, passwordField: String, usernameField: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, passwordField = passwordField, usernameField = usernameField)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

