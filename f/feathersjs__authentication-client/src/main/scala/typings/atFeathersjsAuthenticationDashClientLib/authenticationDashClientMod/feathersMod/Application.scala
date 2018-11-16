package typings
package atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var passport: atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.Passport = js.native
  def authenticate(): stdLib.Promise[_] = js.native
  def authenticate(
    options: atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.FeathersAuthCredentials
  ): stdLib.Promise[_] = js.native
  def logout(): stdLib.Promise[scala.Unit] = js.native
}

