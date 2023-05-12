package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.SELECT_EVENT
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInstanceId
  extends StObject
     with Action {
  
  var eventInstanceId: String
  
  var `type`: SELECT_EVENT
}
object EventInstanceId {
  
  inline def apply(eventInstanceId: String): EventInstanceId = {
    val __obj = js.Dynamic.literal(eventInstanceId = eventInstanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_EVENT")
    __obj.asInstanceOf[EventInstanceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInstanceId] (val x: Self) extends AnyVal {
    
    inline def setEventInstanceId(value: String): Self = StObject.set(x, "eventInstanceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: SELECT_EVENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
