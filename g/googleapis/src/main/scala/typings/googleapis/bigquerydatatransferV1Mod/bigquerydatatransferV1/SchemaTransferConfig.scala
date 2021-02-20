package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a data transfer configuration. A transfer configuration contains
  * all metadata needed to perform a data transfer. For example,
  * `destination_dataset_id` specifies where data should be stored. When a new
  * transfer configuration is created, the specified `destination_dataset_id`
  * is created when needed and shared with the appropriate data source service
  * account.
  */
@js.native
trait SchemaTransferConfig extends StObject {
  
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
  var scheduleOptions: js.UndefOr[SchemaScheduleOptions] = js.native
  
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
object SchemaTransferConfig {
  
  @scala.inline
  def apply(): SchemaTransferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferConfig]
  }
  
  @scala.inline
  implicit class SchemaTransferConfigMutableBuilder[Self <: SchemaTransferConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRefreshWindowDays(value: Double): Self = StObject.set(x, "dataRefreshWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRefreshWindowDaysUndefined: Self = StObject.set(x, "dataRefreshWindowDays", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDatasetRegion(value: String): Self = StObject.set(x, "datasetRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetRegionUndefined: Self = StObject.set(x, "datasetRegion", js.undefined)
    
    @scala.inline
    def setDestinationDatasetId(value: String): Self = StObject.set(x, "destinationDatasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatasetIdUndefined: Self = StObject.set(x, "destinationDatasetId", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextRunTime(value: String): Self = StObject.set(x, "nextRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRunTimeUndefined: Self = StObject.set(x, "nextRunTime", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOptions(value: SchemaScheduleOptions): Self = StObject.set(x, "scheduleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOptionsUndefined: Self = StObject.set(x, "scheduleOptions", js.undefined)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
