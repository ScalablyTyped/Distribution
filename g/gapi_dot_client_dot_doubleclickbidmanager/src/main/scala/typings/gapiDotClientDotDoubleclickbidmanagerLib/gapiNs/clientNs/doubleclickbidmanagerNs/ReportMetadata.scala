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

