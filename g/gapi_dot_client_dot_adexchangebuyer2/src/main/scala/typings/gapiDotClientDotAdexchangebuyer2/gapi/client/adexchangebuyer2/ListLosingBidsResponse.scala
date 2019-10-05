package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLosingBidsResponse extends js.Object {
  /**
    * List of rows, with counts of losing bids aggregated by loss reason (i.e.
    * creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListLosingBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.losingBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListLosingBidsResponse {
  @scala.inline
  def apply(creativeStatusRows: js.Array[CreativeStatusRow] = null, nextPageToken: String = null): ListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeStatusRows != null) __obj.updateDynamic("creativeStatusRows")(creativeStatusRows)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListLosingBidsResponse]
  }
}

