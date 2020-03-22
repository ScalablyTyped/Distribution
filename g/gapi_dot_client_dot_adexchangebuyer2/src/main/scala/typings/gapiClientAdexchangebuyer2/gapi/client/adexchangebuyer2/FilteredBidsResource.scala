package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonFilterSetId
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
  def list(request: AnonFilterSetId): Request_[ListFilteredBidsResponse]
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: AnonFilterSetId => Request_[ListFilteredBidsResponse]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FilteredBidsResource]
  }
}

