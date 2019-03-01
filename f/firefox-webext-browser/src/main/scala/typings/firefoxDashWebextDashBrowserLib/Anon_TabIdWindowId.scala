package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIdWindowId extends js.Object {
  /**
    * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_TabIdWindowId {
  @scala.inline
  def apply(tabId: scala.Int | scala.Double = null, windowId: scala.Int | scala.Double = null): Anon_TabIdWindowId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TabIdWindowId]
  }
}

