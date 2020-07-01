package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabId extends js.Object {
  /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** The string the sidebar action should display when moused over. */
  var title: String | Null
  /** Sets the sidebar title for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object TabId {
  @scala.inline
  def apply(
    tabId: js.UndefOr[Double] = js.undefined,
    title: String = null,
    windowId: js.UndefOr[Double] = js.undefined
  ): TabId = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabId]
  }
}

