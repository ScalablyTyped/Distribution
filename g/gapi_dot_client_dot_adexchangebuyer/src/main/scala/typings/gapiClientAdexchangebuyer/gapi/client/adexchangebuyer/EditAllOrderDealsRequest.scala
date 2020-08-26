package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditAllOrderDealsRequest extends js.Object {
  /**
    * List of deals to edit. Service may perform 3 different operations based on comparison of deals in this list vs deals already persisted in database: 1.
    * Add new deal to proposal If a deal in this list does not exist in the proposal, the service will create a new deal and add it to the proposal.
    * Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal If a deal in this list already exist in the proposal, the service
    * will update that existing deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete deals from the proposal (just
    * need the id) If a existing deal in the proposal is not present in this list, the service will delete that deal from the proposal. Validation will
    * follow DeleteOrderDealsRequest.
    */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** If specified, also updates the proposal in the batch transaction. This is useful when the proposal and the deals need to be updated in one transaction. */
  var proposal: js.UndefOr[Proposal] = js.native
  /** The last known revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.native
}

object EditAllOrderDealsRequest {
  @scala.inline
  def apply(): EditAllOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsRequest]
  }
  @scala.inline
  implicit class EditAllOrderDealsRequestOps[Self <: EditAllOrderDealsRequest] (val x: Self) extends AnyVal {
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
    def setProposal(value: Proposal): Self = this.set("proposal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposal: Self = this.set("proposal", js.undefined)
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

