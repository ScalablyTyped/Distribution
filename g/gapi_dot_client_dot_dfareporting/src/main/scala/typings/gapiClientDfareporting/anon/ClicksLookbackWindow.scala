package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClicksLookbackWindow extends js.Object {
  /**
    * DFA checks to see if a click interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var clicksLookbackWindow: js.UndefOr[Double] = js.undefined
  /**
    * DFA checks to see if an impression interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var impressionsLookbackWindow: js.UndefOr[Double] = js.undefined
  /** Deprecated: has no effect. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser
    * within the Floodlight group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the
    * lookback window prior to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumClickInteractions: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumImpressionInteractions: js.UndefOr[Double] = js.undefined
  /** The maximum amount of time that can take place between interactions (clicks or impressions) by the same user. Valid values: 1-90. */
  var maximumInteractionGap: js.UndefOr[Double] = js.undefined
  /** Enable pivoting on interaction path. */
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
}

object ClicksLookbackWindow {
  @scala.inline
  def apply(
    clicksLookbackWindow: js.UndefOr[Double] = js.undefined,
    impressionsLookbackWindow: js.UndefOr[Double] = js.undefined,
    includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    maximumClickInteractions: js.UndefOr[Double] = js.undefined,
    maximumImpressionInteractions: js.UndefOr[Double] = js.undefined,
    maximumInteractionGap: js.UndefOr[Double] = js.undefined,
    pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
  ): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clicksLookbackWindow)) __obj.updateDynamic("clicksLookbackWindow")(clicksLookbackWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impressionsLookbackWindow)) __obj.updateDynamic("impressionsLookbackWindow")(impressionsLookbackWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumClickInteractions)) __obj.updateDynamic("maximumClickInteractions")(maximumClickInteractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumImpressionInteractions)) __obj.updateDynamic("maximumImpressionInteractions")(maximumImpressionInteractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumInteractionGap)) __obj.updateDynamic("maximumInteractionGap")(maximumInteractionGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotOnInteractionPath)) __obj.updateDynamic("pivotOnInteractionPath")(pivotOnInteractionPath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
}

