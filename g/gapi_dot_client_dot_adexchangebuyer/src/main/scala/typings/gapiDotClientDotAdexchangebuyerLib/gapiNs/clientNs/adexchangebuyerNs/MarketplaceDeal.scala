package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MarketplaceDeal extends js.Object {
  /** Buyer private data (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.undefined
  /** The time (ms since epoch) of the deal creation. (readonly) */
  var creationTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the creative pre-approval policy (buyer-readonly) */
  var creativePreApprovalPolicy: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the creative is safeFrame compatible (buyer-readonly) */
  var creativeSafeFrameCompatibility: js.UndefOr[java.lang.String] = js.undefined
  /** A unique deal-id for the deal (readonly). */
  var dealId: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the serving status of this deal (readonly, writes via custom actions) */
  var dealServingMetadata: js.UndefOr[DealServingMetadata] = js.undefined
  /**
               * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
               * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
               */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.undefined
  /** The external deal id assigned to this deal once the deal is finalized. This is the deal-id that shows up in serving/reporting etc. (readonly) */
  var externalDealId: js.UndefOr[java.lang.String] = js.undefined
  /** Proposed flight end time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightEndTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Proposed flight start time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightStartTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Description for the deal terms. (buyer-readonly) */
  var inventoryDescription: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the current deal is a RFP template. RFP template is created by buyer and not based on seller created products. */
  var isRfpTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /** True, if the buyside inventory setup is complete for this deal. (readonly, except via OrderSetupCompleted action) */
  var isSetupComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceDeal". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time (ms since epoch) when the deal was last updated. (readonly) */
  var lastUpdateTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the deal. (updatable) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The product-id from which this deal was created. (readonly, except on create) */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The revision number of the product that the deal was created from (readonly, except on create) */
  var productRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by seller and ADVERTISR means creative is provided by buyer.
               * (buyer-readonly)
               */
  var programmaticCreativeSource: js.UndefOr[java.lang.String] = js.undefined
  var proposalId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional Seller contact information for the deal (buyer-readonly) */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  /** The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd together. (updatable) */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.undefined
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[java.lang.String] = js.undefined
  /** The negotiable terms of the deal. (updatable) */
  var terms: js.UndefOr[DealTerms] = js.undefined
  var webPropertyCode: js.UndefOr[java.lang.String] = js.undefined
}

