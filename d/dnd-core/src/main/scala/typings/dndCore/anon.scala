package typings.dndCore

import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[Identifier]] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlerIds(value: js.Array[Identifier]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      @scala.inline
      def setHandlerIdsVarargs(value: Identifier*): Self = StObject.set(x, "handlerIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var shallow: js.UndefOr[Boolean] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  @js.native
  trait ClientOffset extends StObject {
    
    var clientOffset: XYCoord = js.native
    
    var sourceClientOffset: XYCoord = js.native
  }
  object ClientOffset {
    
    @scala.inline
    def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): ClientOffset = {
      val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOffset]
    }
    
    @scala.inline
    implicit class ClientOffsetMutableBuilder[Self <: ClientOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropResult extends StObject {
    
    var dropResult: js.Any = js.native
    
    var isSourcePublic: Boolean = js.native
    
    var item: js.Any = js.native
    
    var itemType: Identifier | js.Array[Identifier] = js.native
    
    var sourceId: String = js.native
    
    var targetId: String = js.native
    
    var targetIds: js.Array[String] = js.native
  }
  object DropResult {
    
    @scala.inline
    def apply(
      dropResult: js.Any,
      isSourcePublic: Boolean,
      item: js.Any,
      itemType: Identifier | js.Array[Identifier],
      sourceId: String,
      targetId: String,
      targetIds: js.Array[String]
    ): DropResult = {
      val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any], isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropResult]
    }
    
    @scala.inline
    implicit class DropResultMutableBuilder[Self <: DropResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropResult(value: js.Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemType(value: Identifier | js.Array[Identifier]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeVarargs(value: Identifier*): Self = StObject.set(x, "itemType", js.Array(value :_*))
      
      @scala.inline
      def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait HandlerIds extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[String]] = js.native
  }
  object HandlerIds {
    
    @scala.inline
    def apply(): HandlerIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerIds]
    }
    
    @scala.inline
    implicit class HandlerIdsMutableBuilder[Self <: HandlerIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlerIds(value: js.Array[String]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      @scala.inline
      def setHandlerIdsVarargs(value: String*): Self = StObject.set(x, "handlerIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Shallow extends StObject {
    
    var shallow: Boolean = js.native
  }
  object Shallow {
    
    @scala.inline
    def apply(shallow: Boolean): Shallow = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shallow]
    }
    
    @scala.inline
    implicit class ShallowMutableBuilder[Self <: Shallow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
