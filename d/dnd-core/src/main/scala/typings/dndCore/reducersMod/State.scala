package typings.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State = js.native
  
  var dragOffset: typings.dndCore.dragOffsetMod.State = js.native
  
  var dragOperation: typings.dndCore.dragOperationMod.State = js.native
  
  var refCount: typings.dndCore.refCountMod.State = js.native
  
  var stateId: typings.dndCore.stateIdMod.State = js.native
}
object State {
  
  @scala.inline
  def apply(
    dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State,
    dragOffset: typings.dndCore.dragOffsetMod.State,
    dragOperation: typings.dndCore.dragOperationMod.State,
    refCount: typings.dndCore.refCountMod.State,
    stateId: typings.dndCore.stateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDirtyHandlerIdsVarargs(value: String*): Self = this.set("dirtyHandlerIds", js.Array(value :_*))
    
    @scala.inline
    def setDirtyHandlerIds(value: typings.dndCore.dirtyHandlerIdsMod.State): Self = this.set("dirtyHandlerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOffset(value: typings.dndCore.dragOffsetMod.State): Self = this.set("dragOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOperation(value: typings.dndCore.dragOperationMod.State): Self = this.set("dragOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefCount(value: typings.dndCore.refCountMod.State): Self = this.set("refCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateId(value: typings.dndCore.stateIdMod.State): Self = this.set("stateId", value.asInstanceOf[js.Any])
  }
}
