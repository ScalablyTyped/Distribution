package typings.dndCore

import typings.dndCore.interfacesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirtyHandlerIdsMod {
  
  @JSImport("dnd-core/lib/reducers/dirtyHandlerIds", "reduce")
  @js.native
  def reduce(_state: js.UndefOr[scala.Nothing], action: Action[DirtyHandlerIdPayload]): State = js.native
  @JSImport("dnd-core/lib/reducers/dirtyHandlerIds", "reduce")
  @js.native
  def reduce(_state: State, action: Action[DirtyHandlerIdPayload]): State = js.native
  
  @js.native
  trait DirtyHandlerIdPayload extends StObject {
    
    var prevTargetIds: js.Array[String] = js.native
    
    var targetIds: js.Array[String] = js.native
  }
  object DirtyHandlerIdPayload {
    
    @scala.inline
    def apply(prevTargetIds: js.Array[String], targetIds: js.Array[String]): DirtyHandlerIdPayload = {
      val __obj = js.Dynamic.literal(prevTargetIds = prevTargetIds.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirtyHandlerIdPayload]
    }
    
    @scala.inline
    implicit class DirtyHandlerIdPayloadMutableBuilder[Self <: DirtyHandlerIdPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevTargetIds(value: js.Array[String]): Self = StObject.set(x, "prevTargetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTargetIdsVarargs(value: String*): Self = StObject.set(x, "prevTargetIds", js.Array(value :_*))
      
      @scala.inline
      def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
    }
  }
  
  type State = js.Array[String]
}
