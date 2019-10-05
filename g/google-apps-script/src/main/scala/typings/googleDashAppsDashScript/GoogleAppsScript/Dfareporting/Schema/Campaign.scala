package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaign extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var adBlockingConfiguration: js.UndefOr[AdBlockingConfiguration] = js.undefined
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[CreativeOptimizationConfiguration]] = js.undefined
  var advertiserGroupId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var audienceSegmentGroups: js.UndefOr[js.Array[AudienceSegmentGroup]] = js.undefined
  var billingInvoiceCode: js.UndefOr[String] = js.undefined
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var creativeGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  var creativeOptimizationConfiguration: js.UndefOr[CreativeOptimizationConfiguration] = js.undefined
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  var defaultLandingPageId: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  var externalId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var traffickerEmails: js.UndefOr[js.Array[String]] = js.undefined
}

object Campaign {
  @scala.inline
  def apply(
    accountId: String = null,
    adBlockingConfiguration: AdBlockingConfiguration = null,
    additionalCreativeOptimizationConfigurations: js.Array[CreativeOptimizationConfiguration] = null,
    advertiserGroupId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentGroups: js.Array[AudienceSegmentGroup] = null,
    billingInvoiceCode: String = null,
    clickThroughUrlSuffixProperties: ClickThroughUrlSuffixProperties = null,
    comment: String = null,
    createInfo: LastModifiedInfo = null,
    creativeGroupIds: js.Array[String] = null,
    creativeOptimizationConfiguration: CreativeOptimizationConfiguration = null,
    defaultClickThroughEventTagProperties: DefaultClickThroughEventTagProperties = null,
    defaultLandingPageId: String = null,
    endDate: String = null,
    eventTagOverrides: js.Array[EventTagOverride] = null,
    externalId: String = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined,
    startDate: String = null,
    subaccountId: String = null,
    traffickerEmails: js.Array[String] = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (adBlockingConfiguration != null) __obj.updateDynamic("adBlockingConfiguration")(adBlockingConfiguration)
    if (additionalCreativeOptimizationConfigurations != null) __obj.updateDynamic("additionalCreativeOptimizationConfigurations")(additionalCreativeOptimizationConfigurations)
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (audienceSegmentGroups != null) __obj.updateDynamic("audienceSegmentGroups")(audienceSegmentGroups)
    if (billingInvoiceCode != null) __obj.updateDynamic("billingInvoiceCode")(billingInvoiceCode)
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo)
    if (creativeGroupIds != null) __obj.updateDynamic("creativeGroupIds")(creativeGroupIds)
    if (creativeOptimizationConfiguration != null) __obj.updateDynamic("creativeOptimizationConfiguration")(creativeOptimizationConfiguration)
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties)
    if (defaultLandingPageId != null) __obj.updateDynamic("defaultLandingPageId")(defaultLandingPageId)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (traffickerEmails != null) __obj.updateDynamic("traffickerEmails")(traffickerEmails)
    __obj.asInstanceOf[Campaign]
  }
}

