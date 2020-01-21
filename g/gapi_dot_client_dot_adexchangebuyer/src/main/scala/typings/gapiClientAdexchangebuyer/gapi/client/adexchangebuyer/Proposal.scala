package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

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
  var dbmAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[Boolean] = js.undefined
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[Boolean] = js.undefined
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[String] = js.undefined
  /** True if the proposal is being renegotiated (readonly). */
  var isRenegotiating: js.UndefOr[Boolean] = js.undefined
  /**
    * True, if the buyside inventory setup is complete for this proposal. (readonly, except via OrderSetupCompleted action) Deprecated in favor of deal level
    * setup complete flag.
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal". */
  var kind: js.UndefOr[String] = js.undefined
  /** List of labels associated with the proposal. (readonly) */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.undefined
  /** The role of the last user that either updated the proposal or left a comment. (readonly) */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.undefined
  /** The name for the proposal (updatable) */
  var name: js.UndefOr[String] = js.undefined
  /** Optional negotiation id if this proposal is a preferred deal proposal. */
  var negotiationId: js.UndefOr[String] = js.undefined
  /** Indicates whether the buyer/seller created the proposal.(readonly) */
  var originatorRole: js.UndefOr[String] = js.undefined
  /** Optional private auction id if this proposal is a private auction proposal. */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  /** The unique id of the proposal. (readonly). */
  var proposalId: js.UndefOr[String] = js.undefined
  /** The current state of the proposal. (readonly) */
  var proposalState: js.UndefOr[String] = js.undefined
  /** The revision number for the proposal (readonly). */
  var revisionNumber: js.UndefOr[String] = js.undefined
  /** The time (ms since epoch) when the proposal was last revised (readonly). */
  var revisionTimeMs: js.UndefOr[String] = js.undefined
  /** Reference to the seller on the proposal. (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.undefined
  /** Optional contact information of the seller (buyer-readonly). */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
}

object Proposal {
  @scala.inline
  def apply(
    billedBuyer: Buyer = null,
    buyer: Buyer = null,
    buyerContacts: js.Array[ContactInformation] = null,
    buyerPrivateData: PrivateData = null,
    dbmAdvertiserIds: js.Array[String] = null,
    hasBuyerSignedOff: js.UndefOr[Boolean] = js.undefined,
    hasSellerSignedOff: js.UndefOr[Boolean] = js.undefined,
    inventorySource: String = null,
    isRenegotiating: js.UndefOr[Boolean] = js.undefined,
    isSetupComplete: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    labels: js.Array[MarketplaceLabel] = null,
    lastUpdaterOrCommentorRole: String = null,
    name: String = null,
    negotiationId: String = null,
    originatorRole: String = null,
    privateAuctionId: String = null,
    proposalId: String = null,
    proposalState: String = null,
    revisionNumber: String = null,
    revisionTimeMs: String = null,
    seller: Seller = null,
    sellerContacts: js.Array[ContactInformation] = null
  ): Proposal = {
    val __obj = js.Dynamic.literal()
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (buyerContacts != null) __obj.updateDynamic("buyerContacts")(buyerContacts.asInstanceOf[js.Any])
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData.asInstanceOf[js.Any])
    if (dbmAdvertiserIds != null) __obj.updateDynamic("dbmAdvertiserIds")(dbmAdvertiserIds.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBuyerSignedOff)) __obj.updateDynamic("hasBuyerSignedOff")(hasBuyerSignedOff.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSellerSignedOff)) __obj.updateDynamic("hasSellerSignedOff")(hasSellerSignedOff.asInstanceOf[js.Any])
    if (inventorySource != null) __obj.updateDynamic("inventorySource")(inventorySource.asInstanceOf[js.Any])
    if (!js.isUndefined(isRenegotiating)) __obj.updateDynamic("isRenegotiating")(isRenegotiating.asInstanceOf[js.Any])
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastUpdaterOrCommentorRole != null) __obj.updateDynamic("lastUpdaterOrCommentorRole")(lastUpdaterOrCommentorRole.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negotiationId != null) __obj.updateDynamic("negotiationId")(negotiationId.asInstanceOf[js.Any])
    if (originatorRole != null) __obj.updateDynamic("originatorRole")(originatorRole.asInstanceOf[js.Any])
    if (privateAuctionId != null) __obj.updateDynamic("privateAuctionId")(privateAuctionId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (proposalState != null) __obj.updateDynamic("proposalState")(proposalState.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    if (revisionTimeMs != null) __obj.updateDynamic("revisionTimeMs")(revisionTimeMs.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proposal]
  }
}

