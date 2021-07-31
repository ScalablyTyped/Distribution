package typings.gestalt.anon

import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]
  
  var value: String
}
object ValueString {
  
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event], value: String): ValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit class ValueStringMutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
