package typings.dndCore

import typings.dndCore.interfacesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirtyHandlerIdsMod {
  
  @JSImport("dnd-core/dist/reducers/dirtyHandlerIds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(_state: Unit, action: Action[DirtyHandlerIdPayload]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(_state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def reduce(_state: State, action: Action[DirtyHandlerIdPayload]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(_state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait DirtyHandlerIdPayload extends StObject {
    
    var prevTargetIds: js.Array[String]
    
    var targetIds: js.Array[String]
  }
  object DirtyHandlerIdPayload {
    
    inline def apply(prevTargetIds: js.Array[String], targetIds: js.Array[String]): DirtyHandlerIdPayload = {
      val __obj = js.Dynamic.literal(prevTargetIds = prevTargetIds.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirtyHandlerIdPayload]
    }
    
    extension [Self <: DirtyHandlerIdPayload](x: Self) {
      
      inline def setPrevTargetIds(value: js.Array[String]): Self = StObject.set(x, "prevTargetIds", value.asInstanceOf[js.Any])
      
      inline def setPrevTargetIdsVarargs(value: String*): Self = StObject.set(x, "prevTargetIds", js.Array(value*))
      
      inline def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      inline def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value*))
    }
  }
  
  type State = js.Array[String]
}
