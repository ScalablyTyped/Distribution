package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.setZoomSettings")
@js.native
object setZoomSettings extends js.Object {
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset
    * to defaults upon navigating the tab.
    * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the current
    *     window.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def apply(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset
    * to defaults upon navigating the tab.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def apply(zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
}

