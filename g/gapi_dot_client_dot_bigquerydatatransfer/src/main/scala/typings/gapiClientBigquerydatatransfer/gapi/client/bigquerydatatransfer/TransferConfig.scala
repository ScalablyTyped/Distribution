package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfig extends js.Object {
  /**
    * The number of days to look back to automatically refresh the data.
    * For example, if `data_refresh_window_days = 10`, then every day
    * BigQuery reingests data for [today-10, today-1], rather than ingesting data
    * for just [today-1].
    * Only valid if the data source supports the feature. Set the value to  0
    * to use the default value.
    */
  var dataRefreshWindowDays: js.UndefOr[Double] = js.undefined
  /** Data source id. Cannot be changed once data transfer is created. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.undefined
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.undefined
  /**
    * Is this config disabled. When set to true, no runs are scheduled
    * for a given transfer.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** User specified display name for the data transfer. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The resource name of the transfer config.
    * Transfer config names have the form
    * `projects/{project_id}/transferConfigs/{config_id}`.
    * Where `config_id` is usually a uuid, even though it is not
    * guaranteed or required. The name is ignored when creating a transfer
    * config.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Output only. Next time when data transfer will run. */
  var nextRunTime: js.UndefOr[String] = js.undefined
  /** Data transfer specific parameters. */
  var params: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Data transfer schedule.
    * If the data source does not support a custom schedule, this should be
    * empty. If it is empty, the default value for the data source will be
    * used.
    * The specified times are in UTC.
    * Examples of valid format:
    * `1st,3rd monday of month 15:30`,
    * `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    * See more explanation about the format here:
    * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
    * NOTE: the granularity should be at least 8 hours, or less frequent.
    */
  var schedule: js.UndefOr[String] = js.undefined
  /** Output only. State of the most recently updated transfer run. */
  var state: js.UndefOr[String] = js.undefined
  /** Output only. Data transfer modification time. Ignored by server on input. */
  var updateTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[String] = js.undefined
}

object TransferConfig {
  @scala.inline
  def apply(
    dataRefreshWindowDays: js.UndefOr[Double] = js.undefined,
    dataSourceId: String = null,
    datasetRegion: String = null,
    destinationDatasetId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    name: String = null,
    nextRunTime: String = null,
    params: Record[String, _] = null,
    schedule: String = null,
    state: String = null,
    updateTime: String = null,
    userId: String = null
  ): TransferConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataRefreshWindowDays)) __obj.updateDynamic("dataRefreshWindowDays")(dataRefreshWindowDays.get.asInstanceOf[js.Any])
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (datasetRegion != null) __obj.updateDynamic("datasetRegion")(datasetRegion.asInstanceOf[js.Any])
    if (destinationDatasetId != null) __obj.updateDynamic("destinationDatasetId")(destinationDatasetId.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextRunTime != null) __obj.updateDynamic("nextRunTime")(nextRunTime.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferConfig]
  }
}

