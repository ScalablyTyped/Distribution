package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonAppend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.moveInSuccession")
@js.native
object moveInSuccession extends js.Object {
  /**
    * Removes an array of tabs from their lines of succession and prepends or appends them in a chain to another tab.
    * @param tabIds An array of tab IDs to move in the line of succession. For each tab in the array, the tab's
    *     current predecessors will have their successor set to the tab's current successor, and each tab will then be
    *     set to be the successor of the previous tab in the array. Any tabs not in the same window as the tab
    *     indicated by the second argument (or the first tab in the array, if no second argument) will be skipped.
    * @param [tabId] The ID of a tab to set as the successor of the last tab in the array, or `tabs.TAB_ID_NONE` to
    *     leave the last tab without a successor. If options.append is true, then this tab is made the predecessor of
    *     the first tab in the array instead.
    */
  def apply(tabIds: js.Array[Double]): js.Promise[_] = js.native
  def apply(tabIds: js.Array[Double], tabId: Double): js.Promise[_] = js.native
  def apply(tabIds: js.Array[Double], tabId: Double, options: AnonAppend): js.Promise[_] = js.native
}

