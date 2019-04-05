package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placement extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var adBlockingOptOut: js.UndefOr[scala.Boolean] = js.undefined
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  var contentCategoryId: js.UndefOr[java.lang.String] = js.undefined
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var keyName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var paymentApproved: js.UndefOr[scala.Boolean] = js.undefined
  var paymentSource: js.UndefOr[java.lang.String] = js.undefined
  var placementGroupId: js.UndefOr[java.lang.String] = js.undefined
  var placementGroupIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var placementStrategyId: js.UndefOr[java.lang.String] = js.undefined
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var publisherUpdateInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var tagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tagSetting: js.UndefOr[TagSetting] = js.undefined
  var videoActiveViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  var videoSettings: js.UndefOr[VideoSettings] = js.undefined
  var vpaidAdapterChoice: js.UndefOr[java.lang.String] = js.undefined
}

object Placement {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    adBlockingOptOut: js.UndefOr[scala.Boolean] = js.undefined,
    additionalSizes: js.Array[Size] = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    campaignId: java.lang.String = null,
    campaignIdDimensionValue: DimensionValue = null,
    comment: java.lang.String = null,
    compatibility: java.lang.String = null,
    contentCategoryId: java.lang.String = null,
    createInfo: LastModifiedInfo = null,
    directorySiteId: java.lang.String = null,
    directorySiteIdDimensionValue: DimensionValue = null,
    externalId: java.lang.String = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    keyName: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    lookbackConfiguration: LookbackConfiguration = null,
    name: java.lang.String = null,
    paymentApproved: js.UndefOr[scala.Boolean] = js.undefined,
    paymentSource: java.lang.String = null,
    placementGroupId: java.lang.String = null,
    placementGroupIdDimensionValue: DimensionValue = null,
    placementStrategyId: java.lang.String = null,
    pricingSchedule: PricingSchedule = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    publisherUpdateInfo: LastModifiedInfo = null,
    siteId: java.lang.String = null,
    siteIdDimensionValue: DimensionValue = null,
    size: Size = null,
    sslRequired: js.UndefOr[scala.Boolean] = js.undefined,
    status: java.lang.String = null,
    subaccountId: java.lang.String = null,
    tagFormats: js.Array[java.lang.String] = null,
    tagSetting: TagSetting = null,
    videoActiveViewOptOut: js.UndefOr[scala.Boolean] = js.undefined,
    videoSettings: VideoSettings = null,
    vpaidAdapterChoice: java.lang.String = null
  ): Placement = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(adBlockingOptOut)) __obj.updateDynamic("adBlockingOptOut")(adBlockingOptOut)
    if (additionalSizes != null) __obj.updateDynamic("additionalSizes")(additionalSizes)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility)
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId)
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo)
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId)
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (keyName != null) __obj.updateDynamic("keyName")(keyName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(paymentApproved)) __obj.updateDynamic("paymentApproved")(paymentApproved)
    if (paymentSource != null) __obj.updateDynamic("paymentSource")(paymentSource)
    if (placementGroupId != null) __obj.updateDynamic("placementGroupId")(placementGroupId)
    if (placementGroupIdDimensionValue != null) __obj.updateDynamic("placementGroupIdDimensionValue")(placementGroupIdDimensionValue)
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId)
    if (pricingSchedule != null) __obj.updateDynamic("pricingSchedule")(pricingSchedule)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (publisherUpdateInfo != null) __obj.updateDynamic("publisherUpdateInfo")(publisherUpdateInfo)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (tagFormats != null) __obj.updateDynamic("tagFormats")(tagFormats)
    if (tagSetting != null) __obj.updateDynamic("tagSetting")(tagSetting)
    if (!js.isUndefined(videoActiveViewOptOut)) __obj.updateDynamic("videoActiveViewOptOut")(videoActiveViewOptOut)
    if (videoSettings != null) __obj.updateDynamic("videoSettings")(videoSettings)
    if (vpaidAdapterChoice != null) __obj.updateDynamic("vpaidAdapterChoice")(vpaidAdapterChoice)
    __obj.asInstanceOf[Placement]
  }
}

