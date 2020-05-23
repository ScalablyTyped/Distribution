package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /** The billed buyer corresponding to the buyer that created the offer. (readonly, except on create) */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  /** The buyer that created the offer if this is a buyer initiated offer (readonly, except on create) */
  var buyer: js.UndefOr[Buyer] = js.undefined
  /** Creation time in ms. since epoch (readonly) */
  var creationTimeMs: js.UndefOr[String] = js.undefined
  /** Optional contact information for the creator of this product. (buyer-readonly) */
  var creatorContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  /** The role that created the offer. Set to BUYER for buyer initiated offers. */
  var creatorRole: js.UndefOr[String] = js.undefined
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
    * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.undefined
  /** The proposed end time for the deal (ms since epoch) (buyer-readonly) */
  var flightEndTimeMs: js.UndefOr[String] = js.undefined
  /** Inventory availability dates. (times are in ms since epoch) The granularity is generally in the order of seconds. (buyer-readonly) */
  var flightStartTimeMs: js.UndefOr[String] = js.undefined
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal,
    * if any of the terms are changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.undefined
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#product". */
  var kind: js.UndefOr[String] = js.undefined
  /** Optional List of labels for the product (optional, buyer-readonly). */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.undefined
  /** Time of last update in ms. since epoch (readonly) */
  var lastUpdateTimeMs: js.UndefOr[String] = js.undefined
  /** Optional legacy offer id if this offer is a preferred deal offer. */
  var legacyOfferId: js.UndefOr[String] = js.undefined
  /**
    * Marketplace publisher profile Id. This Id differs from the regular publisher_profile_id in that 1. This is a new id, the old Id will be deprecated in
    * 2017. 2. This id uniquely identifies a publisher profile by itself.
    */
  var marketplacePublisherProfileId: js.UndefOr[String] = js.undefined
  /** The name for this product as set by the seller. (buyer-readonly) */
  var name: js.UndefOr[String] = js.undefined
  /** Optional private auction id if this offer is a private auction offer. */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  /** The unique id for the product (readonly) */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * Id of the publisher profile for a given seller. A (seller.account_id, publisher_profile_id) pair uniquely identifies a publisher profile. Buyers can
    * call the PublisherProfiles::List endpoint to get a list of publisher profiles for a given seller.
    */
  var publisherProfileId: js.UndefOr[String] = js.undefined
  /** Publisher self-provided forecast information. */
  var publisherProvidedForecast: js.UndefOr[PublisherProvidedForecast] = js.undefined
  /** The revision number of the product. (readonly) */
  var revisionNumber: js.UndefOr[String] = js.undefined
  /** Information about the seller that created this product (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.undefined
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting criteria has a specified key and for each key there is a list of inclusion
    * value or exclusion values. (buyer-readonly)
    */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.undefined
  /** The state of the product. (buyer-readonly) */
  var state: js.UndefOr[String] = js.undefined
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[String] = js.undefined
  /** The negotiable terms of the deal (buyer-readonly) */
  var terms: js.UndefOr[DealTerms] = js.undefined
  /** The web property code for the seller. This field is meant to be copied over as is when creating deals. */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    billedBuyer: Buyer = null,
    buyer: Buyer = null,
    creationTimeMs: String = null,
    creatorContacts: js.Array[ContactInformation] = null,
    creatorRole: String = null,
    deliveryControl: DeliveryControl = null,
    flightEndTimeMs: String = null,
    flightStartTimeMs: String = null,
    hasCreatorSignedOff: js.UndefOr[Boolean] = js.undefined,
    inventorySource: String = null,
    kind: String = null,
    labels: js.Array[MarketplaceLabel] = null,
    lastUpdateTimeMs: String = null,
    legacyOfferId: String = null,
    marketplacePublisherProfileId: String = null,
    name: String = null,
    privateAuctionId: String = null,
    productId: String = null,
    publisherProfileId: String = null,
    publisherProvidedForecast: PublisherProvidedForecast = null,
    revisionNumber: String = null,
    seller: Seller = null,
    sharedTargetings: js.Array[SharedTargeting] = null,
    state: String = null,
    syndicationProduct: String = null,
    terms: DealTerms = null,
    webPropertyCode: String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (creationTimeMs != null) __obj.updateDynamic("creationTimeMs")(creationTimeMs.asInstanceOf[js.Any])
    if (creatorContacts != null) __obj.updateDynamic("creatorContacts")(creatorContacts.asInstanceOf[js.Any])
    if (creatorRole != null) __obj.updateDynamic("creatorRole")(creatorRole.asInstanceOf[js.Any])
    if (deliveryControl != null) __obj.updateDynamic("deliveryControl")(deliveryControl.asInstanceOf[js.Any])
    if (flightEndTimeMs != null) __obj.updateDynamic("flightEndTimeMs")(flightEndTimeMs.asInstanceOf[js.Any])
    if (flightStartTimeMs != null) __obj.updateDynamic("flightStartTimeMs")(flightStartTimeMs.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCreatorSignedOff)) __obj.updateDynamic("hasCreatorSignedOff")(hasCreatorSignedOff.get.asInstanceOf[js.Any])
    if (inventorySource != null) __obj.updateDynamic("inventorySource")(inventorySource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastUpdateTimeMs != null) __obj.updateDynamic("lastUpdateTimeMs")(lastUpdateTimeMs.asInstanceOf[js.Any])
    if (legacyOfferId != null) __obj.updateDynamic("legacyOfferId")(legacyOfferId.asInstanceOf[js.Any])
    if (marketplacePublisherProfileId != null) __obj.updateDynamic("marketplacePublisherProfileId")(marketplacePublisherProfileId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (privateAuctionId != null) __obj.updateDynamic("privateAuctionId")(privateAuctionId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (publisherProfileId != null) __obj.updateDynamic("publisherProfileId")(publisherProfileId.asInstanceOf[js.Any])
    if (publisherProvidedForecast != null) __obj.updateDynamic("publisherProvidedForecast")(publisherProvidedForecast.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (sharedTargetings != null) __obj.updateDynamic("sharedTargetings")(sharedTargetings.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (syndicationProduct != null) __obj.updateDynamic("syndicationProduct")(syndicationProduct.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

