package typings.dndCore

import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setHandlerIds(value: js.Array[Identifier]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      inline def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      inline def setHandlerIdsVarargs(value: Identifier*): Self = StObject.set(x, "handlerIds", js.Array(value :_*))
    }
  }
  
  trait `1` extends StObject {
    
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  trait ClientOffset extends StObject {
    
    var clientOffset: XYCoord
    
    var sourceClientOffset: XYCoord
  }
  object ClientOffset {
    
    inline def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): ClientOffset = {
      val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOffset]
    }
    
    extension [Self <: ClientOffset](x: Self) {
      
      inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
      
      inline def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropResult extends StObject {
    
    var dropResult: js.Any
    
    var isSourcePublic: Boolean
    
    var item: js.Any
    
    var itemType: Identifier | js.Array[Identifier]
    
    var sourceId: String
    
    var targetId: String
    
    var targetIds: js.Array[String]
  }
  object DropResult {
    
    inline def apply(
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
    
    extension [Self <: DropResult](x: Self) {
      
      inline def setDropResult(value: js.Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
      
      inline def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
      
      inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemType(value: Identifier | js.Array[Identifier]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeVarargs(value: Identifier*): Self = StObject.set(x, "itemType", js.Array(value :_*))
      
      inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      inline def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
    }
  }
  
  trait HandlerIds extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object HandlerIds {
    
    inline def apply(): HandlerIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerIds]
    }
    
    extension [Self <: HandlerIds](x: Self) {
      
      inline def setHandlerIds(value: js.Array[String]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      inline def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      inline def setHandlerIdsVarargs(value: String*): Self = StObject.set(x, "handlerIds", js.Array(value :_*))
    }
  }
  
  trait Shallow extends StObject {
    
    var shallow: Boolean
  }
  object Shallow {
    
    inline def apply(shallow: Boolean): Shallow = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shallow]
    }
    
    extension [Self <: Shallow](x: Self) {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
