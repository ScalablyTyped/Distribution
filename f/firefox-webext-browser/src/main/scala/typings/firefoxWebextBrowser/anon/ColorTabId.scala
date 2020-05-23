package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.browserAction.ColorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTabId extends js.Object {
  var color: ColorValue
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

object ColorTabId {
  @scala.inline
  def apply(
    color: ColorValue = null,
    tabId: js.UndefOr[Double] = js.undefined,
    windowId: js.UndefOr[Double] = js.undefined
  ): ColorTabId = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTabId]
  }
}

