package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing filters to apply to tabs.onUpdated events. */
trait UpdateFilter extends js.Object {
  /** A list of property names. Events that do not match any of the names will be filtered out. */
  var properties: js.UndefOr[js.Array[UpdatePropertyName]] = js.undefined
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * A list of URLs or URL patterns. Events that cannot match any of the URLs will be filtered out. Filtering
    * with urls requires the `"tabs"` or `"activeTab"` permission.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var windowId: js.UndefOr[Double] = js.undefined
}

object UpdateFilter {
  @scala.inline
  def apply(
    properties: js.Array[UpdatePropertyName] = null,
    tabId: Int | Double = null,
    urls: js.Array[String] = null,
    windowId: Int | Double = null
  ): UpdateFilter = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilter]
  }
}

