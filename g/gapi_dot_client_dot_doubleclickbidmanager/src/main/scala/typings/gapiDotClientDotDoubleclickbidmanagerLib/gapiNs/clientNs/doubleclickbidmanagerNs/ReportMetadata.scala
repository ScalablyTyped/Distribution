package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportMetadata extends js.Object {
  /** The path to the location in Google Cloud Storage where the report is stored. */
  var googleCloudStoragePath: js.UndefOr[java.lang.String] = js.undefined
  /** The ending time for the data that is shown in the report. */
  var reportDataEndTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** The starting time for the data that is shown in the report. */
  var reportDataStartTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Report status. */
  var status: js.UndefOr[ReportStatus] = js.undefined
}

object ReportMetadata {
  @scala.inline
  def apply(
    googleCloudStoragePath: java.lang.String = null,
    reportDataEndTimeMs: java.lang.String = null,
    reportDataStartTimeMs: java.lang.String = null,
    status: ReportStatus = null
  ): ReportMetadata = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStoragePath != null) __obj.updateDynamic("googleCloudStoragePath")(googleCloudStoragePath)
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs)
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReportMetadata]
  }
}

