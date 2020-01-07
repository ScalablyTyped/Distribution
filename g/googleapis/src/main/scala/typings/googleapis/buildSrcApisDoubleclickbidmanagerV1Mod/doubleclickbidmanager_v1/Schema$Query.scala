package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a query.
  */
@js.native
trait Schema$Query extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#query&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Query metadata.
    */
  var metadata: js.UndefOr[Schema$QueryMetadata] = js.native
  /**
    * Query parameters.
    */
  var params: js.UndefOr[Schema$Parameters] = js.native
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.native
  /**
    * The ending time for the data that is shown in the report. Note,
    * reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and
    * ignored otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /**
    * The starting time for the data that is shown in the report. Note,
    * reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES
    * and ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Information on how often and when to run a query.
    */
  var schedule: js.UndefOr[Schema$QuerySchedule] = js.native
  /**
    * Canonical timezone code for report data time. Defaults to
    * America/New_York.
    */
  var timezoneCode: js.UndefOr[String] = js.native
}

object Schema$Query {
  @scala.inline
  def apply(
    kind: String = null,
    metadata: Schema$QueryMetadata = null,
    params: Schema$Parameters = null,
    queryId: String = null,
    reportDataEndTimeMs: String = null,
    reportDataStartTimeMs: String = null,
    schedule: Schema$QuerySchedule = null,
    timezoneCode: String = null
  ): Schema$Query = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (queryId != null) __obj.updateDynamic("queryId")(queryId.asInstanceOf[js.Any])
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs.asInstanceOf[js.Any])
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (timezoneCode != null) __obj.updateDynamic("timezoneCode")(timezoneCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Query]
  }
}

