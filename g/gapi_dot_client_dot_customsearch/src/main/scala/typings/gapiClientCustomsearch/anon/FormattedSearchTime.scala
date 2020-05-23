package typings.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.undefined
  var formattedTotalResults: js.UndefOr[String] = js.undefined
  var searchTime: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[String] = js.undefined
}

object FormattedSearchTime {
  @scala.inline
  def apply(
    formattedSearchTime: String = null,
    formattedTotalResults: String = null,
    searchTime: js.UndefOr[Double] = js.undefined,
    totalResults: String = null
  ): FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    if (formattedSearchTime != null) __obj.updateDynamic("formattedSearchTime")(formattedSearchTime.asInstanceOf[js.Any])
    if (formattedTotalResults != null) __obj.updateDynamic("formattedTotalResults")(formattedTotalResults.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTime)) __obj.updateDynamic("searchTime")(searchTime.get.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedSearchTime]
  }
}

