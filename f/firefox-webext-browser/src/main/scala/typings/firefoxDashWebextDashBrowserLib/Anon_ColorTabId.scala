package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorTabId extends js.Object {
  var color: firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ColorValue
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorTabId {
  @scala.inline
  def apply(
    color: firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ColorValue,
    tabId: scala.Int | scala.Double = null,
    windowId: scala.Int | scala.Double = null
  ): Anon_ColorTabId = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorTabId]
  }
}

