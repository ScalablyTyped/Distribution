package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all creatives associated with a given filtered
  * bid reason.
  */
@js.native
trait Schema$ListCreativeStatusBreakdownByCreativeResponse extends js.Object {
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[Schema$FilteredBidCreativeRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByCreativeRequest.pageToken field in the
    * subsequent call to the filteredBids.creatives.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCreativeStatusBreakdownByCreativeResponse {
  @scala.inline
  def apply(
    filteredBidCreativeRows: js.Array[Schema$FilteredBidCreativeRow] = null,
    nextPageToken: String = null
  ): Schema$ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    if (filteredBidCreativeRows != null) __obj.updateDynamic("filteredBidCreativeRows")(filteredBidCreativeRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCreativeStatusBreakdownByCreativeResponse]
  }
}

