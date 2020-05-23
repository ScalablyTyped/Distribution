package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  /** Search engine to use. Uses the default if not specified. */
  var engine: js.UndefOr[String] = js.undefined
  /** Terms to search for. */
  var query: String
  /** The ID of the tab for the search results. If not specified, a new tab is created. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object Engine {
  @scala.inline
  def apply(query: String, engine: String = null, tabId: js.UndefOr[Double] = js.undefined): Engine = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
}

