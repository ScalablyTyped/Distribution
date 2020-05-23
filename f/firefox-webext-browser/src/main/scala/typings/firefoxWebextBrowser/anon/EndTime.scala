package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndTime extends js.Object {
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

object EndTime {
  @scala.inline
  def apply(
    text: String,
    endTime: Date = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    startTime: Date = null
  ): EndTime = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
}

