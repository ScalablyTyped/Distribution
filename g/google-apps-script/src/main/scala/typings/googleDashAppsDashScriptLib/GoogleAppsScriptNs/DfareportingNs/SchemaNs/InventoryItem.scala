package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var contentCategoryId: js.UndefOr[java.lang.String] = js.undefined
  var estimatedClickThroughRate: js.UndefOr[java.lang.String] = js.undefined
  var estimatedConversionRate: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inPlan: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var negotiationChannelId: js.UndefOr[java.lang.String] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var placementStrategyId: js.UndefOr[java.lang.String] = js.undefined
  var pricing: js.UndefOr[Pricing] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var rfpId: js.UndefOr[java.lang.String] = js.undefined
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryItem {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    adSlots: js.Array[AdSlot] = null,
    advertiserId: java.lang.String = null,
    contentCategoryId: java.lang.String = null,
    estimatedClickThroughRate: java.lang.String = null,
    estimatedConversionRate: java.lang.String = null,
    id: java.lang.String = null,
    inPlan: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: java.lang.String = null,
    negotiationChannelId: java.lang.String = null,
    orderId: java.lang.String = null,
    placementStrategyId: java.lang.String = null,
    pricing: Pricing = null,
    projectId: java.lang.String = null,
    rfpId: java.lang.String = null,
    siteId: java.lang.String = null,
    subaccountId: java.lang.String = null,
    `type`: java.lang.String = null
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

