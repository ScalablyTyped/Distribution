package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "WebBrowser")
@js.native
object WebBrowserNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - RedirectResult
    - BrowserResult
  */
  trait AuthSessionResult extends js.Object
  
  trait BrowserResult extends AuthSessionResult {
    var `type`: expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.dismiss
  }
  
  trait RedirectResult extends AuthSessionResult {
    var `type`: expoLib.expoLibStrings.success
    var url: java.lang.String
  }
  
  def dismissBrowser(): scala.Unit = js.native
  def openAuthSessionAsync(url: java.lang.String): js.Promise[RedirectResult | BrowserResult] = js.native
  def openAuthSessionAsync(url: java.lang.String, redirectUrl: java.lang.String): js.Promise[RedirectResult | BrowserResult] = js.native
  def openBrowserAsync(url: java.lang.String): js.Promise[BrowserResult] = js.native
}

