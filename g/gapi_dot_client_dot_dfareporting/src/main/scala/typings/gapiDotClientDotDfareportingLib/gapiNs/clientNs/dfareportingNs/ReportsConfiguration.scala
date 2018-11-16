package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReportsConfiguration extends js.Object {
  /**
               * Whether the exposure to conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen
               * by a user before converting.
               */
  var exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var reportGenerationTimeZoneId: js.UndefOr[java.lang.String] = js.undefined
}

