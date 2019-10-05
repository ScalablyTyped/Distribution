package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.setZoom")
@js.native
object setZoom extends js.Object {
  /**
    * Zooms a specified tab.
    * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    *     Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def apply(tabId: Double, zoomFactor: Double): js.Promise[Unit] = js.native
  /**
    * Zooms a specified tab.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    *     Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def apply(zoomFactor: Double): js.Promise[Unit] = js.native
}

