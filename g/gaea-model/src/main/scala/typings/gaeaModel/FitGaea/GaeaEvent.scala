package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaeaEvent extends StObject {
  
  var effects: js.Array[EventAction]
  
  var triggers: js.Array[EventTriggerCondition]
}
object GaeaEvent {
  
  inline def apply(effects: js.Array[EventAction], triggers: js.Array[EventTriggerCondition]): GaeaEvent = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaeaEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaeaEvent] (val x: Self) extends AnyVal {
    
    inline def setEffects(value: js.Array[EventAction]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: EventAction*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setTriggers(value: js.Array[EventTriggerCondition]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersVarargs(value: EventTriggerCondition*): Self = StObject.set(x, "triggers", js.Array(value*))
  }
}
