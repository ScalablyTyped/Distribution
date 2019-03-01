package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryRequest extends js.Object {
  /** Report data range used to generate the report. */
  var dataRange: js.UndefOr[java.lang.String] = js.undefined
  /** The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataEndTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataStartTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Canonical timezone code for report data time. Defaults to America/New_York. */
  var timezoneCode: js.UndefOr[java.lang.String] = js.undefined
}

object RunQueryRequest {
  @scala.inline
  def apply(
    dataRange: java.lang.String = null,
    reportDataEndTimeMs: java.lang.String = null,
    reportDataStartTimeMs: java.lang.String = null,
    timezoneCode: java.lang.String = null
  ): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange)
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs)
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs)
    if (timezoneCode != null) __obj.updateDynamic("timezoneCode")(timezoneCode)
    __obj.asInstanceOf[RunQueryRequest]
  }
}

