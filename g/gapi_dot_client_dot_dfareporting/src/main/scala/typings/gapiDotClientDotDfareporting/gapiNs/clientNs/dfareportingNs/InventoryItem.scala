package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends js.Object {
  /** Account ID of this inventory item. */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * Ad slots of this inventory item. If this inventory item represents a standalone placement, there will be exactly one ad slot. If this inventory item
    * represents a placement group, there will be more than one ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.undefined
  /** Advertiser ID of this inventory item. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Content category ID of this inventory item. */
  var contentCategoryId: js.UndefOr[String] = js.undefined
  /** Estimated click-through rate of this inventory item. */
  var estimatedClickThroughRate: js.UndefOr[String] = js.undefined
  /** Estimated conversion rate of this inventory item. */
  var estimatedConversionRate: js.UndefOr[String] = js.undefined
  /** ID of this inventory item. */
  var id: js.UndefOr[String] = js.undefined
  /** Whether this inventory item is in plan. */
  var inPlan: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItem". */
  var kind: js.UndefOr[String] = js.undefined
  /** Information about the most recent modification of this inventory item. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Name of this inventory item. For standalone inventory items, this is the same name as that of its only ad slot. For group inventory items, this can
    * differ from the name of any of its ad slots.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Negotiation channel ID of this inventory item. */
  var negotiationChannelId: js.UndefOr[String] = js.undefined
  /** Order ID of this inventory item. */
  var orderId: js.UndefOr[String] = js.undefined
  /** Placement strategy ID of this inventory item. */
  var placementStrategyId: js.UndefOr[String] = js.undefined
  /** Pricing of this inventory item. */
  var pricing: js.UndefOr[Pricing] = js.undefined
  /** Project ID of this inventory item. */
  var projectId: js.UndefOr[String] = js.undefined
  /** RFP ID of this inventory item. */
  var rfpId: js.UndefOr[String] = js.undefined
  /** ID of the site this inventory item is associated with. */
  var siteId: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this inventory item. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Type of inventory item. */
  var `type`: js.UndefOr[String] = js.undefined
}

object InventoryItem {
  @scala.inline
  def apply(
    accountId: String = null,
    adSlots: js.Array[AdSlot] = null,
    advertiserId: String = null,
    contentCategoryId: String = null,
    estimatedClickThroughRate: String = null,
    estimatedConversionRate: String = null,
    id: String = null,
    inPlan: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    negotiationChannelId: String = null,
    orderId: String = null,
    placementStrategyId: String = null,
    pricing: Pricing = null,
    projectId: String = null,
    rfpId: String = null,
    siteId: String = null,
    subaccountId: String = null,
    `type`: String = null
  ): InventoryItem = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (adSlots != null) __obj.updateDynamic("adSlots")(adSlots)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId)
    if (estimatedClickThroughRate != null) __obj.updateDynamic("estimatedClickThroughRate")(estimatedClickThroughRate)
    if (estimatedConversionRate != null) __obj.updateDynamic("estimatedConversionRate")(estimatedConversionRate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inPlan)) __obj.updateDynamic("inPlan")(inPlan)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negotiationChannelId != null) __obj.updateDynamic("negotiationChannelId")(negotiationChannelId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId)
    if (pricing != null) __obj.updateDynamic("pricing")(pricing)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (rfpId != null) __obj.updateDynamic("rfpId")(rfpId)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InventoryItem]
  }
}

