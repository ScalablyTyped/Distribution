package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.SELECT_EVENT
import typings.fullcalendarCommon.mod.Action
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
  
  extension [Self <: EventInstanceId](x: Self) {
    
    inline def setEventInstanceId(value: String): Self = StObject.set(x, "eventInstanceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: SELECT_EVENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
