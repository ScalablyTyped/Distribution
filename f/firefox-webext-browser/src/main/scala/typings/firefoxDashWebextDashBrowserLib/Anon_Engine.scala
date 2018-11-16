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

