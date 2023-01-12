package typings.dndCore

import typings.dndCore.distInterfacesMod.Identifier
import typings.dndCore.distInterfacesMod.XYCoord
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setHandlerIds(value: js.Array[Identifier]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      inline def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      inline def setHandlerIdsVarargs(value: Identifier*): Self = StObject.set(x, "handlerIds", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOffset] (val x: Self) extends AnyVal {
      
      inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
      
      inline def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropResult extends StObject {
    
    var dropResult: Any
    
    var isSourcePublic: Boolean
    
    var item: Any
    
    var itemType: Identifier | js.Array[Identifier]
    
    var sourceId: String
    
    var targetId: String
    
    var targetIds: js.Array[String]
  }
  object DropResult {
    
    inline def apply(
      dropResult: Any,
      isSourcePublic: Boolean,
      item: Any,
      itemType: Identifier | js.Array[Identifier],
      sourceId: String,
      targetId: String,
      targetIds: js.Array[String]
    ): DropResult = {
      val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any], isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropResult] (val x: Self) extends AnyVal {
      
      inline def setDropResult(value: Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
      
      inline def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemType(value: Identifier | js.Array[Identifier]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeVarargs(value: Identifier*): Self = StObject.set(x, "itemType", js.Array(value*))
      
      inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIds(value: js.Array[String]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
      
      inline def setTargetIdsVarargs(value: String*): Self = StObject.set(x, "targetIds", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerIds] (val x: Self) extends AnyVal {
      
      inline def setHandlerIds(value: js.Array[String]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      inline def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      inline def setHandlerIdsVarargs(value: String*): Self = StObject.set(x, "handlerIds", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shallow] (val x: Self) extends AnyVal {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
