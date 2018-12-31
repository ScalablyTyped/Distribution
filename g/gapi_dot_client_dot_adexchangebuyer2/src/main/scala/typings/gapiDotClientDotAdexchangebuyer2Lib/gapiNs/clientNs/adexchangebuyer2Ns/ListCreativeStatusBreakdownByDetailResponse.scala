package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreativeStatusBreakdownByDetailResponse extends js.Object {
  /** The type of detail that the detail IDs represent. */
  var detailType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[FilteredBidDetailRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.details.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

