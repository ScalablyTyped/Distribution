package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventKeyboardEventValue extends StObject {
  
  var event: KeyboardEvent[HTMLInputElement]
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventKeyboardEventValue {
  
  inline def apply(event: KeyboardEvent[HTMLInputElement]): EventKeyboardEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventKeyboardEventValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventKeyboardEventValue] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: KeyboardEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
