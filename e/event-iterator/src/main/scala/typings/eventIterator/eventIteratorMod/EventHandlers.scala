package typings.eventIterator.eventIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlers extends js.Object {
  
  def highWater(): Unit = js.native
  
  def lowWater(): Unit = js.native
}
object EventHandlers {
  
  @scala.inline
  def apply(highWater: () => Unit, lowWater: () => Unit): EventHandlers = {
    val __obj = js.Dynamic.literal(highWater = js.Any.fromFunction0(highWater), lowWater = js.Any.fromFunction0(lowWater))
    __obj.asInstanceOf[EventHandlers]
  }
  
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers] (val x: Self) extends AnyVal {
    
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
    def setHighWater(value: () => Unit): Self = this.set("highWater", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLowWater(value: () => Unit): Self = this.set("lowWater", js.Any.fromFunction0(value))
  }
}
