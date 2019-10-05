package typings.firefoxDashWebextDashBrowser.browser.tabs

import typings.firefoxDashWebextDashBrowser.Anon_BypassCache
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
  def apply(tabId: Double, reloadProperties: Anon_BypassCache): js.Promise[Unit] = js.native
}

