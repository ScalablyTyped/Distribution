package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var resultsPerPage: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(resultsPerPage: Int | Double = null, totalResults: Int | Double = null): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultsPerPage != null) __obj.updateDynamic("resultsPerPage")(resultsPerPage.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

