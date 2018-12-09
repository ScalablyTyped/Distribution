package typings
package atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var passport: atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.Passport = js.native
  def authenticate(): js.Promise[_] = js.native
  def authenticate(
    options: atFeathersjsAuthenticationDashClientLib.authenticationDashClientMod.FeathersAuthCredentials
  ): js.Promise[_] = js.native
  def logout(): js.Promise[scala.Unit] = js.native
}

