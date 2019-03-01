package typings
package dropboxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RememberUser extends js.Object {
  var rememberUser: scala.Boolean
  var scope: java.lang.String
}

object Anon_RememberUser {
  @scala.inline
  def apply(rememberUser: scala.Boolean, scope: java.lang.String): Anon_RememberUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rememberUser")(rememberUser)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_RememberUser]
  }
}

