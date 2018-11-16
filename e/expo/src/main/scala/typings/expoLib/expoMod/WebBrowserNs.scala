package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "WebBrowser")
@js.native
object WebBrowserNs extends js.Object {
  def dismissBrowser(): stdLib.Promise[expoLib.Anon_TypeDismissed] = js.native
  def openAuthSessionAsync(url: java.lang.String): stdLib.Promise[expoLib.Anon_TypeCancelled] = js.native
  def openAuthSessionAsync(url: java.lang.String, redirectUrl: java.lang.String): stdLib.Promise[expoLib.Anon_TypeCancelled] = js.native
  def openBrowserAsync(url: java.lang.String): stdLib.Promise[expoLib.Anon_TypeCancelled] = js.native
}

