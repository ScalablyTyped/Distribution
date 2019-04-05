package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroup extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var childPlacementIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var contentCategoryId: js.UndefOr[java.lang.String] = js.undefined
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placementGroupType: js.UndefOr[java.lang.String] = js.undefined
  var placementStrategyId: js.UndefOr[java.lang.String] = js.undefined
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.undefined
  var primaryPlacementId: js.UndefOr[java.lang.String] = js.undefined
  var primaryPlacementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

object PlacementGroup {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    campaignId: java.lang.String = null,
    campaignIdDimensionValue: DimensionValue = null,
    childPlacementIds: js.Array[java.lang.String] = null,
    comment: java.lang.String = null,
    contentCategoryId: java.lang.String = null,
    createInfo: LastModifiedInfo = null,
    directorySiteId: java.lang.String = null,
    directorySiteIdDimensionValue: DimensionValue = null,
    externalId: java.lang.String = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: java.lang.String = null,
    placementGroupType: java.lang.String = null,
    placementStrategyId: java.lang.String = null,
    pricingSchedule: PricingSchedule = null,
    primaryPlacementId: java.lang.String = null,
    primaryPlacementIdDimensionValue: DimensionValue = null,
    siteId: java.lang.String = null,
    siteIdDimensionValue: DimensionValue = null,
    subaccountId: java.lang.String = null
  ): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue)
    if (childPlacementIds != null) __obj.updateDynamic("childPlacementIds")(childPlacementIds)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId)
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo)
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId)
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placementGroupType != null) __obj.updateDynamic("placementGroupType")(placementGroupType)
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId)
    if (pricingSchedule != null) __obj.updateDynamic("pricingSchedule")(pricingSchedule)
    if (primaryPlacementId != null) __obj.updateDynamic("primaryPlacementId")(primaryPlacementId)
    if (primaryPlacementIdDimensionValue != null) __obj.updateDynamic("primaryPlacementIdDimensionValue")(primaryPlacementIdDimensionValue)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[PlacementGroup]
  }
}

