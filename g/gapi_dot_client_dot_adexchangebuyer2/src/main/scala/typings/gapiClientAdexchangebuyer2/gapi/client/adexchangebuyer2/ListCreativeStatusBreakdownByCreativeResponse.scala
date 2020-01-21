package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreativeStatusBreakdownByCreativeResponse extends js.Object {
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[FilteredBidCreativeRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativeStatusBreakdownByCreativeRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.creatives.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCreativeStatusBreakdownByCreativeResponse {
  @scala.inline
  def apply(filteredBidCreativeRows: js.Array[FilteredBidCreativeRow] = null, nextPageToken: String = null): ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    if (filteredBidCreativeRows != null) __obj.updateDynamic("filteredBidCreativeRows")(filteredBidCreativeRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreativeStatusBreakdownByCreativeResponse]
  }
}

