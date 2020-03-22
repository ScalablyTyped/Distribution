package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: String | Null
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(tabId: Int | Double = null, text: String = null, windowId: Int | Double = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

