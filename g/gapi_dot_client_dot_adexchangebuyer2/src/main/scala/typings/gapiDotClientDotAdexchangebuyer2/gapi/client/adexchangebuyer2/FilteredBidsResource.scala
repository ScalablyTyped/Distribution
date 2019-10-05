package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidsResource extends js.Object {
  var creatives: CreativesResource
  var details: DetailsResource
  /**
    * List all reasons for which bids were filtered, with the number of bids
    * filtered for each reason.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request[ListFilteredBidsResponse]
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request[ListFilteredBidsResponse]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives, details = details, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FilteredBidsResource]
  }
}

