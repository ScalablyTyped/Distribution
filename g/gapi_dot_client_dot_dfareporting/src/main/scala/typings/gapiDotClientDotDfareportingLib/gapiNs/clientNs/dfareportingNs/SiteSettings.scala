package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSettings extends js.Object {
  /** Whether active view creatives are disabled for this site. */
  var activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this site opts out of ad blocking. When true, ad blocking is disabled for all placements under the site, regardless of the individual placement
    * settings. When false, the campaign and placement settings take effect.
    */
  var adBlockingOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Site-wide creative settings. */
  var creativeSettings: js.UndefOr[CreativeSettings] = js.undefined
  /** Whether new cookies are disabled for this site. */
  var disableNewCookie: js.UndefOr[scala.Boolean] = js.undefined
  /** Lookback window settings for this site. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /** Configuration settings for dynamic and image floodlight tags. */
  var tagSetting: js.UndefOr[TagSetting] = js.undefined
  /**
    * Whether Verification and ActiveView for in-stream video creatives are disabled by default for new placements created under this site. This value will
    * be used to populate the placement.videoActiveViewOptOut field, when no value is specified for the new placement.
    */
  var videoActiveViewOptOutTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default VPAID adapter setting for new placements created under this site. This value will be used to populate the placements.vpaidAdapterChoice field,
    * when no value is specified for the new placement. Controls which VPAID format the measurement adapter will use for in-stream video creatives assigned
    * to the placement. The publisher's specifications will typically determine this setting. For VPAID creatives, the adapter format will match the VPAID
    * format (HTML5 VPAID creatives use the HTML5 adapter).
    *
    * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoiceTemplate: js.UndefOr[java.lang.String] = js.undefined
}

