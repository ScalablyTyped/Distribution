package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportMetadata extends js.Object {
  /** The path to the location in Google Cloud Storage where the report is stored. */
  var googleCloudStoragePath: js.UndefOr[String] = js.undefined
  /** The ending time for the data that is shown in the report. */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  /** The starting time for the data that is shown in the report. */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  /** Report status. */
  var status: js.UndefOr[ReportStatus] = js.undefined
}

object ReportMetadata {
  @scala.inline
  def apply(
    googleCloudStoragePath: String = null,
    reportDataEndTimeMs: String = null,
    reportDataStartTimeMs: String = null,
    status: ReportStatus = null
  ): ReportMetadata = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStoragePath != null) __obj.updateDynamic("googleCloudStoragePath")(googleCloudStoragePath.asInstanceOf[js.Any])
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs.asInstanceOf[js.Any])
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportMetadata]
  }
}

