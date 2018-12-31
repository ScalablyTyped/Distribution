package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNonBillableWinningBidsResponse extends js.Object {
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListNonBillableWinningBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.nonBillableWinningBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of rows, with counts of bids not billed aggregated by reason. */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[NonBillableWinningBidStatusRow]] = js.undefined
}

