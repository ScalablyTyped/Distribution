package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOrderDealsRequest extends js.Object {
  /** The list of deals to add */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.native
}

object AddOrderDealsRequest {
  @scala.inline
  def apply(): AddOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderDealsRequest]
  }
  @scala.inline
  implicit class AddOrderDealsRequestOps[Self <: AddOrderDealsRequest] (val x: Self) extends AnyVal {
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
    def setDealsVarargs(value: MarketplaceDeal*): Self = this.set("deals", js.Array(value :_*))
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeals: Self = this.set("deals", js.undefined)
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = this.set("proposalRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalRevisionNumber: Self = this.set("proposalRevisionNumber", js.undefined)
    @scala.inline
    def setUpdateAction(value: String): Self = this.set("updateAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateAction: Self = this.set("updateAction", js.undefined)
  }
  
}

