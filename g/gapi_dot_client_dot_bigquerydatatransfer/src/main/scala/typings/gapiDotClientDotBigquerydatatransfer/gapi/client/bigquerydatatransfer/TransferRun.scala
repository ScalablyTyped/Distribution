package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferRun extends js.Object {
  /** Output only. Data source id. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.undefined
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.undefined
  /**
    * Output only. Time when transfer run ended.
    * Parameter ignored by server for input requests.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * The resource name of the transfer run.
    * Transfer run names have the form
    * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
    * The name is ignored when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Data transfer specific parameters. */
  var params: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * For batch transfer runs, specifies the date and time that
    * data should be ingested.
    */
  var runTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. Describes the schedule of this transfer run if it was
    * created as part of a regular schedule. For batch transfer runs that are
    * scheduled manually, this is empty.
    * NOTE: the system might choose to delay the schedule depending on the
    * current load, so `schedule_time` doesn't always matches this.
    */
  var schedule: js.UndefOr[String] = js.undefined
  /** Minimum time after which a transfer run can be started. */
  var scheduleTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. Time when transfer run was started.
    * Parameter ignored by server for input requests.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** Output only. Data transfer run state. Ignored for input requests. */
  var state: js.UndefOr[String] = js.undefined
  /** Output only. Last time the data transfer run state was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[String] = js.undefined
}

object TransferRun {
  @scala.inline
  def apply(
    dataSourceId: String = null,
    datasetRegion: String = null,
    destinationDatasetId: String = null,
    endTime: String = null,
    name: String = null,
    params: Record[String, _] = null,
    runTime: String = null,
    schedule: String = null,
    scheduleTime: String = null,
    startTime: String = null,
    state: String = null,
    updateTime: String = null,
    userId: String = null
  ): TransferRun = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId)
    if (datasetRegion != null) __obj.updateDynamic("datasetRegion")(datasetRegion)
    if (destinationDatasetId != null) __obj.updateDynamic("destinationDatasetId")(destinationDatasetId)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    if (runTime != null) __obj.updateDynamic("runTime")(runTime)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TransferRun]
  }
}

