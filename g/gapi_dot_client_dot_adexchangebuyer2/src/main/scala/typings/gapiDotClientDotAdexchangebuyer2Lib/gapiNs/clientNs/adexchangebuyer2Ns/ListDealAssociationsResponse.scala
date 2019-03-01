package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDealAssociationsResponse extends js.Object {
  /** The list of associations. */
  var associations: js.UndefOr[js.Array[CreativeDealAssociation]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListDealAssociationsRequest.page_token
    * field in the subsequent call to 'ListDealAssociation' method to retrieve
    * the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDealAssociationsResponse {
  @scala.inline
  def apply(associations: js.Array[CreativeDealAssociation] = null, nextPageToken: java.lang.String = null): ListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDealAssociationsResponse]
  }
}

