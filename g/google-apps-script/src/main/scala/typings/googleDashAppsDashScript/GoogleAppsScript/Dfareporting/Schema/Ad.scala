package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ad extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var audienceSegmentId: js.UndefOr[String] = js.undefined
  var campaignId: js.UndefOr[String] = js.undefined
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  var comments: js.UndefOr[String] = js.undefined
  var compatibility: js.UndefOr[String] = js.undefined
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  var creativeRotation: js.UndefOr[CreativeRotation] = js.undefined
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  var deliverySchedule: js.UndefOr[DeliverySchedule] = js.undefined
  var dynamicClickTracker: js.UndefOr[Boolean] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placementAssignments: js.UndefOr[js.Array[PlacementAssignment]] = js.undefined
  var remarketingListExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var targetingTemplateId: js.UndefOr[String] = js.undefined
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Ad {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentId: String = null,
    campaignId: String = null,
    campaignIdDimensionValue: DimensionValue = null,
    clickThroughUrl: ClickThroughUrl = null,
    clickThroughUrlSuffixProperties: ClickThroughUrlSuffixProperties = null,
    comments: String = null,
    compatibility: String = null,
    createInfo: LastModifiedInfo = null,
    creativeGroupAssignments: js.Array[CreativeGroupAssignment] = null,
    creativeRotation: CreativeRotation = null,
    dayPartTargeting: DayPartTargeting = null,
    defaultClickThroughEventTagProperties: DefaultClickThroughEventTagProperties = null,
    deliverySchedule: DeliverySchedule = null,
    dynamicClickTracker: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    eventTagOverrides: js.Array[EventTagOverride] = null,
    geoTargeting: GeoTargeting = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    keyValueTargetingExpression: KeyValueTargetingExpression = null,
    kind: String = null,
    languageTargeting: LanguageTargeting = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    placementAssignments: js.Array[PlacementAssignment] = null,
    remarketingListExpression: ListTargetingExpression = null,
    size: Size = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslRequired: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null,
    subaccountId: String = null,
    targetingTemplateId: String = null,
    technologyTargeting: TechnologyTargeting = null,
    `type`: String = null
  ): Ad = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (audienceSegmentId != null) __obj.updateDynamic("audienceSegmentId")(audienceSegmentId.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo.asInstanceOf[js.Any])
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments.asInstanceOf[js.Any])
    if (creativeRotation != null) __obj.updateDynamic("creativeRotation")(creativeRotation.asInstanceOf[js.Any])
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting.asInstanceOf[js.Any])
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties.asInstanceOf[js.Any])
    if (deliverySchedule != null) __obj.updateDynamic("deliverySchedule")(deliverySchedule.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides.asInstanceOf[js.Any])
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placementAssignments != null) __obj.updateDynamic("placementAssignments")(placementAssignments.asInstanceOf[js.Any])
    if (remarketingListExpression != null) __obj.updateDynamic("remarketingListExpression")(remarketingListExpression.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ad]
  }
}

