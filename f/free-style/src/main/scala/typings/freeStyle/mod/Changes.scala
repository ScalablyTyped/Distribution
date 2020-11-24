package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes extends js.Object {
  
  def add(style: Container[_], index: Double): Unit = js.native
  
  def change(style: Container[_], oldIndex: Double, newIndex: Double): Unit = js.native
  
  def remove(style: Container[_], index: Double): Unit = js.native
}
object Changes {
  
  @scala.inline
  def apply(
    add: (Container[_], Double) => Unit,
    change: (Container[_], Double, Double) => Unit,
    remove: (Container[_], Double) => Unit
  ): Changes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[Changes]
  }
  
  @scala.inline
  implicit class ChangesOps[Self <: Changes] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Container[_], Double) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChange(value: (Container[_], Double, Double) => Unit): Self = this.set("change", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: (Container[_], Double) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
}
