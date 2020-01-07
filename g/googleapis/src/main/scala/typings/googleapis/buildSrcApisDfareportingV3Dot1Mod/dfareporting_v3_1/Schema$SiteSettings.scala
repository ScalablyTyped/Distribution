package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site Settings
  */
@js.native
trait Schema$SiteSettings extends js.Object {
  /**
    * Whether active view creatives are disabled for this site.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Whether this site opts out of ad blocking. When true, ad blocking is
    * disabled for all placements under the site, regardless of the individual
    * placement settings. When false, the campaign and placement settings take
    * effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Site-wide creative settings.
    */
  var creativeSettings: js.UndefOr[Schema$CreativeSettings] = js.native
  /**
    * Whether new cookies are disabled for this site.
    */
  var disableNewCookie: js.UndefOr[Boolean] = js.native
  /**
    * Lookback window settings for this site.
    */
  var lookbackConfiguration: js.UndefOr[Schema$LookbackConfiguration] = js.native
  /**
    * Configuration settings for dynamic and image floodlight tags.
    */
  var tagSetting: js.UndefOr[Schema$TagSetting] = js.native
  /**
    * Whether Verification and ActiveView for in-stream video creatives are
    * disabled by default for new placements created under this site. This
    * value will be used to populate the placement.videoActiveViewOptOut field,
    * when no value is specified for the new placement.
    */
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.native
  /**
    * Default VPAID adapter setting for new placements created under this site.
    * This value will be used to populate the placements.vpaidAdapterChoice
    * field, when no value is specified for the new placement. Controls which
    * VPAID format the measurement adapter will use for in-stream video
    * creatives assigned to the placement. The publisher&#39;s specifications
    * will typically determine this setting. For VPAID creatives, the adapter
    * format will match the VPAID format (HTML5 VPAID creatives use the HTML5
    * adapter).  Note: Flash is no longer supported. This field now defaults to
    * HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.native
}

object Schema$SiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    adBlockingOptOut: js.UndefOr[Boolean] = js.undefined,
    creativeSettings: Schema$CreativeSettings = null,
    disableNewCookie: js.UndefOr[Boolean] = js.undefined,
    lookbackConfiguration: Schema$LookbackConfiguration = null,
    tagSetting: Schema$TagSetting = null,
    videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined,
    vpaidAdapterChoiceTemplate: String = null
  ): Schema$SiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut.asInstanceOf[js.Any])
    if (!js.isUndefined(adBlockingOptOut)) __obj.updateDynamic("adBlockingOptOut")(adBlockingOptOut.asInstanceOf[js.Any])
    if (creativeSettings != null) __obj.updateDynamic("creativeSettings")(creativeSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNewCookie)) __obj.updateDynamic("disableNewCookie")(disableNewCookie.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (tagSetting != null) __obj.updateDynamic("tagSetting")(tagSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(videoActiveViewOptOutTemplate)) __obj.updateDynamic("videoActiveViewOptOutTemplate")(videoActiveViewOptOutTemplate.asInstanceOf[js.Any])
    if (vpaidAdapterChoiceTemplate != null) __obj.updateDynamic("vpaidAdapterChoiceTemplate")(vpaidAdapterChoiceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteSettings]
  }
}

