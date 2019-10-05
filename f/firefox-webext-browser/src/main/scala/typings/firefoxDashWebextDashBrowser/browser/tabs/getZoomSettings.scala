package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.getZoomSettings")
@js.native
object getZoomSettings extends js.Object {
  /**
    * Gets the current zoom settings of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom settings from; defaults to the active tab of the
    *     current window.
    */
  def apply(): js.Promise[ZoomSettings] = js.native
  def apply(tabId: Double): js.Promise[ZoomSettings] = js.native
}

