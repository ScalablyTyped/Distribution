package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonBillableWinningBidsResource extends js.Object {
  /**
    * List all reasons for which winning bids were not billable, with the number
    * of bids not billed for each reason.
    */
  def list(request: AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request_[ListNonBillableWinningBidsResponse]
}

object NonBillableWinningBidsResource {
  @scala.inline
  def apply(
    list: AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request_[ListNonBillableWinningBidsResponse]
  ): NonBillableWinningBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[NonBillableWinningBidsResource]
  }
}

