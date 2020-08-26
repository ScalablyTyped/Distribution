package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferRun extends js.Object {
  /** Output only. Data source id. */
  var dataSourceId: js.UndefOr[String] = js.native
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.native
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run ended.
    * Parameter ignored by server for input requests.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the transfer run.
    * Transfer run names have the form
    * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
    * The name is ignored when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.native
  /** Data transfer specific parameters. */
  var params: js.UndefOr[Record[String, _]] = js.native
  /**
    * For batch transfer runs, specifies the date and time that
    * data should be ingested.
    */
  var runTime: js.UndefOr[String] = js.native
  /**
    * Output only. Describes the schedule of this transfer run if it was
    * created as part of a regular schedule. For batch transfer runs that are
    * scheduled manually, this is empty.
    * NOTE: the system might choose to delay the schedule depending on the
    * current load, so `schedule_time` doesn't always matches this.
    */
  var schedule: js.UndefOr[String] = js.native
  /** Minimum time after which a transfer run can be started. */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run was started.
    * Parameter ignored by server for input requests.
    */
  var startTime: js.UndefOr[String] = js.native
  /** Output only. Data transfer run state. Ignored for input requests. */
  var state: js.UndefOr[String] = js.native
  /** Output only. Last time the data transfer run state was updated. */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[String] = js.native
}

object TransferRun {
  @scala.inline
  def apply(): TransferRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferRun]
  }
  @scala.inline
  implicit class TransferRunOps[Self <: TransferRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    @scala.inline
    def setDatasetRegion(value: String): Self = this.set("datasetRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetRegion: Self = this.set("datasetRegion", js.undefined)
    @scala.inline
    def setDestinationDatasetId(value: String): Self = this.set("destinationDatasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationDatasetId: Self = this.set("destinationDatasetId", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRunTime(value: String): Self = this.set("runTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunTime: Self = this.set("runTime", js.undefined)
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

