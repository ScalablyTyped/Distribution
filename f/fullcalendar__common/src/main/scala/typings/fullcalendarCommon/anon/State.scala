package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.SET_EVENT_DRAG
import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.EventInteractionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State
  extends StObject
     with Action {
  
  var state: EventInteractionState
  
  var `type`: SET_EVENT_DRAG
}
object State {
  
  inline def apply(state: EventInteractionState): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_DRAG")
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: EventInteractionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET_EVENT_DRAG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
