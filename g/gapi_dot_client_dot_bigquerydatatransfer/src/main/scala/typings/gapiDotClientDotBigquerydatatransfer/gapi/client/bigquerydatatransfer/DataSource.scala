package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** Indicates the type of authorization. */
  var authorizationType: js.UndefOr[String] = js.undefined
  /**
    * Data source client id which should be used to receive refresh token.
    * When not supplied, no offline credentials are populated for data transfer.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the data source supports automatic data refresh for the
    * past few days, and how it's supported.
    * For some data sources, data might not be complete until a few days later,
    * so it's useful to refresh data automatically.
    */
  var dataRefreshType: js.UndefOr[String] = js.undefined
  /** Data source id. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  /**
    * Default data refresh window on days.
    * Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`.
    */
  var defaultDataRefreshWindowDays: js.UndefOr[Double] = js.undefined
  /**
    * Default data transfer schedule.
    * Examples of valid schedules include:
    * `1st,3rd monday of month 15:30`,
    * `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    */
  var defaultSchedule: js.UndefOr[String] = js.undefined
  /** User friendly data source description string. */
  var description: js.UndefOr[String] = js.undefined
  /** User friendly data source name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Url for the help document for this data source. */
  var helpUrl: js.UndefOr[String] = js.undefined
  /**
    * Disables backfilling and manual run scheduling
    * for the data source.
    */
  var manualRunsDisabled: js.UndefOr[Boolean] = js.undefined
  /** The minimum interval between two consecutive scheduled runs. */
  var minimumScheduleInterval: js.UndefOr[String] = js.undefined
  /** Data source resource name. */
  var name: js.UndefOr[String] = js.undefined
  /** Data source parameters. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
  /**
    * Api auth scopes for which refresh token needs to be obtained. Only valid
    * when `client_id` is specified. Ignored otherwise. These are scopes needed
    * by a data source to prepare data and ingest them into BigQuery,
    * e.g., https://www.googleapis.com/auth/bigquery
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies whether the data source supports a user defined schedule, or
    * operates on the default schedule.
    * When set to `true`, user can override default schedule.
    */
  var supportsCustomSchedule: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the data source supports multiple transfers
    * to different BigQuery targets.
    */
  var supportsMultipleTransfers: js.UndefOr[Boolean] = js.undefined
  /**
    * Transfer type. Currently supports only batch transfers,
    * which are transfers that use the BigQuery batch APIs (load or
    * query) to ingest the data.
    */
  var transferType: js.UndefOr[String] = js.undefined
  /**
    * The number of seconds to wait for an update from the data source
    * before BigQuery marks the transfer as failed.
    */
  var updateDeadlineSeconds: js.UndefOr[Double] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    authorizationType: String = null,
    clientId: String = null,
    dataRefreshType: String = null,
    dataSourceId: String = null,
    defaultDataRefreshWindowDays: Int | Double = null,
    defaultSchedule: String = null,
    description: String = null,
    displayName: String = null,
    helpUrl: String = null,
    manualRunsDisabled: js.UndefOr[Boolean] = js.undefined,
    minimumScheduleInterval: String = null,
    name: String = null,
    parameters: js.Array[DataSourceParameter] = null,
    scopes: js.Array[String] = null,
    supportsCustomSchedule: js.UndefOr[Boolean] = js.undefined,
    supportsMultipleTransfers: js.UndefOr[Boolean] = js.undefined,
    transferType: String = null,
    updateDeadlineSeconds: Int | Double = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (authorizationType != null) __obj.updateDynamic("authorizationType")(authorizationType)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (dataRefreshType != null) __obj.updateDynamic("dataRefreshType")(dataRefreshType)
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId)
    if (defaultDataRefreshWindowDays != null) __obj.updateDynamic("defaultDataRefreshWindowDays")(defaultDataRefreshWindowDays.asInstanceOf[js.Any])
    if (defaultSchedule != null) __obj.updateDynamic("defaultSchedule")(defaultSchedule)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (helpUrl != null) __obj.updateDynamic("helpUrl")(helpUrl)
    if (!js.isUndefined(manualRunsDisabled)) __obj.updateDynamic("manualRunsDisabled")(manualRunsDisabled)
    if (minimumScheduleInterval != null) __obj.updateDynamic("minimumScheduleInterval")(minimumScheduleInterval)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (!js.isUndefined(supportsCustomSchedule)) __obj.updateDynamic("supportsCustomSchedule")(supportsCustomSchedule)
    if (!js.isUndefined(supportsMultipleTransfers)) __obj.updateDynamic("supportsMultipleTransfers")(supportsMultipleTransfers)
    if (transferType != null) __obj.updateDynamic("transferType")(transferType)
    if (updateDeadlineSeconds != null) __obj.updateDynamic("updateDeadlineSeconds")(updateDeadlineSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

