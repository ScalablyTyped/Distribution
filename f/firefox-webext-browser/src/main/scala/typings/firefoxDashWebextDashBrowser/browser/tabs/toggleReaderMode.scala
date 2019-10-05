package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.toggleReaderMode")
@js.native
object toggleReaderMode extends js.Object {
  /**
    * Toggles reader mode for the document in the tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(tabId: Double): js.Promise[Unit] = js.native
}

