package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsConfiguration extends js.Object {
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.undefined
}

object ReportsConfiguration {
  @scala.inline
  def apply(
    exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined,
    lookbackConfiguration: LookbackConfiguration = null,
    reportGenerationTimeZoneId: String = null
  ): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled)
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration)
    if (reportGenerationTimeZoneId != null) __obj.updateDynamic("reportGenerationTimeZoneId")(reportGenerationTimeZoneId)
    __obj.asInstanceOf[ReportsConfiguration]
  }
}

