package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducersMod {
  
  @JSImport("dnd-core/lib/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reduce(
    state: Unit,
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action<any> */ js.Any
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def reduce(
    state: State,
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action<any> */ js.Any
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State
    
    var dragOffset: typings.dndCore.dragOffsetMod.State
    
    var dragOperation: typings.dndCore.dragOperationMod.State
    
    var refCount: typings.dndCore.refCountMod.State
    
    var stateId: typings.dndCore.stateIdMod.State
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
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirtyHandlerIds(value: typings.dndCore.dirtyHandlerIdsMod.State): Self = StObject.set(x, "dirtyHandlerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyHandlerIdsVarargs(value: String*): Self = StObject.set(x, "dirtyHandlerIds", js.Array(value :_*))
      
      @scala.inline
      def setDragOffset(value: typings.dndCore.dragOffsetMod.State): Self = StObject.set(x, "dragOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOperation(value: typings.dndCore.dragOperationMod.State): Self = StObject.set(x, "dragOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefCount(value: typings.dndCore.refCountMod.State): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateId(value: typings.dndCore.stateIdMod.State): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
    }
  }
}
