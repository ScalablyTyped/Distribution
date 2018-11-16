package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing filters to apply to tabs.onUpdated events. */

trait UpdateFilter extends js.Object {
  /** A list of property names. Events that do not match any of the names will be filtered out. */
  var properties: js.UndefOr[js.Array[UpdatePropertyName]] = js.undefined
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
           * A list of URLs or URL patterns. Events that cannot match any of the URLs will be filtered out. Filtering
           * with urls requires the `"tabs"` or `"activeTab"` permission.
           */
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

