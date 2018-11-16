package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditAllOrderDealsRequest extends js.Object {
  /**
               * List of deals to edit. Service may perform 3 different operations based on comparison of deals in this list vs deals already persisted in database: 1.
               * Add new deal to proposal If a deal in this list does not exist in the proposal, the service will create a new deal and add it to the proposal.
               * Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal If a deal in this list already exist in the proposal, the service
               * will update that existing deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete deals from the proposal (just
               * need the id) If a existing deal in the proposal is not present in this list, the service will delete that deal from the proposal. Validation will
               * follow DeleteOrderDealsRequest.
               */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** If specified, also updates the proposal in the batch transaction. This is useful when the proposal and the deals need to be updated in one transaction. */
  var proposal: js.UndefOr[Proposal] = js.undefined
  /** The last known revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[java.lang.String] = js.undefined
}

