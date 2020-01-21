package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.browser.extensionTypes.ImageDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.captureVisibleTab")
@js.native
object captureVisibleTab extends js.Object {
  /**
    * Captures the visible area of the currently active tab in the specified window. You must have <all_urls>
    * permission to use this method.
    * @param [windowId] The target window. Defaults to the current window.
    */
  def apply(): js.Promise[String] = js.native
  def apply(windowId: Double): js.Promise[String] = js.native
  def apply(windowId: Double, options: ImageDetails): js.Promise[String] = js.native
}

