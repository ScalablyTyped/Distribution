package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIdTitle extends js.Object {
  /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** The string the sidebar action should display when moused over. */
  var title: String | Null
  /** Sets the sidebar title for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Anon_TabIdTitle {
  @scala.inline
  def apply(tabId: Int | Double = null, title: String = null, windowId: Int | Double = null): Anon_TabIdTitle = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TabIdTitle]
  }
}

