package typings
package atFeathersjsAuthenticationDashLocalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var passwordField: java.lang.String
  var usernameField: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, passwordField: java.lang.String, usernameField: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("passwordField")(passwordField)
    __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Anon_Name]
  }
}

