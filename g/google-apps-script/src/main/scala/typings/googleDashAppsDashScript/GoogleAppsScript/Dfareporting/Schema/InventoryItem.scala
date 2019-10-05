package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

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

