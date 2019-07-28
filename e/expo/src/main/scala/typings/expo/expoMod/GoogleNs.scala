package typings.expo.expoMod

import typings.expo.Anon_Email
import typings.expo.expoMod.GoogleNs.LogInConfig
import typings.expo.expoMod.GoogleNs.LogInResult
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.success
import typings.expo.expoStrings.system
import typings.expo.expoStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Google")
@js.native
object GoogleNs extends js.Object {
  trait LogInConfig extends js.Object {
    var androidClientId: js.UndefOr[String] = js.undefined
    var androidStandaloneAppClientId: js.UndefOr[String] = js.undefined
    var behavior: js.UndefOr[system | web] = js.undefined
    var iosClientId: js.UndefOr[String] = js.undefined
    var iosStandaloneAppClientId: js.UndefOr[String] = js.undefined
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    var webClientId: js.UndefOr[String] = js.undefined
  }
  
  trait LogInResult extends js.Object {
    var accessToken: js.UndefOr[String] = js.undefined
    var idToken: js.UndefOr[String] = js.undefined
    var refreshToken: js.UndefOr[String] = js.undefined
    var serverAuthCode: js.UndefOr[String] = js.undefined
    var `type`: js.UndefOr[cancel | success] = js.undefined
    var user: js.UndefOr[Anon_Email] = js.undefined
  }
  
  def logInAsync(config: LogInConfig): js.Promise[LogInResult] = js.native
}

