package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTime extends js.Object {
  /** Limit results to those visited before this date. */
  var endTime: js.UndefOr[Date] = js.undefined
  /** The maximum number of results to retrieve. Defaults to 100. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Limit results to those visited after this date. If not specified, this defaults to 24 hours in the past.
    */
  var startTime: js.UndefOr[Date] = js.undefined
  /** A free-text query to the history service. Leave empty to retrieve all pages. */
  var text: String
}

object Anon_EndTime {
  @scala.inline
  def apply(text: String, endTime: Date = null, maxResults: Int | Double = null, startTime: Date = null): Anon_EndTime = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndTime]
  }
}

