package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  /** The number of results included in the API response. */
  var resultsPerPage: js.UndefOr[Double] = js.undefined
  /** The total number of results in the result set. */
  var totalResults: js.UndefOr[Double] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(resultsPerPage: js.UndefOr[Double] = js.undefined, totalResults: js.UndefOr[Double] = js.undefined): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resultsPerPage)) __obj.updateDynamic("resultsPerPage")(resultsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

