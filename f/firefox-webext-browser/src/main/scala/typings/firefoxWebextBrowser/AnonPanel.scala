package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPanel extends js.Object {
  /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
  var panel: String | Null
  /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** Sets the sidebar url for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonPanel {
  @scala.inline
  def apply(panel: String = null, tabId: Int | Double = null, windowId: Int | Double = null): AnonPanel = {
    val __obj = js.Dynamic.literal()
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPanel]
  }
}

