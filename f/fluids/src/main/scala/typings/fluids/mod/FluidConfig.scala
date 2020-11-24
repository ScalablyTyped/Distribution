package typings.fluids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidConfig[T, Event /* <: FluidEvent[T] */] extends js.Object {
  
  def addChild(child: FluidObserver[Event]): Unit = js.native
  
  def get(): T = js.native
  
  def removeChild(child: FluidObserver[Event]): Unit = js.native
}
object FluidConfig {
  
  @scala.inline
  def apply[T, Event /* <: FluidEvent[T] */](addChild: FluidObserver[Event] => Unit, get: () => T, removeChild: FluidObserver[Event] => Unit): FluidConfig[T, Event] = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), get = js.Any.fromFunction0(get), removeChild = js.Any.fromFunction1(removeChild))
    __obj.asInstanceOf[FluidConfig[T, Event]]
  }
  
  @scala.inline
  implicit class FluidConfigOps[Self <: FluidConfig[_, _], T, Event /* <: FluidEvent[T] */] (val x: Self with (FluidConfig[T, Event])) extends AnyVal {
    
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
    def setAddChild(value: FluidObserver[Event] => Unit): Self = this.set("addChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveChild(value: FluidObserver[Event] => Unit): Self = this.set("removeChild", js.Any.fromFunction1(value))
  }
}
