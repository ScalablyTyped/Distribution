package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.removeWindowValue")
@js.native
object removeWindowValue extends js.Object {
  /**
    * Remove a key/value pair that was set on a given window.
    * @param windowId The id of the window whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def apply(windowId: Double, key: String): js.Promise[Unit] = js.native
}

