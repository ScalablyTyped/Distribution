package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousTabId extends js.Object {
  /** The ID of the tab that was previously active, if that tab is still open. */
  var previousTabId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab that has become active. */
  var tabId: Double
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double
}

object PreviousTabId {
  @scala.inline
  def apply(tabId: Double, windowId: Double, previousTabId: js.UndefOr[Double] = js.undefined): PreviousTabId = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    if (!js.isUndefined(previousTabId)) __obj.updateDynamic("previousTabId")(previousTabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousTabId]
  }
}

