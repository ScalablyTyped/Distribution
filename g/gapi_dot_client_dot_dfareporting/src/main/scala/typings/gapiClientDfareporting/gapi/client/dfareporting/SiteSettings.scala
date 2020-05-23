package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSettings extends js.Object {
  /** Whether active view creatives are disabled for this site. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this site opts out of ad blocking. When true, ad blocking is disabled for all placements under the site, regardless of the individual placement
    * settings. When false, the campaign and placement settings take effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.undefined
  /** Site-wide creative settings. */
  var creativeSettings: js.UndefOr[CreativeSettings] = js.undefined
  /** Whether new cookies are disabled for this site. */
  var disableNewCookie: js.UndefOr[Boolean] = js.undefined
  /** Lookback window settings for this site. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /** Configuration settings for dynamic and image floodlight tags. */
  var tagSetting: js.UndefOr[TagSetting] = js.undefined
  /**
    * Whether Verification and ActiveView for in-stream video creatives are disabled by default for new placements created under this site. This value will
    * be used to populate the placement.videoActiveViewOptOut field, when no value is specified for the new placement.
    */
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined
  /**
    * Default VPAID adapter setting for new placements created under this site. This value will be used to populate the placements.vpaidAdapterChoice field,
    * when no value is specified for the new placement. Controls which VPAID format the measurement adapter will use for in-stream video creatives assigned
    * to the placement. The publisher's specifications will typically determine this setting. For VPAID creatives, the adapter format will match the VPAID
    * format (HTML5 VPAID creatives use the HTML5 adapter).
    *
    * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.undefined
}

object SiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    adBlockingOptOut: js.UndefOr[Boolean] = js.undefined,
    creativeSettings: CreativeSettings = null,
    disableNewCookie: js.UndefOr[Boolean] = js.undefined,
    lookbackConfiguration: LookbackConfiguration = null,
    tagSetting: TagSetting = null,
    videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined,
    vpaidAdapterChoiceTemplate: String = null
  ): SiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adBlockingOptOut)) __obj.updateDynamic("adBlockingOptOut")(adBlockingOptOut.get.asInstanceOf[js.Any])
    if (creativeSettings != null) __obj.updateDynamic("creativeSettings")(creativeSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNewCookie)) __obj.updateDynamic("disableNewCookie")(disableNewCookie.get.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (tagSetting != null) __obj.updateDynamic("tagSetting")(tagSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(videoActiveViewOptOutTemplate)) __obj.updateDynamic("videoActiveViewOptOutTemplate")(videoActiveViewOptOutTemplate.get.asInstanceOf[js.Any])
    if (vpaidAdapterChoiceTemplate != null) __obj.updateDynamic("vpaidAdapterChoiceTemplate")(vpaidAdapterChoiceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteSettings]
  }
}

