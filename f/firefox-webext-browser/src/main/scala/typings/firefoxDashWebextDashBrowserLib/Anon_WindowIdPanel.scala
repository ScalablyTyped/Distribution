package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_WindowIdPanel extends js.Object {
  /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
  var panel: java.lang.String | scala.Null
  /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Sets the sidebar url for the window specified by windowId. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

