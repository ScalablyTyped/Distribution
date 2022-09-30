package typings.dndCore

import typings.dndCore.interfacesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducersMod {
  
  @JSImport("dnd-core/dist/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(state: Unit, action: Action[Any]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def reduce(state: State, action: Action[Any]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State
    
    var dragOffset: typings.dndCore.dragOffsetMod.State
    
    var dragOperation: typings.dndCore.dragOperationMod.State
    
    var refCount: typings.dndCore.refCountMod.State
    
    var stateId: typings.dndCore.stateIdMod.State
  }
  object State {
    
    inline def apply(
      dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State,
      dragOffset: typings.dndCore.dragOffsetMod.State,
      dragOperation: typings.dndCore.dragOperationMod.State,
      refCount: typings.dndCore.refCountMod.State,
      stateId: typings.dndCore.stateIdMod.State
    ): State = {
      val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDirtyHandlerIds(value: typings.dndCore.dirtyHandlerIdsMod.State): Self = StObject.set(x, "dirtyHandlerIds", value.asInstanceOf[js.Any])
      
      inline def setDirtyHandlerIdsVarargs(value: String*): Self = StObject.set(x, "dirtyHandlerIds", js.Array(value*))
      
      inline def setDragOffset(value: typings.dndCore.dragOffsetMod.State): Self = StObject.set(x, "dragOffset", value.asInstanceOf[js.Any])
      
      inline def setDragOperation(value: typings.dndCore.dragOperationMod.State): Self = StObject.set(x, "dragOperation", value.asInstanceOf[js.Any])
      
      inline def setRefCount(value: typings.dndCore.refCountMod.State): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      inline def setStateId(value: typings.dndCore.stateIdMod.State): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
    }
  }
}
