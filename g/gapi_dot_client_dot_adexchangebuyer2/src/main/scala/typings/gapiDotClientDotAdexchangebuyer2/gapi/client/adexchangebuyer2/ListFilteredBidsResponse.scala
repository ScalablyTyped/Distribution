package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFilteredBidsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilteredBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListFilteredBidsResponse {
  @scala.inline
  def apply(creativeStatusRows: js.Array[CreativeStatusRow] = null, nextPageToken: String = null): ListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeStatusRows != null) __obj.updateDynamic("creativeStatusRows")(creativeStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFilteredBidsResponse]
  }
}

