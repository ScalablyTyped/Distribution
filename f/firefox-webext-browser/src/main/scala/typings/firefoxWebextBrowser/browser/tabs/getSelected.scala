package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.getSelected")
@js.native
object getSelected extends js.Object {
  /**
    * Gets the tab that is selected in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{active: true}`.
    */
  def apply(): js.Promise[Tab] = js.native
  def apply(windowId: Double): js.Promise[Tab] = js.native
}

