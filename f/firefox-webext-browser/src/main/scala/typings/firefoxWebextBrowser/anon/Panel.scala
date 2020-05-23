package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel extends js.Object {
  /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
  var panel: String | Null
  /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** Sets the sidebar url for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Panel {
  @scala.inline
  def apply(
    panel: String = null,
    tabId: js.UndefOr[Double] = js.undefined,
    windowId: js.UndefOr[Double] = js.undefined
  ): Panel = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel]
  }
}

