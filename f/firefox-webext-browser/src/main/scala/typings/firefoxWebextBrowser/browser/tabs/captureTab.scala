package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.browser.extensionTypes.ImageDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.captureTab")
@js.native
object captureTab extends js.Object {
  /**
    * Captures the visible area of a specified tab. You must have <all_urls> permission to use this method.
    * @param [tabId] The tab to capture. Defaults to the active tab of the current window.
    */
  def apply(): js.Promise[String] = js.native
  def apply(tabId: Double): js.Promise[String] = js.native
  def apply(tabId: Double, options: ImageDetails): js.Promise[String] = js.native
}

