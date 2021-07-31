package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[FocusEvent[HTMLInputElement], typings.std.Event]
  
  var value: String
}
object `1` {
  
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[FocusEvent[HTMLInputElement], typings.std.Event],
    value: String
  ): `1` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[FocusEvent[HTMLInputElement], typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
