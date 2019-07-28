package typings.atFeathersjsAuthenticationDashClient.atFeathersjsAuthenticationDashClientMod.atFeathersjsFeathersMod

import typings.atFeathersjsAuthenticationDashClient.atFeathersjsAuthenticationDashClientMod.FeathersAuthCredentials
import typings.atFeathersjsAuthenticationDashClient.atFeathersjsAuthenticationDashClientMod.Passport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var passport: Passport = js.native
  def authenticate(): js.Promise[_] = js.native
  def authenticate(options: FeathersAuthCredentials): js.Promise[_] = js.native
  def logout(): js.Promise[Unit] = js.native
}

