package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (reportGenerationTimeZoneId != null) __obj.updateDynamic("reportGenerationTimeZoneId")(reportGenerationTimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportsConfiguration]
  }
}

