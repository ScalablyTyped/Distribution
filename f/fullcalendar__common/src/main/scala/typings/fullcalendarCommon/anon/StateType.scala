package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.SET_EVENT_RESIZE
import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.EventInteractionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateType
  extends StObject
     with Action {
  
  var state: EventInteractionState
  
  var `type`: SET_EVENT_RESIZE
}
object StateType {
  
  inline def apply(state: EventInteractionState): StateType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_RESIZE")
    __obj.asInstanceOf[StateType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
    
    inline def setState(value: EventInteractionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET_EVENT_RESIZE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
