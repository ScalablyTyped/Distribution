package typings.gestalt.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] extends js.Object {
  
  val event: T = js.native
}
object Event {
  
  @scala.inline
  def apply[T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */](event: T): Event[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event[_], T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] (val x: Self with Event[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: T): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
