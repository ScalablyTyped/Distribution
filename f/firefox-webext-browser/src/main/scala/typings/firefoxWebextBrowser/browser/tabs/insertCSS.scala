package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.browser.extensionTypes.InjectDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.insertCSS")
@js.native
object insertCSS extends js.Object {
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to insert.
    */
  def apply(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to insert.
    */
  def apply(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
}

