package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.duplicate")
@js.native
object duplicate extends js.Object {
  /**
    * Duplicates a tab.
    * @param tabId The ID of the tab which is to be duplicated.
    */
  def apply(tabId: Double): js.Promise[Tab] = js.native
}

