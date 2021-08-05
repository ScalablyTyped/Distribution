package typings.extendedListbox

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxEvent extends StObject {
  
  /** any object */
  var args: js.Any
  
  /** unique event name */
  var eventName: String
  
  /** target object for which event is triggered */
  var target: Element
}
object ListBoxEvent {
  
  inline def apply(args: js.Any, eventName: String, target: Element): ListBoxEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxEvent]
  }
  
  extension [Self <: ListBoxEvent](x: Self) {
    
    inline def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
