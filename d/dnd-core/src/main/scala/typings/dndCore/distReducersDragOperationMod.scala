package typings.dndCore

import typings.dndCore.anon.DropResult
import typings.dndCore.distInterfacesMod.Action
import typings.dndCore.distInterfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersDragOperationMod {
  
  @JSImport("dnd-core/dist/reducers/dragOperation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(state: Unit, action: Action[DropResult]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def reduce(state: State, action: Action[DropResult]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var didDrop: Boolean
    
    var dropResult: Any
    
    var isSourcePublic: Boolean | Null
    
    var item: Any
    
    var itemType: Identifier | js.Array[Identifier] | Null
    
    var sourceId: String | Null
    
    var targetIds: js.Array[String]
  }
  object State {
    
    inline def apply(didDrop: Boolean, dropResult: Any, item: Any, targetIds: js.Array[String]): State = {
      val __obj = js.Dynamic.literal(didDrop = didDrop.asInstanceOf[js.Any], dropResult = dropResult.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any], isSourcePublic = null, itemType = null, sourceId = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDidDrop(value: Boolean): Self = StObject.set(x, "didDrop", value.asInstanceOf[js.Any])
      
      inline def setDropResult(value: Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
      
      inline def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
      
      inline def setIsSourcePublicNull: Self = StObject.set(x, "isSourcePublic", null)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemType(value: Identifier | js.Array[Identifier]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
      
      inline def setItemTypeVarargs(value: Identifier*): Self = StObject.set(x, "itemType", js.Array(value*))
      
      inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      inline def setSourceIdNull: Self = StObject.set(x, "sourceId", null)
      
      inline def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      inline def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value*))
    }
  }
}
