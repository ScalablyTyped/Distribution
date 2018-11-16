package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListFilteredBidRequestsResponse extends js.Object {
  /**
               * List of rows, with counts of filtered bid requests aggregated by callout
               * status.
               */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.undefined
  /**
               * A token to retrieve the next page of results.
               * Pass this value in the
               * ListFilteredBidRequestsRequest.pageToken
               * field in the subsequent call to the
               * accounts.filterSets.filteredBidRequests.list
               * method to retrieve the next page of results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

