package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing filters to apply to webRequest events. */
trait RequestFilter extends js.Object {
  var tabId: js.UndefOr[Double] = js.undefined
  /** A list of request types. Requests that cannot match any of the types will be filtered out. */
  var types: js.UndefOr[js.Array[ResourceType]] = js.undefined
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[String]
  var windowId: js.UndefOr[Double] = js.undefined
}

object RequestFilter {
  @scala.inline
  def apply(
    urls: js.Array[String],
    tabId: Int | Double = null,
    types: js.Array[ResourceType] = null,
    windowId: Int | Double = null
  ): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFilter]
  }
}

