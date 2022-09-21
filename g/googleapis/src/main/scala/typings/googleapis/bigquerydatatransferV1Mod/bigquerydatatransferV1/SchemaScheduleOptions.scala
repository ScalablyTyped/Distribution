package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScheduleOptions extends StObject {
  
  /**
    * If true, automatic scheduling of data transfer runs for this configuration will be disabled. The runs can be started on ad-hoc basis using StartManualTransferRuns API. When automatic scheduling is disabled, the TransferConfig.schedule field will be ignored.
    */
  var disableAutoScheduling: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Defines time to stop scheduling transfer runs. A transfer run cannot be scheduled at or after the end time. The end time can be changed at any moment. The time when a data transfer can be trigerred manually is not limited by this option.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies time to start scheduling transfer runs. The first run will be scheduled at or after the start time according to a recurrence pattern defined in the schedule string. The start time can be changed at any moment. The time when a data transfer can be trigerred manually is not limited by this option.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaScheduleOptions {
  
  inline def apply(): SchemaScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleOptions]
  }
  
  extension [Self <: SchemaScheduleOptions](x: Self) {
    
    inline def setDisableAutoScheduling(value: Boolean): Self = StObject.set(x, "disableAutoScheduling", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoSchedulingNull: Self = StObject.set(x, "disableAutoScheduling", null)
    
    inline def setDisableAutoSchedulingUndefined: Self = StObject.set(x, "disableAutoScheduling", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
