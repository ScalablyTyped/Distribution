package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a data transfer run.
  */
@js.native
trait SchemaTransferRun extends StObject {
  
  /**
    * Output only. Data source id.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /**
    * Output only. The BigQuery target dataset id.
    */
  var destinationDatasetId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time when transfer run ended. Parameter ignored by server
    * for input requests.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Status of the transfer run.
    */
  var errorStatus: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * The resource name of the transfer run. Transfer run names have the form
    * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
    * The name is ignored when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. Data transfer specific parameters.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * For batch transfer runs, specifies the date and time that data should be
    * ingested.
    */
  var runTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Describes the schedule of this transfer run if it was
    * created as part of a regular schedule. For batch transfer runs that are
    * scheduled manually, this is empty. NOTE: the system might choose to delay
    * the schedule depending on the current load, so `schedule_time`
    * doesn&#39;t always match this.
    */
  var schedule: js.UndefOr[String] = js.native
  
  /**
    * Minimum time after which a transfer run can be started.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time when transfer run was started. Parameter ignored by
    * server for input requests.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Data transfer run state. Ignored for input requests.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. Last time the data transfer run state was updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Unique ID of the user on whose behalf transfer is done.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaTransferRun {
  
  @scala.inline
  def apply(): SchemaTransferRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferRun]
  }
  
  @scala.inline
  implicit class SchemaTransferRunMutableBuilder[Self <: SchemaTransferRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDestinationDatasetId(value: String): Self = StObject.set(x, "destinationDatasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatasetIdUndefined: Self = StObject.set(x, "destinationDatasetId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setErrorStatus(value: SchemaStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRunTime(value: String): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunTimeUndefined: Self = StObject.set(x, "runTime", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
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
