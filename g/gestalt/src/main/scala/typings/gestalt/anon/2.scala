package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[KeyboardEvent[HTMLInputElement], typings.std.Event]
  
  var value: String
}
object `2` {
  
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[KeyboardEvent[HTMLInputElement], typings.std.Event],
    value: String
  ): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[KeyboardEvent[HTMLInputElement], typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
