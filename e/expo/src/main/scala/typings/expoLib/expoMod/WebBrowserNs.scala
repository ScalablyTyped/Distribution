package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "WebBrowser")
@js.native
object WebBrowserNs extends js.Object {
  def dismissBrowser(): js.Promise[expoLib.Anon_Dismissed] = js.native
  def openAuthSessionAsync(url: java.lang.String): js.Promise[expoLib.Anon_CancelledDismissed] = js.native
  def openAuthSessionAsync(url: java.lang.String, redirectUrl: java.lang.String): js.Promise[expoLib.Anon_CancelledDismissed] = js.native
  def openBrowserAsync(url: java.lang.String): js.Promise[expoLib.Anon_CancelledDismissed] = js.native
}

