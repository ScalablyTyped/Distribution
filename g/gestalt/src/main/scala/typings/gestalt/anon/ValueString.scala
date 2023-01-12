package typings.gestalt.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]
  
  var value: String
}
object ValueString {
  
  inline def apply(event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event], value: String): ValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
