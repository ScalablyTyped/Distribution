package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousTabId extends js.Object {
  /** The ID of the tab that was previously active, if that tab is still open. */
  var previousTabId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab that has become active. */
  var tabId: Double
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double
}

object AnonPreviousTabId {
  @scala.inline
  def apply(tabId: Double, windowId: Double, previousTabId: Int | Double = null): AnonPreviousTabId = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    if (previousTabId != null) __obj.updateDynamic("previousTabId")(previousTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousTabId]
  }
}

