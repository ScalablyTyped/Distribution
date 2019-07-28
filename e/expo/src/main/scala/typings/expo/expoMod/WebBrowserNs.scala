package typings.expo.expoMod

import typings.expo.expoMod.WebBrowserNs.AuthSessionResult
import typings.expo.expoMod.WebBrowserNs.BrowserResult
import typings.expo.expoMod.WebBrowserNs.RedirectResult
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.dismiss
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "WebBrowser")
@js.native
object WebBrowserNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoMod.WebBrowserNs.RedirectResult
    - typings.expo.expoMod.WebBrowserNs.BrowserResult
  */
  trait AuthSessionResult extends js.Object
  
  trait BrowserResult extends AuthSessionResult {
    var `type`: cancel | dismiss
  }
  
  trait RedirectResult extends AuthSessionResult {
    var `type`: success
    var url: String
  }
  
  def dismissBrowser(): Unit = js.native
  def openAuthSessionAsync(url: String): js.Promise[RedirectResult | BrowserResult] = js.native
  def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[RedirectResult | BrowserResult] = js.native
  def openBrowserAsync(url: String): js.Promise[BrowserResult] = js.native
}

