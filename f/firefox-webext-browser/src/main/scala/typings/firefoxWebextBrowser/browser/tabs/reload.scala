package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonBypassCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.reload")
@js.native
object reload extends js.Object {
  /**
    * Reload a tab.
    * @param [tabId] The ID of the tab to reload; defaults to the selected tab of the current window.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(tabId: Double): js.Promise[Unit] = js.native
  def apply(tabId: Double, reloadProperties: AnonBypassCache): js.Promise[Unit] = js.native
}

