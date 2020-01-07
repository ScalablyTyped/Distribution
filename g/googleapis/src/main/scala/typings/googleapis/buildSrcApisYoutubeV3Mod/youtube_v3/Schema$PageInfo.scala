package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Paging details for lists of resources, including total number of items
  * available and number of resources returned in a single page.
  */
@js.native
trait Schema$PageInfo extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double] = js.native
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object Schema$PageInfo {
  @scala.inline
  def apply(resultsPerPage: Int | Double = null, totalResults: Int | Double = null): Schema$PageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultsPerPage != null) __obj.updateDynamic("resultsPerPage")(resultsPerPage.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageInfo]
  }
}

