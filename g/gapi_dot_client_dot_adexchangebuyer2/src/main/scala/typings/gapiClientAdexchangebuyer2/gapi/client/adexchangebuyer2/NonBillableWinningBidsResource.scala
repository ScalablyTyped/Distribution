package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonBillableWinningBidsResource extends js.Object {
  /**
    * List all reasons for which winning bids were not billable, with the number
    * of bids not billed for each reason.
    */
  def list(request: FilterSetId): Request[ListNonBillableWinningBidsResponse] = js.native
}

object NonBillableWinningBidsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListNonBillableWinningBidsResponse]): NonBillableWinningBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[NonBillableWinningBidsResource]
  }
  @scala.inline
  implicit class NonBillableWinningBidsResourceOps[Self <: NonBillableWinningBidsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: FilterSetId => Request[ListNonBillableWinningBidsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

