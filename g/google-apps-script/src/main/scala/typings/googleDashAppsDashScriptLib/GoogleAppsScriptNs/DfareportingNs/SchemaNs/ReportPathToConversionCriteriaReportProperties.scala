package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportPathToConversionCriteriaReportProperties extends js.Object {
  var clicksLookbackWindow: js.UndefOr[scala.Double] = js.undefined
  var impressionsLookbackWindow: js.UndefOr[scala.Double] = js.undefined
  var includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  var includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined
  var includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  var maximumClickInteractions: js.UndefOr[scala.Double] = js.undefined
  var maximumImpressionInteractions: js.UndefOr[scala.Double] = js.undefined
  var maximumInteractionGap: js.UndefOr[scala.Double] = js.undefined
  var pivotOnInteractionPath: js.UndefOr[scala.Boolean] = js.undefined
}

object ReportPathToConversionCriteriaReportProperties {
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
  ): ReportPathToConversionCriteriaReportProperties = {
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
    __obj.asInstanceOf[ReportPathToConversionCriteriaReportProperties]
  }
}

