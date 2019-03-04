package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

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
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListFilteredBidsResponse]
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListFilteredBidsResponse]
    ]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives, details = details, list = list)
  
    __obj.asInstanceOf[FilteredBidsResource]
  }
}

