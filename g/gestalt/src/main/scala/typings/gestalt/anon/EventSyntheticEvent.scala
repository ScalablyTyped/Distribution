package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSyntheticEvent extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event] = js.native
}
object EventSyntheticEvent {
  
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
  ): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  
  @scala.inline
  implicit class EventSyntheticEventMutableBuilder[Self <: EventSyntheticEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
