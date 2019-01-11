package typings
package atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var passport: atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod.Passport = js.native
  def authenticate(): js.Promise[_] = js.native
  def authenticate(
    options: atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod.FeathersAuthCredentials
  ): js.Promise[_] = js.native
  def logout(): js.Promise[scala.Unit] = js.native
}

