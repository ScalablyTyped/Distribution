package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragMeta extends StObject {
  
  var create: Boolean
  
  var duration: Duration | Null
  
  var leftoverProps: Dictionary
  
  var sourceId: String
  
  var startTime: Duration | Null
}
object DragMeta {
  
  inline def apply(create: Boolean, leftoverProps: Dictionary, sourceId: String): DragMeta = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], leftoverProps = leftoverProps.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], duration = null, startTime = null)
    __obj.asInstanceOf[DragMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragMeta] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setLeftoverProps(value: Dictionary): Self = StObject.set(x, "leftoverProps", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Duration): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
  }
}
