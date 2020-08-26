package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /** The billed buyer corresponding to the buyer that created the offer. (readonly, except on create) */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  /** The buyer that created the offer if this is a buyer initiated offer (readonly, except on create) */
  var buyer: js.UndefOr[Buyer] = js.native
  /** Creation time in ms. since epoch (readonly) */
  var creationTimeMs: js.UndefOr[String] = js.native
  /** Optional contact information for the creator of this product. (buyer-readonly) */
  var creatorContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  /** The role that created the offer. Set to BUYER for buyer initiated offers. */
  var creatorRole: js.UndefOr[String] = js.native
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
    * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.native
  /** The proposed end time for the deal (ms since epoch) (buyer-readonly) */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  /** Inventory availability dates. (times are in ms since epoch) The granularity is generally in the order of seconds. (buyer-readonly) */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal,
    * if any of the terms are changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.native
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#product". */
  var kind: js.UndefOr[String] = js.native
  /** Optional List of labels for the product (optional, buyer-readonly). */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.native
  /** Time of last update in ms. since epoch (readonly) */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  /** Optional legacy offer id if this offer is a preferred deal offer. */
  var legacyOfferId: js.UndefOr[String] = js.native
  /**
    * Marketplace publisher profile Id. This Id differs from the regular publisher_profile_id in that 1. This is a new id, the old Id will be deprecated in
    * 2017. 2. This id uniquely identifies a publisher profile by itself.
    */
  var marketplacePublisherProfileId: js.UndefOr[String] = js.native
  /** The name for this product as set by the seller. (buyer-readonly) */
  var name: js.UndefOr[String] = js.native
  /** Optional private auction id if this offer is a private auction offer. */
  var privateAuctionId: js.UndefOr[String] = js.native
  /** The unique id for the product (readonly) */
  var productId: js.UndefOr[String] = js.native
  /**
    * Id of the publisher profile for a given seller. A (seller.account_id, publisher_profile_id) pair uniquely identifies a publisher profile. Buyers can
    * call the PublisherProfiles::List endpoint to get a list of publisher profiles for a given seller.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /** Publisher self-provided forecast information. */
  var publisherProvidedForecast: js.UndefOr[PublisherProvidedForecast] = js.native
  /** The revision number of the product. (readonly) */
  var revisionNumber: js.UndefOr[String] = js.native
  /** Information about the seller that created this product (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.native
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting criteria has a specified key and for each key there is a list of inclusion
    * value or exclusion values. (buyer-readonly)
    */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.native
  /** The state of the product. (buyer-readonly) */
  var state: js.UndefOr[String] = js.native
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[String] = js.native
  /** The negotiable terms of the deal (buyer-readonly) */
  var terms: js.UndefOr[DealTerms] = js.native
  /** The web property code for the seller. This field is meant to be copied over as is when creating deals. */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setBilledBuyer(value: Buyer): Self = this.set("billedBuyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilledBuyer: Self = this.set("billedBuyer", js.undefined)
    @scala.inline
    def setBuyer(value: Buyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    @scala.inline
    def setCreationTimeMs(value: String): Self = this.set("creationTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeMs: Self = this.set("creationTimeMs", js.undefined)
    @scala.inline
    def setCreatorContactsVarargs(value: ContactInformation*): Self = this.set("creatorContacts", js.Array(value :_*))
    @scala.inline
    def setCreatorContacts(value: js.Array[ContactInformation]): Self = this.set("creatorContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorContacts: Self = this.set("creatorContacts", js.undefined)
    @scala.inline
    def setCreatorRole(value: String): Self = this.set("creatorRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRole: Self = this.set("creatorRole", js.undefined)
    @scala.inline
    def setDeliveryControl(value: DeliveryControl): Self = this.set("deliveryControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryControl: Self = this.set("deliveryControl", js.undefined)
    @scala.inline
    def setFlightEndTimeMs(value: String): Self = this.set("flightEndTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlightEndTimeMs: Self = this.set("flightEndTimeMs", js.undefined)
    @scala.inline
    def setFlightStartTimeMs(value: String): Self = this.set("flightStartTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlightStartTimeMs: Self = this.set("flightStartTimeMs", js.undefined)
    @scala.inline
    def setHasCreatorSignedOff(value: Boolean): Self = this.set("hasCreatorSignedOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCreatorSignedOff: Self = this.set("hasCreatorSignedOff", js.undefined)
    @scala.inline
    def setInventorySource(value: String): Self = this.set("inventorySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventorySource: Self = this.set("inventorySource", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: MarketplaceLabel*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[MarketplaceLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastUpdateTimeMs(value: String): Self = this.set("lastUpdateTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTimeMs: Self = this.set("lastUpdateTimeMs", js.undefined)
    @scala.inline
    def setLegacyOfferId(value: String): Self = this.set("legacyOfferId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyOfferId: Self = this.set("legacyOfferId", js.undefined)
    @scala.inline
    def setMarketplacePublisherProfileId(value: String): Self = this.set("marketplacePublisherProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketplacePublisherProfileId: Self = this.set("marketplacePublisherProfileId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrivateAuctionId(value: String): Self = this.set("privateAuctionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateAuctionId: Self = this.set("privateAuctionId", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setPublisherProfileId(value: String): Self = this.set("publisherProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherProfileId: Self = this.set("publisherProfileId", js.undefined)
    @scala.inline
    def setPublisherProvidedForecast(value: PublisherProvidedForecast): Self = this.set("publisherProvidedForecast", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherProvidedForecast: Self = this.set("publisherProvidedForecast", js.undefined)
    @scala.inline
    def setRevisionNumber(value: String): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
    @scala.inline
    def setSeller(value: Seller): Self = this.set("seller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    @scala.inline
    def setSharedTargetingsVarargs(value: SharedTargeting*): Self = this.set("sharedTargetings", js.Array(value :_*))
    @scala.inline
    def setSharedTargetings(value: js.Array[SharedTargeting]): Self = this.set("sharedTargetings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedTargetings: Self = this.set("sharedTargetings", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSyndicationProduct(value: String): Self = this.set("syndicationProduct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyndicationProduct: Self = this.set("syndicationProduct", js.undefined)
    @scala.inline
    def setTerms(value: DealTerms): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    @scala.inline
    def setWebPropertyCode(value: String): Self = this.set("webPropertyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyCode: Self = this.set("webPropertyCode", js.undefined)
  }
  
}

