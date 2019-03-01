package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBlockingConfiguration extends js.Object {
  /** Click-through URL used by brand-neutral ads. This is a required field when overrideClickThroughUrl is set to true. */
  var clickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of a creative bundle to use for this campaign. If set, brand-neutral ads will select creatives from this bundle. Otherwise, a default transparent
    * pixel will be used.
    */
  var creativeBundleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this campaign has enabled ad blocking. When true, ad blocking is enabled for placements in the campaign, but this may be overridden by site and
    * placement settings. When false, ad blocking is disabled for all placements under the campaign, regardless of site and placement settings.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the brand-neutral ad's click-through URL comes from the campaign's creative bundle or the override URL. Must be set to true if ad blocking is
    * enabled and no creative bundle is configured.
    */
  var overrideClickThroughUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object AdBlockingConfiguration {
  @scala.inline
  def apply(
    clickThroughUrl: java.lang.String = null,
    creativeBundleId: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    overrideClickThroughUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): AdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (creativeBundleId != null) __obj.updateDynamic("creativeBundleId")(creativeBundleId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(overrideClickThroughUrl)) __obj.updateDynamic("overrideClickThroughUrl")(overrideClickThroughUrl)
    __obj.asInstanceOf[AdBlockingConfiguration]
  }
}

