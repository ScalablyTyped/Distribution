package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaeaEvent extends StObject {
  
  var effects: js.Array[EventAction] = js.native
  
  var triggers: js.Array[EventTriggerCondition] = js.native
}
object GaeaEvent {
  
  @scala.inline
  def apply(effects: js.Array[EventAction], triggers: js.Array[EventTriggerCondition]): GaeaEvent = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaeaEvent]
  }
  
  @scala.inline
  implicit class GaeaEventMutableBuilder[Self <: GaeaEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffects(value: js.Array[EventAction]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: EventAction*): Self = StObject.set(x, "effects", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: js.Array[EventTriggerCondition]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersVarargs(value: EventTriggerCondition*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
