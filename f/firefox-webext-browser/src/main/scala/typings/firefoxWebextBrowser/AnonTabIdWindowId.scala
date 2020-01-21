package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabIdWindowId extends js.Object {
  /**
    * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonTabIdWindowId {
  @scala.inline
  def apply(tabId: Int | Double = null, windowId: Int | Double = null): AnonTabIdWindowId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabIdWindowId]
  }
}

