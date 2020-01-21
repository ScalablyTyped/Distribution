package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.browser.extensionTypes.InjectDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.removeCSS")
@js.native
object removeCSS extends js.Object {
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to remove.
    */
  def apply(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param tabId The ID of the tab from which to remove the injected CSS; defaults to the active tab of the current
    *     window.
    * @param details Details of the CSS text to remove.
    */
  def apply(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
}

