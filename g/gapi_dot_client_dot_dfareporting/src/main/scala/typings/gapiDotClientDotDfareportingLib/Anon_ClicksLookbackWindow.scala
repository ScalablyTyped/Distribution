package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClicksLookbackWindow extends js.Object {
  /**
    * DFA checks to see if a click interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var clicksLookbackWindow: js.UndefOr[scala.Double] = js.undefined
  /**
    * DFA checks to see if an impression interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var impressionsLookbackWindow: js.UndefOr[scala.Double] = js.undefined
  /** Deprecated: has no effect. */
  var includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser
    * within the Floodlight group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the
    * lookback window prior to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumClickInteractions: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumImpressionInteractions: js.UndefOr[scala.Double] = js.undefined
  /** The maximum amount of time that can take place between interactions (clicks or impressions) by the same user. Valid values: 1-90. */
  var maximumInteractionGap: js.UndefOr[scala.Double] = js.undefined
  /** Enable pivoting on interaction path. */
  var pivotOnInteractionPath: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClicksLookbackWindow {
  @scala.inline
  def apply(
    clicksLookbackWindow: scala.Int | scala.Double = null,
    impressionsLookbackWindow: scala.Int | scala.Double = null,
    includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined,
    maximumClickInteractions: scala.Int | scala.Double = null,
    maximumImpressionInteractions: scala.Int | scala.Double = null,
    maximumInteractionGap: scala.Int | scala.Double = null,
    pivotOnInteractionPath: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    if (clicksLookbackWindow != null) __obj.updateDynamic("clicksLookbackWindow")(clicksLookbackWindow.asInstanceOf[js.Any])
    if (impressionsLookbackWindow != null) __obj.updateDynamic("impressionsLookbackWindow")(impressionsLookbackWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions)
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions)
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions)
    if (maximumClickInteractions != null) __obj.updateDynamic("maximumClickInteractions")(maximumClickInteractions.asInstanceOf[js.Any])
    if (maximumImpressionInteractions != null) __obj.updateDynamic("maximumImpressionInteractions")(maximumImpressionInteractions.asInstanceOf[js.Any])
    if (maximumInteractionGap != null) __obj.updateDynamic("maximumInteractionGap")(maximumInteractionGap.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotOnInteractionPath)) __obj.updateDynamic("pivotOnInteractionPath")(pivotOnInteractionPath)
    __obj.asInstanceOf[Anon_ClicksLookbackWindow]
  }
}

