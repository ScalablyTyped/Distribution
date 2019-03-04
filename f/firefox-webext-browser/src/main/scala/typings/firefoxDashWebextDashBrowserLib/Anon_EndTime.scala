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

object Anon_EndTime {
  @scala.inline
  def apply(
    text: java.lang.String,
    endTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date = null,
    maxResults: scala.Int | scala.Double = null,
    startTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date = null
  ): Anon_EndTime = {
    val __obj = js.Dynamic.literal(text = text)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndTime]
  }
}

