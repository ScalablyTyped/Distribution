package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSegUiInteractionState extends StObject {
  
  var affectedInstances: EventInstanceHash
  
  var isEvent: Boolean
  
  var segs: js.Array[Seg]
}
object EventSegUiInteractionState {
  
  inline def apply(affectedInstances: EventInstanceHash, isEvent: Boolean, segs: js.Array[Seg]): EventSegUiInteractionState = {
    val __obj = js.Dynamic.literal(affectedInstances = affectedInstances.asInstanceOf[js.Any], isEvent = isEvent.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSegUiInteractionState]
  }
  
  extension [Self <: EventSegUiInteractionState](x: Self) {
    
    inline def setAffectedInstances(value: EventInstanceHash): Self = StObject.set(x, "affectedInstances", value.asInstanceOf[js.Any])
    
    inline def setIsEvent(value: Boolean): Self = StObject.set(x, "isEvent", value.asInstanceOf[js.Any])
    
    inline def setSegs(value: js.Array[Seg]): Self = StObject.set(x, "segs", value.asInstanceOf[js.Any])
    
    inline def setSegsVarargs(value: Seg*): Self = StObject.set(x, "segs", js.Array(value*))
  }
}
