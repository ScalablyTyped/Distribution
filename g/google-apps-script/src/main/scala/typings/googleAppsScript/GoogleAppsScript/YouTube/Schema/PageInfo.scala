package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var resultsPerPage: js.UndefOr[Double] = js.undefined
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

