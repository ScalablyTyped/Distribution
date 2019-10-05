package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ad extends js.Object {
  /** Account ID of this ad. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Whether this ad is active. When true, archived must be false. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Advertiser ID of this ad. This is a required field on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this ad is archived. When true, active must be false. */
  var archived: js.UndefOr[Boolean] = js.undefined
  /** Audience segment ID that is being targeted for this ad. Applicable when type is AD_SERVING_STANDARD_AD. */
  var audienceSegmentId: js.UndefOr[String] = js.undefined
  /** Campaign ID of this ad. This is a required field on insertion. */
  var campaignId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Click-through URL for this ad. This is a required field on insertion. Applicable when type is AD_SERVING_CLICK_TRACKER. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  /** Click-through URL suffix properties for this ad. Applies to the URL in the ad or (if overriding ad properties) the URL in the creative. */
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  /** Comments for this ad. */
  var comments: js.UndefOr[String] = js.undefined
  /**
    * Compatibility of this ad. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to either rendering on desktop or on
    * mobile devices or in mobile apps for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are only used for existing default ads. New
    * mobile placements must be assigned DISPLAY or DISPLAY_INTERSTITIAL and default ads created for those placements will be limited to those compatibility
    * types. IN_STREAM_VIDEO refers to rendering in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  /** Information about the creation of this ad. This is a read-only field. */
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Creative group assignments for this ad. Applicable when type is AD_SERVING_CLICK_TRACKER. Only one assignment per creative group number is allowed for
    * a maximum of two assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  /**
    * Creative rotation for this ad. Applicable when type is AD_SERVING_DEFAULT_AD, AD_SERVING_STANDARD_AD, or AD_SERVING_TRACKING. When type is
    * AD_SERVING_DEFAULT_AD, this field should have exactly one creativeAssignment.
    */
  var creativeRotation: js.UndefOr[CreativeRotation] = js.undefined
  /**
    * Time and day targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  /** Default click-through event tag properties for this ad. */
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  /**
    * Delivery schedule information for this ad. Applicable when type is AD_SERVING_STANDARD_AD or AD_SERVING_TRACKING. This field along with subfields
    * priority and impressionRatio are required on insertion when type is AD_SERVING_STANDARD_AD.
    */
  var deliverySchedule: js.UndefOr[DeliverySchedule] = js.undefined
  /**
    * Whether this ad is a dynamic click tracker. Applicable when type is AD_SERVING_CLICK_TRACKER. This is a required field on insert, and is read-only
    * after insert.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.undefined
  /** Date and time that this ad should stop serving. Must be later than the start time. This is a required field on insertion. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Event tag overrides for this ad. */
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  /**
    * Geographical targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  /** ID of this ad. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of this ad. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Key-value targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#ad". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Language targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  /** Information about the most recent modification of this ad. This is a read-only field. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this ad. This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[String] = js.undefined
  /** Placement assignments for this ad. */
  var placementAssignments: js.UndefOr[js.Array[PlacementAssignment]] = js.undefined
  /**
    * Remarketing list targeting expression for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var remarketingListExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  /** Size of this ad. Applicable when type is AD_SERVING_DEFAULT_AD. */
  var size: js.UndefOr[Size] = js.undefined
  /** Whether this ad is ssl compliant. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Whether this ad requires ssl. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  /** Date and time that this ad should start serving. If creating an ad, this field must be a time in the future. This is a required field on insertion. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this ad. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /**
    * Targeting template ID, used to apply preconfigured targeting information to this ad. This cannot be set while any of dayPartTargeting, geoTargeting,
    * keyValueTargetingExpression, languageTargeting, remarketingListExpression, or technologyTargeting are set. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var targetingTemplateId: js.UndefOr[String] = js.undefined
  /**
    * Technology platform targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
  /** Type of ad. This is a required field on insertion. Note that default ads (AD_SERVING_DEFAULT_AD) cannot be created directly (see Creative resource). */
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

