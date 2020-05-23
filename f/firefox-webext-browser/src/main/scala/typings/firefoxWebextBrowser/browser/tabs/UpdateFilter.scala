package typings.firefoxWebextBrowser.browser.tabs

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
    tabId: js.UndefOr[Double] = js.undefined,
    urls: js.Array[String] = null,
    windowId: js.UndefOr[Double] = js.undefined
  ): UpdateFilter = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilter]
  }
}

