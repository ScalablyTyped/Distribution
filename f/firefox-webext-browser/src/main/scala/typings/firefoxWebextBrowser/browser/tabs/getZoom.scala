package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.getZoom")
@js.native
object getZoom extends js.Object {
  /**
    * Gets the current zoom factor of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom factor from; defaults to the active tab of the current
    *     window.
    */
  def apply(): js.Promise[Double] = js.native
  def apply(tabId: Double): js.Promise[Double] = js.native
}

