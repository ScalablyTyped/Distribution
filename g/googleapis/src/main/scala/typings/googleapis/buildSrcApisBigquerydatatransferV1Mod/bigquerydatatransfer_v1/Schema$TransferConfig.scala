package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a data transfer configuration. A transfer configuration contains
  * all metadata needed to perform a data transfer. For example,
  * `destination_dataset_id` specifies where data should be stored. When a new
  * transfer configuration is created, the specified `destination_dataset_id`
  * is created when needed and shared with the appropriate data source service
  * account.
  */
@js.native
trait Schema$TransferConfig extends js.Object {
  /**
    * The number of days to look back to automatically refresh the data. For
    * example, if `data_refresh_window_days = 10`, then every day BigQuery
    * reingests data for [today-10, today-1], rather than ingesting data for
    * just [today-1]. Only valid if the data source supports the feature. Set
    * the value to  0 to use the default value.
    */
  var dataRefreshWindowDays: js.UndefOr[Double] = js.native
  /**
    * Data source id. Cannot be changed once data transfer is created.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Output only. Region in which BigQuery dataset is located.
    */
  var datasetRegion: js.UndefOr[String] = js.native
  /**
    * The BigQuery target dataset id.
    */
  var destinationDatasetId: js.UndefOr[String] = js.native
  /**
    * Is this config disabled. When set to true, no runs are scheduled for a
    * given transfer.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * User specified display name for the data transfer.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The resource name of the transfer config. Transfer config names have the
    * form of
    * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`.
    * The name is automatically generated based on the config_id specified in
    * CreateTransferConfigRequest along with project_id and region. If
    * config_id is not provided, usually a uuid, even though it is not
    * guaranteed or required, will be generated for config_id.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Next time when data transfer will run.
    */
  var nextRunTime: js.UndefOr[String] = js.native
  /**
    * Data transfer specific parameters.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Data transfer schedule. If the data source does not support a custom
    * schedule, this should be empty. If it is empty, the default value for the
    * data source will be used. The specified times are in UTC. Examples of
    * valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun
    * 13:15`, and `first sunday of quarter 00:00`. See more explanation about
    * the format here:
    * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
    * NOTE: the granularity should be at least 8 hours, or less frequent.
    */
  var schedule: js.UndefOr[String] = js.native
  /**
    * Options customizing the data transfer schedule.
    */
  var scheduleOptions: js.UndefOr[Schema$ScheduleOptions] = js.native
  /**
    * Output only. State of the most recently updated transfer run.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Data transfer modification time. Ignored by server on input.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Deprecated. Unique ID of the user on whose behalf transfer is done.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$TransferConfig {
  @scala.inline
  def apply(
    dataRefreshWindowDays: Int | Double = null,
    dataSourceId: String = null,
    datasetRegion: String = null,
    destinationDatasetId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    name: String = null,
    nextRunTime: String = null,
    params: StringDictionary[js.Any] = null,
    schedule: String = null,
    scheduleOptions: Schema$ScheduleOptions = null,
    state: String = null,
    updateTime: String = null,
    userId: String = null
  ): Schema$TransferConfig = {
    val __obj = js.Dynamic.literal()
    if (dataRefreshWindowDays != null) __obj.updateDynamic("dataRefreshWindowDays")(dataRefreshWindowDays.asInstanceOf[js.Any])
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (datasetRegion != null) __obj.updateDynamic("datasetRegion")(datasetRegion.asInstanceOf[js.Any])
    if (destinationDatasetId != null) __obj.updateDynamic("destinationDatasetId")(destinationDatasetId.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextRunTime != null) __obj.updateDynamic("nextRunTime")(nextRunTime.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (scheduleOptions != null) __obj.updateDynamic("scheduleOptions")(scheduleOptions.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransferConfig]
  }
}

