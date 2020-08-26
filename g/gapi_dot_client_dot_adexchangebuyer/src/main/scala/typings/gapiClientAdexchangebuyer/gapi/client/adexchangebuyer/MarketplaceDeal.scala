package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceDeal extends js.Object {
  /** Buyer private data (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.native
  /** The time (ms since epoch) of the deal creation. (readonly) */
  var creationTimeMs: js.UndefOr[String] = js.native
  /** Specifies the creative pre-approval policy (buyer-readonly) */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  /** Specifies whether the creative is safeFrame compatible (buyer-readonly) */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  /** A unique deal-id for the deal (readonly). */
  var dealId: js.UndefOr[String] = js.native
  /** Metadata about the serving status of this deal (readonly, writes via custom actions) */
  var dealServingMetadata: js.UndefOr[DealServingMetadata] = js.native
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
    * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.native
  /** The external deal id assigned to this deal once the deal is finalized. This is the deal-id that shows up in serving/reporting etc. (readonly) */
  var externalDealId: js.UndefOr[String] = js.native
  /** Proposed flight end time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  /** Proposed flight start time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  /** Description for the deal terms. (buyer-readonly) */
  var inventoryDescription: js.UndefOr[String] = js.native
  /** Indicates whether the current deal is a RFP template. RFP template is created by buyer and not based on seller created products. */
  var isRfpTemplate: js.UndefOr[Boolean] = js.native
  /** True, if the buyside inventory setup is complete for this deal. (readonly, except via OrderSetupCompleted action) */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceDeal". */
  var kind: js.UndefOr[String] = js.native
  /** The time (ms since epoch) when the deal was last updated. (readonly) */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  /** The name of the deal. (updatable) */
  var name: js.UndefOr[String] = js.native
  /** The product-id from which this deal was created. (readonly, except on create) */
  var productId: js.UndefOr[String] = js.native
  /** The revision number of the product that the deal was created from (readonly, except on create) */
  var productRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by seller and ADVERTISR means creative is provided by buyer.
    * (buyer-readonly)
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  var proposalId: js.UndefOr[String] = js.native
  /** Optional Seller contact information for the deal (buyer-readonly) */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  /** The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd together. (updatable) */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.native
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[String] = js.native
  /** The negotiable terms of the deal. (updatable) */
  var terms: js.UndefOr[DealTerms] = js.native
  var webPropertyCode: js.UndefOr[String] = js.native
}

object MarketplaceDeal {
  @scala.inline
  def apply(): MarketplaceDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceDeal]
  }
  @scala.inline
  implicit class MarketplaceDealOps[Self <: MarketplaceDeal] (val x: Self) extends AnyVal {
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
    def setBuyerPrivateData(value: PrivateData): Self = this.set("buyerPrivateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerPrivateData: Self = this.set("buyerPrivateData", js.undefined)
    @scala.inline
    def setCreationTimeMs(value: String): Self = this.set("creationTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeMs: Self = this.set("creationTimeMs", js.undefined)
    @scala.inline
    def setCreativePreApprovalPolicy(value: String): Self = this.set("creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativePreApprovalPolicy: Self = this.set("creativePreApprovalPolicy", js.undefined)
    @scala.inline
    def setCreativeSafeFrameCompatibility(value: String): Self = this.set("creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeSafeFrameCompatibility: Self = this.set("creativeSafeFrameCompatibility", js.undefined)
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    @scala.inline
    def setDealServingMetadata(value: DealServingMetadata): Self = this.set("dealServingMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealServingMetadata: Self = this.set("dealServingMetadata", js.undefined)
    @scala.inline
    def setDeliveryControl(value: DeliveryControl): Self = this.set("deliveryControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryControl: Self = this.set("deliveryControl", js.undefined)
    @scala.inline
    def setExternalDealId(value: String): Self = this.set("externalDealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDealId: Self = this.set("externalDealId", js.undefined)
    @scala.inline
    def setFlightEndTimeMs(value: String): Self = this.set("flightEndTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlightEndTimeMs: Self = this.set("flightEndTimeMs", js.undefined)
    @scala.inline
    def setFlightStartTimeMs(value: String): Self = this.set("flightStartTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlightStartTimeMs: Self = this.set("flightStartTimeMs", js.undefined)
    @scala.inline
    def setInventoryDescription(value: String): Self = this.set("inventoryDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryDescription: Self = this.set("inventoryDescription", js.undefined)
    @scala.inline
    def setIsRfpTemplate(value: Boolean): Self = this.set("isRfpTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRfpTemplate: Self = this.set("isRfpTemplate", js.undefined)
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = this.set("isSetupComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSetupComplete: Self = this.set("isSetupComplete", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastUpdateTimeMs(value: String): Self = this.set("lastUpdateTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTimeMs: Self = this.set("lastUpdateTimeMs", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductRevisionNumber(value: String): Self = this.set("productRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductRevisionNumber: Self = this.set("productRevisionNumber", js.undefined)
    @scala.inline
    def setProgrammaticCreativeSource(value: String): Self = this.set("programmaticCreativeSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgrammaticCreativeSource: Self = this.set("programmaticCreativeSource", js.undefined)
    @scala.inline
    def setProposalId(value: String): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
    @scala.inline
    def setSellerContactsVarargs(value: ContactInformation*): Self = this.set("sellerContacts", js.Array(value :_*))
    @scala.inline
    def setSellerContacts(value: js.Array[ContactInformation]): Self = this.set("sellerContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerContacts: Self = this.set("sellerContacts", js.undefined)
    @scala.inline
    def setSharedTargetingsVarargs(value: SharedTargeting*): Self = this.set("sharedTargetings", js.Array(value :_*))
    @scala.inline
    def setSharedTargetings(value: js.Array[SharedTargeting]): Self = this.set("sharedTargetings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedTargetings: Self = this.set("sharedTargetings", js.undefined)
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

