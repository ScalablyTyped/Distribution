package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a data transfer run.
  */
@js.native
trait Schema$TransferRun extends js.Object {
  /**
    * Output only. Data source id.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Output only. The BigQuery target dataset id.
    */
  var destinationDatasetId: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run ended. Parameter ignored by server
    * for input requests.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Status of the transfer run.
    */
  var errorStatus: js.UndefOr[Schema$Status] = js.native
  /**
    * The resource name of the transfer run. Transfer run names have the form
    * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
    * The name is ignored when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Data transfer specific parameters.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * For batch transfer runs, specifies the date and time that data should be
    * ingested.
    */
  var runTime: js.UndefOr[String] = js.native
  /**
    * Output only. Describes the schedule of this transfer run if it was
    * created as part of a regular schedule. For batch transfer runs that are
    * scheduled manually, this is empty. NOTE: the system might choose to delay
    * the schedule depending on the current load, so `schedule_time`
    * doesn&#39;t always match this.
    */
  var schedule: js.UndefOr[String] = js.native
  /**
    * Minimum time after which a transfer run can be started.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run was started. Parameter ignored by
    * server for input requests.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Data transfer run state. Ignored for input requests.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Last time the data transfer run state was updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Deprecated. Unique ID of the user on whose behalf transfer is done.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$TransferRun {
  @scala.inline
  def apply(
    dataSourceId: String = null,
    destinationDatasetId: String = null,
    endTime: String = null,
    errorStatus: Schema$Status = null,
    name: String = null,
    params: StringDictionary[js.Any] = null,
    runTime: String = null,
    schedule: String = null,
    scheduleTime: String = null,
    startTime: String = null,
    state: String = null,
    updateTime: String = null,
    userId: String = null
  ): Schema$TransferRun = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (destinationDatasetId != null) __obj.updateDynamic("destinationDatasetId")(destinationDatasetId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorStatus != null) __obj.updateDynamic("errorStatus")(errorStatus.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (runTime != null) __obj.updateDynamic("runTime")(runTime.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransferRun]
  }
}

