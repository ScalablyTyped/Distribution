package typings.dragster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dragster extends js.Object {
  
  def removeListeners(): Unit = js.native
  
  def reset(): Unit = js.native
}
object Dragster {
  
  @scala.inline
  def apply(removeListeners: () => Unit, reset: () => Unit): Dragster = {
    val __obj = js.Dynamic.literal(removeListeners = js.Any.fromFunction0(removeListeners), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Dragster]
  }
  
  @scala.inline
  implicit class DragsterOps[Self <: Dragster] (val x: Self) extends AnyVal {
    
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
    def setRemoveListeners(value: () => Unit): Self = this.set("removeListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
