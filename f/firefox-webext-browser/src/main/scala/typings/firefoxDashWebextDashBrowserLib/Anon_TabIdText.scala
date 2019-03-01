package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIdText extends js.Object {
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: java.lang.String | scala.Null
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_TabIdText {
  @scala.inline
  def apply(
    tabId: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    windowId: scala.Int | scala.Double = null
  ): Anon_TabIdText = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TabIdText]
  }
}

