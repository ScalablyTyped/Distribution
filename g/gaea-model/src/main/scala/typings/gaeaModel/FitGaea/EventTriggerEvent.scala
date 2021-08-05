package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTriggerEvent extends StObject {
  
  var listen: js.UndefOr[String] = js.undefined
}
object EventTriggerEvent {
  
  inline def apply(): EventTriggerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTriggerEvent]
  }
  
  extension [Self <: EventTriggerEvent](x: Self) {
    
    inline def setListen(value: String): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
  }
}
