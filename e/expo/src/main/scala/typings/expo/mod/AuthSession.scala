package typings.expo.mod

import typings.expo.authSessionMod.AuthSessionOptions
import typings.expo.authSessionMod.AuthSessionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AuthSession")
@js.native
object AuthSession extends js.Object {
  var dismiss: js.Function0[Unit] = js.native
  var getDefaultReturnUrl: js.Function0[String] = js.native
  val getRedirectUri: js.Function0[String] = js.native
  var getRedirectUrl: js.Function0[String] = js.native
  var getStartUrl: js.Function2[/* authUrl */ String, /* returnUrl */ String, String] = js.native
  var startAsync: js.Function1[/* options */ AuthSessionOptions, js.Promise[AuthSessionResult]] = js.native
}

