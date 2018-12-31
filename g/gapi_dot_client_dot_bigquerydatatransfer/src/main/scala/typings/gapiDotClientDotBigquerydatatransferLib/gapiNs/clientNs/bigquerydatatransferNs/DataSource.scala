package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** Indicates the type of authorization. */
  var authorizationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data source client id which should be used to receive refresh token.
    * When not supplied, no offline credentials are populated for data transfer.
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether the data source supports automatic data refresh for the
    * past few days, and how it's supported.
    * For some data sources, data might not be complete until a few days later,
    * so it's useful to refresh data automatically.
    */
  var dataRefreshType: js.UndefOr[java.lang.String] = js.undefined
  /** Data source id. */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default data refresh window on days.
    * Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`.
    */
  var defaultDataRefreshWindowDays: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default data transfer schedule.
    * Examples of valid schedules include:
    * `1st,3rd monday of month 15:30`,
    * `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    */
  var defaultSchedule: js.UndefOr[java.lang.String] = js.undefined
  /** User friendly data source description string. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** User friendly data source name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Url for the help document for this data source. */
  var helpUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disables backfilling and manual run scheduling
    * for the data source.
    */
  var manualRunsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The minimum interval between two consecutive scheduled runs. */
  var minimumScheduleInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Data source resource name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Data source parameters. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
  /**
    * Api auth scopes for which refresh token needs to be obtained. Only valid
    * when `client_id` is specified. Ignored otherwise. These are scopes needed
    * by a data source to prepare data and ingest them into BigQuery,
    * e.g., https://www.googleapis.com/auth/bigquery
    */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies whether the data source supports a user defined schedule, or
    * operates on the default schedule.
    * When set to `true`, user can override default schedule.
    */
  var supportsCustomSchedule: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether the data source supports multiple transfers
    * to different BigQuery targets.
    */
  var supportsMultipleTransfers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Transfer type. Currently supports only batch transfers,
    * which are transfers that use the BigQuery batch APIs (load or
    * query) to ingest the data.
    */
  var transferType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of seconds to wait for an update from the data source
    * before BigQuery marks the transfer as failed.
    */
  var updateDeadlineSeconds: js.UndefOr[scala.Double] = js.undefined
}

