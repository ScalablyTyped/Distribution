package typings.detectPointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait detectPointer extends js.Object {
  
  var anyCoarse: Boolean = js.native
  
  var anyFine: Boolean = js.native
  
  var anyNone: Boolean = js.native
  
  var coarse: Boolean = js.native
  
  var fine: Boolean = js.native
  
  var none: Boolean = js.native
  
  def update(): Unit = js.native
}
object detectPointer {
  
  @scala.inline
  def apply(
    anyCoarse: Boolean,
    anyFine: Boolean,
    anyNone: Boolean,
    coarse: Boolean,
    fine: Boolean,
    none: Boolean,
    update: () => Unit
  ): detectPointer = {
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse.asInstanceOf[js.Any], anyFine = anyFine.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], coarse = coarse.asInstanceOf[js.Any], fine = fine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectPointer]
  }
  
  @scala.inline
  implicit class detectPointerOps[Self <: detectPointer] (val x: Self) extends AnyVal {
    
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
    def setAnyCoarse(value: Boolean): Self = this.set("anyCoarse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyFine(value: Boolean): Self = this.set("anyFine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyNone(value: Boolean): Self = this.set("anyNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoarse(value: Boolean): Self = this.set("coarse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFine(value: Boolean): Self = this.set("fine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: Boolean): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
