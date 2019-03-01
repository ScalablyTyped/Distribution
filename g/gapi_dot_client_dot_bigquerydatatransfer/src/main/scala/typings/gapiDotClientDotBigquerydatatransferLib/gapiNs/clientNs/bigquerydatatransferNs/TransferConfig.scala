package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

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
  var dataRefreshWindowDays: js.UndefOr[scala.Double] = js.undefined
  /** Data source id. Cannot be changed once data transfer is created. */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[java.lang.String] = js.undefined
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is this config disabled. When set to true, no runs are scheduled
    * for a given transfer.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** User specified display name for the data transfer. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the transfer config.
    * Transfer config names have the form
    * `projects/{project_id}/transferConfigs/{config_id}`.
    * Where `config_id` is usually a uuid, even though it is not
    * guaranteed or required. The name is ignored when creating a transfer
    * config.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Next time when data transfer will run. */
  var nextRunTime: js.UndefOr[java.lang.String] = js.undefined
  /** Data transfer specific parameters. */
  var params: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
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
  var schedule: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. State of the most recently updated transfer run. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Data transfer modification time. Ignored by server on input. */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object TransferConfig {
  @scala.inline
  def apply(
    dataRefreshWindowDays: scala.Int | scala.Double = null,
    dataSourceId: java.lang.String = null,
    datasetRegion: java.lang.String = null,
    destinationDatasetId: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    name: java.lang.String = null,
    nextRunTime: java.lang.String = null,
    params: stdLib.Record[java.lang.String, _] = null,
    schedule: java.lang.String = null,
    state: java.lang.String = null,
    updateTime: java.lang.String = null,
    userId: java.lang.String = null
  ): TransferConfig = {
    val __obj = js.Dynamic.literal()
    if (dataRefreshWindowDays != null) __obj.updateDynamic("dataRefreshWindowDays")(dataRefreshWindowDays.asInstanceOf[js.Any])
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId)
    if (datasetRegion != null) __obj.updateDynamic("datasetRegion")(datasetRegion)
    if (destinationDatasetId != null) __obj.updateDynamic("destinationDatasetId")(destinationDatasetId)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nextRunTime != null) __obj.updateDynamic("nextRunTime")(nextRunTime)
    if (params != null) __obj.updateDynamic("params")(params)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (state != null) __obj.updateDynamic("state")(state)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TransferConfig]
  }
}

