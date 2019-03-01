package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  /** The number of results included in the API response. */
  var resultsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** The total number of results in the result set. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(resultsPerPage: scala.Int | scala.Double = null, totalResults: scala.Int | scala.Double = null): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultsPerPage != null) __obj.updateDynamic("resultsPerPage")(resultsPerPage.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

