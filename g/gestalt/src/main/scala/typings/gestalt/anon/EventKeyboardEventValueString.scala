package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventKeyboardEventValueString extends StObject {
  
  var event: KeyboardEvent[HTMLTextAreaElement]
  
  var value: String
}
object EventKeyboardEventValueString {
  
  inline def apply(event: KeyboardEvent[HTMLTextAreaElement], value: String): EventKeyboardEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventKeyboardEventValueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventKeyboardEventValueString] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: KeyboardEvent[HTMLTextAreaElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
