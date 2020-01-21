package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

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
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDealAssociationsResponse {
  @scala.inline
  def apply(associations: js.Array[CreativeDealAssociation] = null, nextPageToken: String = null): ListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDealAssociationsResponse]
  }
}

