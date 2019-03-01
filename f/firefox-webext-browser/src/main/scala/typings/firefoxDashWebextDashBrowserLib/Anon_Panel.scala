package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Panel extends js.Object {
  /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
  var panel: java.lang.String | scala.Null
  /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Sets the sidebar url for the window specified by windowId. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Panel {
  @scala.inline
  def apply(
    panel: java.lang.String = null,
    tabId: scala.Int | scala.Double = null,
    windowId: scala.Int | scala.Double = null
  ): Anon_Panel = {
    val __obj = js.Dynamic.literal()
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Panel]
  }
}

