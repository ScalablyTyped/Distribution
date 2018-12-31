package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proposal extends js.Object {
  /** Reference to the buyer that will get billed for this proposal. (readonly) */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  /** Reference to the buyer on the proposal. (readonly, except on create) */
  var buyer: js.UndefOr[Buyer] = js.undefined
  /** Optional contact information of the buyer. (seller-readonly) */
  var buyerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  /** Private data for buyer. (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.undefined
  /** IDs of DBM advertisers permission to this proposal. */
  var dbmAdvertiserIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[scala.Boolean] = js.undefined
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[java.lang.String] = js.undefined
  /** True if the proposal is being renegotiated (readonly). */
  var isRenegotiating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True, if the buyside inventory setup is complete for this proposal. (readonly, except via OrderSetupCompleted action) Deprecated in favor of deal level
    * setup complete flag.
    */
  var isSetupComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** List of labels associated with the proposal. (readonly) */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.undefined
  /** The role of the last user that either updated the proposal or left a comment. (readonly) */
  var lastUpdaterOrCommentorRole: js.UndefOr[java.lang.String] = js.undefined
  /** The name for the proposal (updatable) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Optional negotiation id if this proposal is a preferred deal proposal. */
  var negotiationId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the buyer/seller created the proposal.(readonly) */
  var originatorRole: js.UndefOr[java.lang.String] = js.undefined
  /** Optional private auction id if this proposal is a private auction proposal. */
  var privateAuctionId: js.UndefOr[java.lang.String] = js.undefined
  /** The unique id of the proposal. (readonly). */
  var proposalId: js.UndefOr[java.lang.String] = js.undefined
  /** The current state of the proposal. (readonly) */
  var proposalState: js.UndefOr[java.lang.String] = js.undefined
  /** The revision number for the proposal (readonly). */
  var revisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The time (ms since epoch) when the proposal was last revised (readonly). */
  var revisionTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Reference to the seller on the proposal. (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.undefined
  /** Optional contact information of the seller (buyer-readonly). */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
}

