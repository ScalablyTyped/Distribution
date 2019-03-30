package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsConfiguration extends js.Object {
  var exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  var reportGenerationTimeZoneId: js.UndefOr[java.lang.String] = js.undefined
}

object ReportsConfiguration {
  @scala.inline
  def apply(
    exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    lookbackConfiguration: LookbackConfiguration = null,
    reportGenerationTimeZoneId: java.lang.String = null
  ): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled)
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration)
    if (reportGenerationTimeZoneId != null) __obj.updateDynamic("reportGenerationTimeZoneId")(reportGenerationTimeZoneId)
    __obj.asInstanceOf[ReportsConfiguration]
  }
}

