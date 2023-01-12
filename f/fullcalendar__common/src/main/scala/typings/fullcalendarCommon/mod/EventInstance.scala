package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInstance extends StObject {
  
  var defId: String
  
  var forcedEndTzo: Double | Null
  
  var forcedStartTzo: Double | Null
  
  var instanceId: String
  
  var range: DateRange
}
object EventInstance {
  
  inline def apply(defId: String, instanceId: String, range: DateRange): EventInstance = {
    val __obj = js.Dynamic.literal(defId = defId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], forcedEndTzo = null, forcedStartTzo = null)
    __obj.asInstanceOf[EventInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInstance] (val x: Self) extends AnyVal {
    
    inline def setDefId(value: String): Self = StObject.set(x, "defId", value.asInstanceOf[js.Any])
    
    inline def setForcedEndTzo(value: Double): Self = StObject.set(x, "forcedEndTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedEndTzoNull: Self = StObject.set(x, "forcedEndTzo", null)
    
    inline def setForcedStartTzo(value: Double): Self = StObject.set(x, "forcedStartTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedStartTzoNull: Self = StObject.set(x, "forcedStartTzo", null)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
