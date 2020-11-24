package typings.devexpressUtils.batchUpdatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBatchUpdatableObject extends js.Object {
  
  def beginUpdate(): Unit = js.native
  
  def endUpdate(): Unit = js.native
}
object IBatchUpdatableObject {
  
  @scala.inline
  def apply(beginUpdate: () => Unit, endUpdate: () => Unit): IBatchUpdatableObject = {
    val __obj = js.Dynamic.literal(beginUpdate = js.Any.fromFunction0(beginUpdate), endUpdate = js.Any.fromFunction0(endUpdate))
    __obj.asInstanceOf[IBatchUpdatableObject]
  }
  
  @scala.inline
  implicit class IBatchUpdatableObjectOps[Self <: IBatchUpdatableObject] (val x: Self) extends AnyVal {
    
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
    def setBeginUpdate(value: () => Unit): Self = this.set("beginUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndUpdate(value: () => Unit): Self = this.set("endUpdate", js.Any.fromFunction0(value))
  }
}
