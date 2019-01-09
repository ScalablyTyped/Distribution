package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTime extends js.Object {
  /** Limit results to those visited before this date. */
  var endTime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date] = js.undefined
  /** The maximum number of results to retrieve. Defaults to 100. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Limit results to those visited after this date. If not specified, this defaults to 24 hours in the past.
    */
  var startTime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date] = js.undefined
  /** A free-text query to the history service. Leave empty to retrieve all pages. */
  var text: java.lang.String
}

