package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bid requests were filtered
  * and not sent to the buyer.
  */
@js.native
trait Schema$ListFilteredBidRequestsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bid requests aggregated by callout
    * status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[Schema$CalloutStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidRequestsRequest.pageToken field in the subsequent call to
    * the filteredBidRequests.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListFilteredBidRequestsResponse {
  @scala.inline
  def apply(calloutStatusRows: js.Array[Schema$CalloutStatusRow] = null, nextPageToken: String = null): Schema$ListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (calloutStatusRows != null) __obj.updateDynamic("calloutStatusRows")(calloutStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFilteredBidRequestsResponse]
  }
}

