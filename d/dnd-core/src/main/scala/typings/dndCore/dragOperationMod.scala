package typings.dndCore

import typings.dndCore.anon.DropResult
import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragOperationMod {
  
  @JSImport("dnd-core/lib/reducers/dragOperation", "reduce")
  @js.native
  def reduce(state: js.UndefOr[scala.Nothing], action: Action[DropResult]): State = js.native
  @JSImport("dnd-core/lib/reducers/dragOperation", "reduce")
  @js.native
  def reduce(state: State, action: Action[DropResult]): State = js.native
  
  @js.native
  trait State extends StObject {
    
    var didDrop: Boolean = js.native
    
    var dropResult: js.Any = js.native
    
    var isSourcePublic: Boolean | Null = js.native
    
    var item: js.Any = js.native
    
    var itemType: Identifier | js.Array[Identifier] | Null = js.native
    
    var sourceId: String | Null = js.native
    
    var targetIds: js.Array[String] = js.native
  }
  object State {
    
    @scala.inline
    def apply(didDrop: Boolean, dropResult: js.Any, item: js.Any, targetIds: js.Array[String]): State = {
      val __obj = js.Dynamic.literal(didDrop = didDrop.asInstanceOf[js.Any], dropResult = dropResult.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidDrop(value: Boolean): Self = StObject.set(x, "didDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropResult(value: js.Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSourcePublicNull: Self = StObject.set(x, "isSourcePublic", null)
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemType(value: Identifier | js.Array[Identifier]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeNull: Self = StObject.set(x, "itemType", null)
      
      @scala.inline
      def setItemTypeVarargs(value: Identifier*): Self = StObject.set(x, "itemType", js.Array(value :_*))
      
      @scala.inline
      def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIdNull: Self = StObject.set(x, "sourceId", null)
      
      @scala.inline
      def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
    }
  }
}
