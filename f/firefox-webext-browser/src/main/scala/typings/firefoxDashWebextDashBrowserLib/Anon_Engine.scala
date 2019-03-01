package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Engine extends js.Object {
  /** Search engine to use. Uses the default if not specified. */
  var engine: js.UndefOr[java.lang.String] = js.undefined
  /** Terms to search for. */
  var query: java.lang.String
  /** The ID of the tab for the search results. If not specified, a new tab is created. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Engine {
  @scala.inline
  def apply(query: java.lang.String, engine: java.lang.String = null, tabId: scala.Int | scala.Double = null): Anon_Engine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Engine]
  }
}

