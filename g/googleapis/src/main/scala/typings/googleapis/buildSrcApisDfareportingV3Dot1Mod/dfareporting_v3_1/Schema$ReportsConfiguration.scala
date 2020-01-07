package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporting Configuration
  */
@js.native
trait Schema$ReportsConfiguration extends js.Object {
  /**
    * Whether the exposure to conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default lookback windows for new advertisers in this account.
    */
  var lookbackConfiguration: js.UndefOr[Schema$LookbackConfiguration] = js.native
  /**
    * Report generation time zone ID of this account. This is a required field
    * that can only be changed by a superuser. Acceptable values are:  -
    * &quot;1&quot; for &quot;America/New_York&quot;  - &quot;2&quot; for
    * &quot;Europe/London&quot;  - &quot;3&quot; for &quot;Europe/Paris&quot;
    * - &quot;4&quot; for &quot;Africa/Johannesburg&quot;  - &quot;5&quot; for
    * &quot;Asia/Jerusalem&quot;  - &quot;6&quot; for &quot;Asia/Shanghai&quot;
    * - &quot;7&quot; for &quot;Asia/Hong_Kong&quot;  - &quot;8&quot; for
    * &quot;Asia/Tokyo&quot;  - &quot;9&quot; for &quot;Australia/Sydney&quot;
    * - &quot;10&quot; for &quot;Asia/Dubai&quot;  - &quot;11&quot; for
    * &quot;America/Los_Angeles&quot;  - &quot;12&quot; for
    * &quot;Pacific/Auckland&quot;  - &quot;13&quot; for
    * &quot;America/Sao_Paulo&quot;
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}

object Schema$ReportsConfiguration {
  @scala.inline
  def apply(
    exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined,
    lookbackConfiguration: Schema$LookbackConfiguration = null,
    reportGenerationTimeZoneId: String = null
  ): Schema$ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (reportGenerationTimeZoneId != null) __obj.updateDynamic("reportGenerationTimeZoneId")(reportGenerationTimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportsConfiguration]
  }
}

