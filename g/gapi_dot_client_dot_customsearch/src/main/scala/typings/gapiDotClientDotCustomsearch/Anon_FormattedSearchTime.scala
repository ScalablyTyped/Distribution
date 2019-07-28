package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.undefined
  var formattedTotalResults: js.UndefOr[String] = js.undefined
  var searchTime: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[String] = js.undefined
}

object Anon_FormattedSearchTime {
  @scala.inline
  def apply(
    formattedSearchTime: String = null,
    formattedTotalResults: String = null,
    searchTime: Int | Double = null,
    totalResults: String = null
  ): Anon_FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    if (formattedSearchTime != null) __obj.updateDynamic("formattedSearchTime")(formattedSearchTime)
    if (formattedTotalResults != null) __obj.updateDynamic("formattedTotalResults")(formattedTotalResults)
    if (searchTime != null) __obj.updateDynamic("searchTime")(searchTime.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults)
    __obj.asInstanceOf[Anon_FormattedSearchTime]
  }
}

