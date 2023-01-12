package typings.fullcalendarCommon.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateUnselectArg extends StObject {
  
  var jsEvent: MouseEvent
  
  var view: ViewApi
}
object DateUnselectArg {
  
  inline def apply(jsEvent: MouseEvent, view: ViewApi): DateUnselectArg = {
    val __obj = js.Dynamic.literal(jsEvent = jsEvent.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateUnselectArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateUnselectArg] (val x: Self) extends AnyVal {
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
