package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A proposal can contain multiple deals. A deal contains the terms and
  * targeting information that is used for serving.
  */
@js.native
trait Schema$MarketplaceDeal extends js.Object {
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[Schema$PrivateData] = js.native
  /**
    * The time (ms since epoch) of the deal creation. (readonly)
    */
  var creationTimeMs: js.UndefOr[String] = js.native
  /**
    * Specifies the creative pre-approval policy (buyer-readonly)
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  /**
    * Specifies whether the creative is safeFrame compatible (buyer-readonly)
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  /**
    * A unique deal-id for the deal (readonly).
    */
  var dealId: js.UndefOr[String] = js.native
  /**
    * Metadata about the serving status of this deal (readonly, writes via
    * custom actions)
    */
  var dealServingMetadata: js.UndefOr[Schema$DealServingMetadata] = js.native
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher. This
    * message is assigned an id of 100 since some day we would want to model
    * this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[Schema$DeliveryControl] = js.native
  /**
    * The external deal id assigned to this deal once the deal is finalized.
    * This is the deal-id that shows up in serving/reporting etc. (readonly)
    */
  var externalDealId: js.UndefOr[String] = js.native
  /**
    * Proposed flight end time of the deal (ms since epoch) This will generally
    * be stored in a granularity of a second. (updatable)
    */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  /**
    * Proposed flight start time of the deal (ms since epoch) This will
    * generally be stored in a granularity of a second. (updatable)
    */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Description for the deal terms. (buyer-readonly)
    */
  var inventoryDescription: js.UndefOr[String] = js.native
  /**
    * Indicates whether the current deal is a RFP template. RFP template is
    * created by buyer and not based on seller created products.
    */
  var isRfpTemplate: js.UndefOr[Boolean] = js.native
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * (readonly, except via OrderSetupCompleted action)
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#marketplaceDeal&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time (ms since epoch) when the deal was last updated. (readonly)
    */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  /**
    * The name of the deal. (updatable)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The product-id from which this deal was created. (readonly, except on
    * create)
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The revision number of the product that the deal was created from
    * (readonly, except on create)
    */
  var productRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Specifies the creative source for programmatic deals, PUBLISHER means
    * creative is provided by seller and ADVERTISR means creative is provided
    * by buyer. (buyer-readonly)
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  var proposalId: js.UndefOr[String] = js.native
  /**
    * Optional Seller contact information for the deal (buyer-readonly)
    */
  var sellerContacts: js.UndefOr[js.Array[Schema$ContactInformation]] = js.native
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together. (updatable)
    */
  var sharedTargetings: js.UndefOr[js.Array[Schema$SharedTargeting]] = js.native
  /**
    * The syndication product associated with the deal. (readonly, except on
    * create)
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  /**
    * The negotiable terms of the deal. (updatable)
    */
  var terms: js.UndefOr[Schema$DealTerms] = js.native
  var webPropertyCode: js.UndefOr[String] = js.native
}

object Schema$MarketplaceDeal {
  @scala.inline
  def apply(
    buyerPrivateData: Schema$PrivateData = null,
    creationTimeMs: String = null,
    creativePreApprovalPolicy: String = null,
    creativeSafeFrameCompatibility: String = null,
    dealId: String = null,
    dealServingMetadata: Schema$DealServingMetadata = null,
    deliveryControl: Schema$DeliveryControl = null,
    externalDealId: String = null,
    flightEndTimeMs: String = null,
    flightStartTimeMs: String = null,
    inventoryDescription: String = null,
    isRfpTemplate: js.UndefOr[Boolean] = js.undefined,
    isSetupComplete: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastUpdateTimeMs: String = null,
    name: String = null,
    productId: String = null,
    productRevisionNumber: String = null,
    programmaticCreativeSource: String = null,
    proposalId: String = null,
    sellerContacts: js.Array[Schema$ContactInformation] = null,
    sharedTargetings: js.Array[Schema$SharedTargeting] = null,
    syndicationProduct: String = null,
    terms: Schema$DealTerms = null,
    webPropertyCode: String = null
  ): Schema$MarketplaceDeal = {
    val __obj = js.Dynamic.literal()
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData.asInstanceOf[js.Any])
    if (creationTimeMs != null) __obj.updateDynamic("creationTimeMs")(creationTimeMs.asInstanceOf[js.Any])
    if (creativePreApprovalPolicy != null) __obj.updateDynamic("creativePreApprovalPolicy")(creativePreApprovalPolicy.asInstanceOf[js.Any])
    if (creativeSafeFrameCompatibility != null) __obj.updateDynamic("creativeSafeFrameCompatibility")(creativeSafeFrameCompatibility.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (dealServingMetadata != null) __obj.updateDynamic("dealServingMetadata")(dealServingMetadata.asInstanceOf[js.Any])
    if (deliveryControl != null) __obj.updateDynamic("deliveryControl")(deliveryControl.asInstanceOf[js.Any])
    if (externalDealId != null) __obj.updateDynamic("externalDealId")(externalDealId.asInstanceOf[js.Any])
    if (flightEndTimeMs != null) __obj.updateDynamic("flightEndTimeMs")(flightEndTimeMs.asInstanceOf[js.Any])
    if (flightStartTimeMs != null) __obj.updateDynamic("flightStartTimeMs")(flightStartTimeMs.asInstanceOf[js.Any])
    if (inventoryDescription != null) __obj.updateDynamic("inventoryDescription")(inventoryDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(isRfpTemplate)) __obj.updateDynamic("isRfpTemplate")(isRfpTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdateTimeMs != null) __obj.updateDynamic("lastUpdateTimeMs")(lastUpdateTimeMs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productRevisionNumber != null) __obj.updateDynamic("productRevisionNumber")(productRevisionNumber.asInstanceOf[js.Any])
    if (programmaticCreativeSource != null) __obj.updateDynamic("programmaticCreativeSource")(programmaticCreativeSource.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts.asInstanceOf[js.Any])
    if (sharedTargetings != null) __obj.updateDynamic("sharedTargetings")(sharedTargetings.asInstanceOf[js.Any])
    if (syndicationProduct != null) __obj.updateDynamic("syndicationProduct")(syndicationProduct.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MarketplaceDeal]
  }
}

