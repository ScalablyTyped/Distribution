package typings.gestaltDatepicker

import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticEvent[HTMLInputElement, typings.std.Event] = js.native
    
    var value: Date = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticEvent[HTMLInputElement, typings.std.Event], value: Date): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
