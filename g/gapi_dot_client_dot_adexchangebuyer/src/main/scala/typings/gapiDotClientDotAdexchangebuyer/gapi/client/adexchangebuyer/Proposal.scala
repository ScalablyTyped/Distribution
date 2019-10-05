package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

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
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer)
    if (buyer != null) __obj.updateDynamic("buyer")(buyer)
    if (buyerContacts != null) __obj.updateDynamic("buyerContacts")(buyerContacts)
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData)
    if (dbmAdvertiserIds != null) __obj.updateDynamic("dbmAdvertiserIds")(dbmAdvertiserIds)
    if (!js.isUndefined(hasBuyerSignedOff)) __obj.updateDynamic("hasBuyerSignedOff")(hasBuyerSignedOff)
    if (!js.isUndefined(hasSellerSignedOff)) __obj.updateDynamic("hasSellerSignedOff")(hasSellerSignedOff)
    if (inventorySource != null) __obj.updateDynamic("inventorySource")(inventorySource)
    if (!js.isUndefined(isRenegotiating)) __obj.updateDynamic("isRenegotiating")(isRenegotiating)
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lastUpdaterOrCommentorRole != null) __obj.updateDynamic("lastUpdaterOrCommentorRole")(lastUpdaterOrCommentorRole)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negotiationId != null) __obj.updateDynamic("negotiationId")(negotiationId)
    if (originatorRole != null) __obj.updateDynamic("originatorRole")(originatorRole)
    if (privateAuctionId != null) __obj.updateDynamic("privateAuctionId")(privateAuctionId)
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId)
    if (proposalState != null) __obj.updateDynamic("proposalState")(proposalState)
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber)
    if (revisionTimeMs != null) __obj.updateDynamic("revisionTimeMs")(revisionTimeMs)
    if (seller != null) __obj.updateDynamic("seller")(seller)
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts)
    __obj.asInstanceOf[Proposal]
  }
}

