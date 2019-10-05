package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidRequestsResource extends js.Object {
  /**
    * List all reasons that caused a bid request not to be sent for an
    * impression, with the number of bid requests not sent for each reason.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request[ListFilteredBidRequestsResponse]
}

object FilteredBidRequestsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request[ListFilteredBidRequestsResponse]
  ): FilteredBidRequestsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FilteredBidRequestsResource]
  }
}

