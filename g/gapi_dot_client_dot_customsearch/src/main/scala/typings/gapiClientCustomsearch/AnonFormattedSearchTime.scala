package typings.gapiClientCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.undefined
  var formattedTotalResults: js.UndefOr[String] = js.undefined
  var searchTime: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[String] = js.undefined
}

object AnonFormattedSearchTime {
  @scala.inline
  def apply(
    formattedSearchTime: String = null,
    formattedTotalResults: String = null,
    searchTime: Int | Double = null,
    totalResults: String = null
  ): AnonFormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    if (formattedSearchTime != null) __obj.updateDynamic("formattedSearchTime")(formattedSearchTime.asInstanceOf[js.Any])
    if (formattedTotalResults != null) __obj.updateDynamic("formattedTotalResults")(formattedTotalResults.asInstanceOf[js.Any])
    if (searchTime != null) __obj.updateDynamic("searchTime")(searchTime.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormattedSearchTime]
  }
}

