package typings.firefoxDashWebextDashBrowser.browserNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserAction types */
/**
  * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab
  * nor window is specified, the global value is set or retrieved.
  */
trait Details extends js.Object {
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Details {
  @scala.inline
  def apply(tabId: Int | Double = null, windowId: Int | Double = null): Details = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

