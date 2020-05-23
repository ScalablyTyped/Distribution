package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var contentCategoryId: js.UndefOr[String] = js.undefined
  var estimatedClickThroughRate: js.UndefOr[String] = js.undefined
  var estimatedConversionRate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inPlan: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var negotiationChannelId: js.UndefOr[String] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
  var placementStrategyId: js.UndefOr[String] = js.undefined
  var pricing: js.UndefOr[Pricing] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var rfpId: js.UndefOr[String] = js.undefined
  var siteId: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (adSlots != null) __obj.updateDynamic("adSlots")(adSlots.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId.asInstanceOf[js.Any])
    if (estimatedClickThroughRate != null) __obj.updateDynamic("estimatedClickThroughRate")(estimatedClickThroughRate.asInstanceOf[js.Any])
    if (estimatedConversionRate != null) __obj.updateDynamic("estimatedConversionRate")(estimatedConversionRate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlan)) __obj.updateDynamic("inPlan")(inPlan.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[InventoryItem]
  }
}

