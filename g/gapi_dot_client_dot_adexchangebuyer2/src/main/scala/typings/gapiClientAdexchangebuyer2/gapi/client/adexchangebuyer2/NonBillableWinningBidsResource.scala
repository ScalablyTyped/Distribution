package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonBillableWinningBidsResource extends js.Object {
  /**
    * List all reasons for which winning bids were not billable, with the number
    * of bids not billed for each reason.
    */
  def list(request: FilterSetId): Request[ListNonBillableWinningBidsResponse]
}

object NonBillableWinningBidsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListNonBillableWinningBidsResponse]): NonBillableWinningBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[NonBillableWinningBidsResource]
  }
}

