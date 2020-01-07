package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a buy from the Planning inventory store.
  */
@js.native
trait Schema$InventoryItem extends js.Object {
  /**
    * Account ID of this inventory item.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ad slots of this inventory item. If this inventory item represents a
    * standalone placement, there will be exactly one ad slot. If this
    * inventory item represents a placement group, there will be more than one
    * ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[Schema$AdSlot]] = js.native
  /**
    * Advertiser ID of this inventory item.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Content category ID of this inventory item.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  /**
    * Estimated click-through rate of this inventory item.
    */
  var estimatedClickThroughRate: js.UndefOr[String] = js.native
  /**
    * Estimated conversion rate of this inventory item.
    */
  var estimatedConversionRate: js.UndefOr[String] = js.native
  /**
    * ID of this inventory item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this inventory item is in plan.
    */
  var inPlan: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this inventory item.
    */
  var lastModifiedInfo: js.UndefOr[Schema$LastModifiedInfo] = js.native
  /**
    * Name of this inventory item. For standalone inventory items, this is the
    * same name as that of its only ad slot. For group inventory items, this
    * can differ from the name of any of its ad slots.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Negotiation channel ID of this inventory item.
    */
  var negotiationChannelId: js.UndefOr[String] = js.native
  /**
    * Order ID of this inventory item.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Placement strategy ID of this inventory item.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  /**
    * Pricing of this inventory item.
    */
  var pricing: js.UndefOr[Schema$Pricing] = js.native
  /**
    * Project ID of this inventory item.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * RFP ID of this inventory item.
    */
  var rfpId: js.UndefOr[String] = js.native
  /**
    * ID of the site this inventory item is associated with.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this inventory item.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Type of inventory item.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$InventoryItem {
  @scala.inline
  def apply(
    accountId: String = null,
    adSlots: js.Array[Schema$AdSlot] = null,
    advertiserId: String = null,
    contentCategoryId: String = null,
    estimatedClickThroughRate: String = null,
    estimatedConversionRate: String = null,
    id: String = null,
    inPlan: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastModifiedInfo: Schema$LastModifiedInfo = null,
    name: String = null,
    negotiationChannelId: String = null,
    orderId: String = null,
    placementStrategyId: String = null,
    pricing: Schema$Pricing = null,
    projectId: String = null,
    rfpId: String = null,
    siteId: String = null,
    subaccountId: String = null,
    `type`: String = null
  ): Schema$InventoryItem = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (adSlots != null) __obj.updateDynamic("adSlots")(adSlots.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId.asInstanceOf[js.Any])
    if (estimatedClickThroughRate != null) __obj.updateDynamic("estimatedClickThroughRate")(estimatedClickThroughRate.asInstanceOf[js.Any])
    if (estimatedConversionRate != null) __obj.updateDynamic("estimatedConversionRate")(estimatedConversionRate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlan)) __obj.updateDynamic("inPlan")(inPlan.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negotiationChannelId != null) __obj.updateDynamic("negotiationChannelId")(negotiationChannelId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (rfpId != null) __obj.updateDynamic("rfpId")(rfpId.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryItem]
  }
}

