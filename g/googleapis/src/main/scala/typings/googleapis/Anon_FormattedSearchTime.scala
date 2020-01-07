package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.native
  var formattedTotalResults: js.UndefOr[String] = js.native
  var searchTime: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[String] = js.native
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
    if (formattedSearchTime != null) __obj.updateDynamic("formattedSearchTime")(formattedSearchTime.asInstanceOf[js.Any])
    if (formattedTotalResults != null) __obj.updateDynamic("formattedTotalResults")(formattedTotalResults.asInstanceOf[js.Any])
    if (searchTime != null) __obj.updateDynamic("searchTime")(searchTime.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FormattedSearchTime]
  }
}

