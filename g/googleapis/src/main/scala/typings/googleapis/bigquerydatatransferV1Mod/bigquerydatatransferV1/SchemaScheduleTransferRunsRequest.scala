package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScheduleTransferRunsRequest extends StObject {
  
  /**
    * Required. End time of the range of transfer runs. For example, `"2017-05-30T00:00:00+00:00"`.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Start time of the range of transfer runs. For example, `"2017-05-25T00:00:00+00:00"`.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaScheduleTransferRunsRequest {
  
  inline def apply(): SchemaScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsRequest]
  }
  
  extension [Self <: SchemaScheduleTransferRunsRequest](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
