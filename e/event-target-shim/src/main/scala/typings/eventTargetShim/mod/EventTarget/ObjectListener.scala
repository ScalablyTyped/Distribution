package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectListener[TEvent] extends js.Object {
  
  def handleEvent(event: TEvent): Unit = js.native
}
object ObjectListener {
  
  @scala.inline
  def apply[TEvent](handleEvent: TEvent => Unit): ObjectListener[TEvent] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ObjectListener[TEvent]]
  }
  
  @scala.inline
  implicit class ObjectListenerOps[Self <: ObjectListener[_], TEvent] (val x: Self with ObjectListener[TEvent]) extends AnyVal {
    
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
    def setHandleEvent(value: TEvent => Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
}
