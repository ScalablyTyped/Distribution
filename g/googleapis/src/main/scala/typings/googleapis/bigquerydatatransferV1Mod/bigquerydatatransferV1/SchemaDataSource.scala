package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents data source metadata. Metadata is sufficient to render UI and
  * request proper OAuth tokens.
  */
@js.native
trait SchemaDataSource extends js.Object {
  
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
  var parameters: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.native
  
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
object SchemaDataSource {
  
  @scala.inline
  def apply(): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSource]
  }
  
  @scala.inline
  implicit class SchemaDataSourceOps[Self <: SchemaDataSource] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationType(value: String): Self = this.set("authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationType: Self = this.set("authorizationType", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setDataRefreshType(value: String): Self = this.set("dataRefreshType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRefreshType: Self = this.set("dataRefreshType", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    
    @scala.inline
    def setDefaultDataRefreshWindowDays(value: Double): Self = this.set("defaultDataRefreshWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDataRefreshWindowDays: Self = this.set("defaultDataRefreshWindowDays", js.undefined)
    
    @scala.inline
    def setDefaultSchedule(value: String): Self = this.set("defaultSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSchedule: Self = this.set("defaultSchedule", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHelpUrl(value: String): Self = this.set("helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpUrl: Self = this.set("helpUrl", js.undefined)
    
    @scala.inline
    def setManualRunsDisabled(value: Boolean): Self = this.set("manualRunsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualRunsDisabled: Self = this.set("manualRunsDisabled", js.undefined)
    
    @scala.inline
    def setMinimumScheduleInterval(value: String): Self = this.set("minimumScheduleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumScheduleInterval: Self = this.set("minimumScheduleInterval", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaDataSourceParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[SchemaDataSourceParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setSupportsCustomSchedule(value: Boolean): Self = this.set("supportsCustomSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsCustomSchedule: Self = this.set("supportsCustomSchedule", js.undefined)
    
    @scala.inline
    def setSupportsMultipleTransfers(value: Boolean): Self = this.set("supportsMultipleTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsMultipleTransfers: Self = this.set("supportsMultipleTransfers", js.undefined)
    
    @scala.inline
    def setTransferType(value: String): Self = this.set("transferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferType: Self = this.set("transferType", js.undefined)
    
    @scala.inline
    def setUpdateDeadlineSeconds(value: Double): Self = this.set("updateDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDeadlineSeconds: Self = this.set("updateDeadlineSeconds", js.undefined)
  }
}
