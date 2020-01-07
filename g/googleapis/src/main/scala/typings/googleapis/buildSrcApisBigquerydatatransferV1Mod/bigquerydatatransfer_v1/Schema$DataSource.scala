package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents data source metadata. Metadata is sufficient to render UI and
  * request proper OAuth tokens.
  */
@js.native
trait Schema$DataSource extends js.Object {
  /**
    * Indicates the type of authorization.
    */
  var authorizationType: js.UndefOr[String] = js.native
  /**
    * Data source client id which should be used to receive refresh token.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * Specifies whether the data source supports automatic data refresh for the
    * past few days, and how it&#39;s supported. For some data sources, data
    * might not be complete until a few days later, so it&#39;s useful to
    * refresh data automatically.
    */
  var dataRefreshType: js.UndefOr[String] = js.native
  /**
    * Data source id.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Default data refresh window on days. Only meaningful when
    * `data_refresh_type` = `SLIDING_WINDOW`.
    */
  var defaultDataRefreshWindowDays: js.UndefOr[Double] = js.native
  /**
    * Default data transfer schedule. Examples of valid schedules include:
    * `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    */
  var defaultSchedule: js.UndefOr[String] = js.native
  /**
    * User friendly data source description string.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * User friendly data source name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Url for the help document for this data source.
    */
  var helpUrl: js.UndefOr[String] = js.native
  /**
    * Disables backfilling and manual run scheduling for the data source.
    */
  var manualRunsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The minimum interval for scheduler to schedule runs.
    */
  var minimumScheduleInterval: js.UndefOr[String] = js.native
  /**
    * Output only. Data source resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Data source parameters.
    */
  var parameters: js.UndefOr[js.Array[Schema$DataSourceParameter]] = js.native
  /**
    * Api auth scopes for which refresh token needs to be obtained. These are
    * scopes needed by a data source to prepare data and ingest them into
    * BigQuery, e.g., https://www.googleapis.com/auth/bigquery
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies whether the data source supports a user defined schedule, or
    * operates on the default schedule. When set to `true`, user can override
    * default schedule.
    */
  var supportsCustomSchedule: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var supportsMultipleTransfers: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var transferType: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for an update from the data source before
    * the Data Transfer Service marks the transfer as FAILED.
    */
  var updateDeadlineSeconds: js.UndefOr[Double] = js.native
}

object Schema$DataSource {
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
    parameters: js.Array[Schema$DataSourceParameter] = null,
    scopes: js.Array[String] = null,
    supportsCustomSchedule: js.UndefOr[Boolean] = js.undefined,
    supportsMultipleTransfers: js.UndefOr[Boolean] = js.undefined,
    transferType: String = null,
    updateDeadlineSeconds: Int | Double = null
  ): Schema$DataSource = {
    val __obj = js.Dynamic.literal()
    if (authorizationType != null) __obj.updateDynamic("authorizationType")(authorizationType.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (dataRefreshType != null) __obj.updateDynamic("dataRefreshType")(dataRefreshType.asInstanceOf[js.Any])
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (defaultDataRefreshWindowDays != null) __obj.updateDynamic("defaultDataRefreshWindowDays")(defaultDataRefreshWindowDays.asInstanceOf[js.Any])
    if (defaultSchedule != null) __obj.updateDynamic("defaultSchedule")(defaultSchedule.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (helpUrl != null) __obj.updateDynamic("helpUrl")(helpUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(manualRunsDisabled)) __obj.updateDynamic("manualRunsDisabled")(manualRunsDisabled.asInstanceOf[js.Any])
    if (minimumScheduleInterval != null) __obj.updateDynamic("minimumScheduleInterval")(minimumScheduleInterval.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsCustomSchedule)) __obj.updateDynamic("supportsCustomSchedule")(supportsCustomSchedule.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsMultipleTransfers)) __obj.updateDynamic("supportsMultipleTransfers")(supportsMultipleTransfers.asInstanceOf[js.Any])
    if (transferType != null) __obj.updateDynamic("transferType")(transferType.asInstanceOf[js.Any])
    if (updateDeadlineSeconds != null) __obj.updateDynamic("updateDeadlineSeconds")(updateDeadlineSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataSource]
  }
}

