package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.getAllInWindow")
@js.native
object getAllInWindow extends js.Object {
  /**
    * Gets details about all tabs in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{windowId: windowId}`.
    */
  def apply(): js.Promise[js.Array[Tab]] = js.native
  def apply(windowId: Double): js.Promise[js.Array[Tab]] = js.native
}

