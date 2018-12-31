package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#query". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Query metadata. */
  var metadata: js.UndefOr[QueryMetadata] = js.undefined
  /** Query parameters. */
  var params: js.UndefOr[Parameters] = js.undefined
  /** Query ID. */
  var queryId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Information on how often and when to run a query. */
  var schedule: js.UndefOr[QuerySchedule] = js.undefined
  /** Canonical timezone code for report data time. Defaults to America/New_York. */
  var timezoneCode: js.UndefOr[java.lang.String] = js.undefined
}

