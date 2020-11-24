package typings.devexpressUtils.batchUpdatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBatchUpdatableObjectExtend extends IBatchUpdatableObject {
  
  def continueUpdate(): Unit = js.native
  
  def isUpdateLocked(): Boolean = js.native
  
  def onUpdateLocked(): Unit = js.native
  
  def suspendUpdate(): Unit = js.native
}
object IBatchUpdatableObjectExtend {
  
  @scala.inline
  def apply(
    beginUpdate: () => Unit,
    continueUpdate: () => Unit,
    endUpdate: () => Unit,
    isUpdateLocked: () => Boolean,
    onUpdateLocked: () => Unit,
    suspendUpdate: () => Unit
  ): IBatchUpdatableObjectExtend = {
    val __obj = js.Dynamic.literal(beginUpdate = js.Any.fromFunction0(beginUpdate), continueUpdate = js.Any.fromFunction0(continueUpdate), endUpdate = js.Any.fromFunction0(endUpdate), isUpdateLocked = js.Any.fromFunction0(isUpdateLocked), onUpdateLocked = js.Any.fromFunction0(onUpdateLocked), suspendUpdate = js.Any.fromFunction0(suspendUpdate))
    __obj.asInstanceOf[IBatchUpdatableObjectExtend]
  }
  
  @scala.inline
  implicit class IBatchUpdatableObjectExtendOps[Self <: IBatchUpdatableObjectExtend] (val x: Self) extends AnyVal {
    
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
    def setContinueUpdate(value: () => Unit): Self = this.set("continueUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUpdateLocked(value: () => Boolean): Self = this.set("isUpdateLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUpdateLocked(value: () => Unit): Self = this.set("onUpdateLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendUpdate(value: () => Unit): Self = this.set("suspendUpdate", js.Any.fromFunction0(value))
  }
}
