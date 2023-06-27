package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskInfo extends StObject {
  
  /**
    * The extra time it takes to perform the task, in milliseconds.
    */
  var extraDurationMillis: Double | Null
  
  /**
    * The ID of the task.
    */
  var id: String | Null
  
  /**
    * The time window during which the task should be completed.
    */
  var targetTimeWindow: TimeWindow | Null
}
object TaskInfo {
  
  inline def apply(): TaskInfo = {
    val __obj = js.Dynamic.literal(extraDurationMillis = null, id = null, targetTimeWindow = null)
    __obj.asInstanceOf[TaskInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskInfo] (val x: Self) extends AnyVal {
    
    inline def setExtraDurationMillis(value: Double): Self = StObject.set(x, "extraDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setExtraDurationMillisNull: Self = StObject.set(x, "extraDurationMillis", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setTargetTimeWindow(value: TimeWindow): Self = StObject.set(x, "targetTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setTargetTimeWindowNull: Self = StObject.set(x, "targetTimeWindow", null)
  }
}
