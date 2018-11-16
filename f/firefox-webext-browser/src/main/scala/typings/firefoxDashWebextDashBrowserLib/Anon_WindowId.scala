package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_WindowId extends js.Object {
  /**
           * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
           * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
           * window one will be inherited.
           */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** The string the browser action should display when moused over. */
  var title: java.lang.String | scala.Null
  /**
           * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
           * the value from; if there is no window-specific value, the global one will be inherited.
           */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

