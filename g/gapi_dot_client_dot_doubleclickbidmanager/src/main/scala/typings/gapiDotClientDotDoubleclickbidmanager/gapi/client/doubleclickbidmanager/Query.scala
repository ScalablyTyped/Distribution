package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#query". */
  var kind: js.UndefOr[String] = js.undefined
  /** Query metadata. */
  var metadata: js.UndefOr[QueryMetadata] = js.undefined
  /** Query parameters. */
  var params: js.UndefOr[Parameters] = js.undefined
  /** Query ID. */
  var queryId: js.UndefOr[String] = js.undefined
  /**
    * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  /**
    * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  /** Information on how often and when to run a query. */
  var schedule: js.UndefOr[QuerySchedule] = js.undefined
  /** Canonical timezone code for report data time. Defaults to America/New_York. */
  var timezoneCode: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    kind: String = null,
    metadata: QueryMetadata = null,
    params: Parameters = null,
    queryId: String = null,
    reportDataEndTimeMs: String = null,
    reportDataStartTimeMs: String = null,
    schedule: QuerySchedule = null,
    timezoneCode: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (params != null) __obj.updateDynamic("params")(params)
    if (queryId != null) __obj.updateDynamic("queryId")(queryId)
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs)
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (timezoneCode != null) __obj.updateDynamic("timezoneCode")(timezoneCode)
    __obj.asInstanceOf[Query]
  }
}

