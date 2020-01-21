package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.browser.extensionTypes.InjectDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.executeScript")
@js.native
object executeScript extends js.Object {
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param details Details of the script to run.
    */
  def apply(details: InjectDetails): js.Promise[js.Array[_]] = js.native
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the current window.
    * @param details Details of the script to run.
    */
  def apply(tabId: Double, details: InjectDetails): js.Promise[js.Array[_]] = js.native
}

