package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFilterSetsResponse extends js.Object {
  /** The filter sets belonging to the buyer. */
  var filterSets: js.UndefOr[js.Array[FilterSet]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilterSetsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

