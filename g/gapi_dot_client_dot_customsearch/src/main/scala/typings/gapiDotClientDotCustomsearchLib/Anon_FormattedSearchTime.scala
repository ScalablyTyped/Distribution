package typings
package gapiDotClientDotCustomsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[java.lang.String] = js.undefined
  var formattedTotalResults: js.UndefOr[java.lang.String] = js.undefined
  var searchTime: js.UndefOr[scala.Double] = js.undefined
  var totalResults: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FormattedSearchTime {
  @scala.inline
  def apply(
    formattedSearchTime: java.lang.String = null,
    formattedTotalResults: java.lang.String = null,
    searchTime: scala.Int | scala.Double = null,
    totalResults: java.lang.String = null
  ): Anon_FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    if (formattedSearchTime != null) __obj.updateDynamic("formattedSearchTime")(formattedSearchTime)
    if (formattedTotalResults != null) __obj.updateDynamic("formattedTotalResults")(formattedTotalResults)
    if (searchTime != null) __obj.updateDynamic("searchTime")(searchTime.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults)
    __obj.asInstanceOf[Anon_FormattedSearchTime]
  }
}

