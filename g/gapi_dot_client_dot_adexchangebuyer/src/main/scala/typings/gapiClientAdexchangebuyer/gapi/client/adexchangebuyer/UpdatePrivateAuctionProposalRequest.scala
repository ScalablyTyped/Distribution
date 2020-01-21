package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePrivateAuctionProposalRequest extends js.Object {
  /** The externalDealId of the deal to be updated. */
  var externalDealId: js.UndefOr[String] = js.undefined
  /** Optional note to be added. */
  var note: js.UndefOr[MarketplaceNote] = js.undefined
  /** The current revision number of the proposal to be updated. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  /** The proposed action on the private auction proposal. */
  var updateAction: js.UndefOr[String] = js.undefined
}

object UpdatePrivateAuctionProposalRequest {
  @scala.inline
  def apply(
    externalDealId: String = null,
    note: MarketplaceNote = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): UpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (externalDealId != null) __obj.updateDynamic("externalDealId")(externalDealId.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrivateAuctionProposalRequest]
  }
}

