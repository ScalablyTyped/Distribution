package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsConfiguration extends js.Object {
  /**
    * Whether the exposure to conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen
    * by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined
  /** Default lookback windows for new advertisers in this account. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /**
    * Report generation time zone ID of this account. This is a required field that can only be changed by a superuser.
    * Acceptable values are:
    *
    * - "1" for "America/New_York"
    * - "2" for "Europe/London"
    * - "3" for "Europe/Paris"
    * - "4" for "Africa/Johannesburg"
    * - "5" for "Asia/Jerusalem"
    * - "6" for "Asia/Shanghai"
    * - "7" for "Asia/Hong_Kong"
    * - "8" for "Asia/Tokyo"
    * - "9" for "Australia/Sydney"
    * - "10" for "Asia/Dubai"
    * - "11" for "America/Los_Angeles"
    * - "12" for "Pacific/Auckland"
    * - "13" for "America/Sao_Paulo"
    */
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
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled.get.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (reportGenerationTimeZoneId != null) __obj.updateDynamic("reportGenerationTimeZoneId")(reportGenerationTimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportsConfiguration]
  }
}

