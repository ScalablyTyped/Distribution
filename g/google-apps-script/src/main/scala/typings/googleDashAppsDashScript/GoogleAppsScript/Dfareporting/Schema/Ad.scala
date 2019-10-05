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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (audienceSegmentId != null) __obj.updateDynamic("audienceSegmentId")(audienceSegmentId)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue)
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility)
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo)
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments)
    if (creativeRotation != null) __obj.updateDynamic("creativeRotation")(creativeRotation)
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting)
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties)
    if (deliverySchedule != null) __obj.updateDynamic("deliverySchedule")(deliverySchedule)
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides)
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placementAssignments != null) __obj.updateDynamic("placementAssignments")(placementAssignments)
    if (remarketingListExpression != null) __obj.updateDynamic("remarketingListExpression")(remarketingListExpression)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId)
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Ad]
  }
}

