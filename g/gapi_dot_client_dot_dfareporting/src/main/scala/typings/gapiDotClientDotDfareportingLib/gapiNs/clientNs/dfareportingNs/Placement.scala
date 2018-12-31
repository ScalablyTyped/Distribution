package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placement extends js.Object {
  /** Account ID of this placement. This field can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this placement opts out of ad blocking. When true, ad blocking is disabled for this placement. When false, the campaign and site settings take
    * effect.
    */
  var adBlockingOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Advertiser ID of this placement. This field can be left blank. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this placement is archived. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Campaign ID of this placement. This field is a required field on insertion. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Comments for this placement. */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering on desktop, on mobile devices or in mobile apps for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are no longer allowed for new placement insertions. Instead, use DISPLAY or
    * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard. This field is required on insertion.
    */
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the content category assigned to this placement. */
  var contentCategoryId: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the creation of this placement. This is a read-only field. */
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Directory site ID of this placement. On insert, you must set either this field or the siteId field to specify the site associated with this placement.
    * This is a required field that is read-only after insertion.
    */
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the directory site. This is a read-only, auto-generated field. */
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** External ID for this placement. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this placement. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this placement. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Key name of this placement. This is a read-only, auto-generated field. */
  var keyName: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placement". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this placement. This is a read-only field. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Lookback window settings for this placement. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /** Name of this placement.This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether payment was approved for this placement. This is a read-only field relevant only to publisher-paid placements. */
  var paymentApproved: js.UndefOr[scala.Boolean] = js.undefined
  /** Payment source for this placement. This is a required field that is read-only after insertion. */
  var paymentSource: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this placement's group, if applicable. */
  var placementGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the placement group. This is a read-only, auto-generated field. */
  var placementGroupIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of the placement strategy assigned to this placement. */
  var placementStrategyId: js.UndefOr[java.lang.String] = js.undefined
  /** Pricing schedule of this placement. This field is required on insertion, specifically subfields startDate, endDate and pricingType. */
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.undefined
  /**
    * Whether this placement is the primary placement of a roadblock (placement group). You cannot change this field from true to false. Setting this field
    * to true will automatically set the primary field on the original primary placement of the roadblock to false, and it will automatically set the
    * roadblock's primaryPlacementId field to the ID of this placement.
    */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** Information about the last publisher update. This is a read-only field. */
  var publisherUpdateInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Site ID associated with this placement. On insert, you must set either this field or the directorySiteId field to specify the site associated with this
    * placement. This is a required field that is read-only after insertion.
    */
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the site. This is a read-only, auto-generated field. */
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Size associated with this placement. When inserting or updating a placement, only the size ID field is used. This field is required on insertion. */
  var size: js.UndefOr[Size] = js.undefined
  /** Whether creatives assigned to this placement must be SSL-compliant. */
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Third-party placement status. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this placement. This field can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tag formats to generate for this placement. This field is required on insertion.
    * Acceptable values are:
    * - "PLACEMENT_TAG_STANDARD"
    * - "PLACEMENT_TAG_IFRAME_JAVASCRIPT"
    * - "PLACEMENT_TAG_IFRAME_ILAYER"
    * - "PLACEMENT_TAG_INTERNAL_REDIRECT"
    * - "PLACEMENT_TAG_JAVASCRIPT"
    * - "PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT"
    * - "PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT"
    * - "PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT"
    * - "PLACEMENT_TAG_CLICK_COMMANDS"
    * - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH"
    * - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3"
    * - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4"
    * - "PLACEMENT_TAG_TRACKING"
    * - "PLACEMENT_TAG_TRACKING_IFRAME"
    * - "PLACEMENT_TAG_TRACKING_JAVASCRIPT"
    */
  var tagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Tag settings for this placement. */
  var tagSetting: js.UndefOr[TagSetting] = js.undefined
  /**
    * Whether Verification and ActiveView are disabled for in-stream video creatives for this placement. The same setting videoActiveViewOptOut exists on the
    * site level -- the opt out occurs if either of these settings are true. These settings are distinct from DirectorySites.settings.activeViewOptOut or
    * Sites.siteSettings.activeViewOptOut which only apply to display ads. However, Accounts.activeViewOptOut opts out both video traffic, as well as display
    * ads, from Verification and ActiveView.
    */
  var videoActiveViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** A collection of settings which affect video creatives served through this placement. Applicable to placements with IN_STREAM_VIDEO compatibility. */
  var videoSettings: js.UndefOr[VideoSettings] = js.undefined
  /**
    * VPAID adapter setting for this placement. Controls which VPAID format the measurement adapter will use for in-stream video creatives assigned to this
    * placement.
    *
    * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoice: js.UndefOr[java.lang.String] = js.undefined
}

