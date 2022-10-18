package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginDragPayload extends StObject {
  
  var clientOffset: XYCoord | Null
  
  var isSourcePublic: Boolean
  
  var item: Any
  
  var itemType: Identifier
  
  var sourceClientOffset: XYCoord | Null
  
  var sourceId: Identifier
}
object BeginDragPayload {
  
  inline def apply(isSourcePublic: Boolean, item: Any, itemType: Identifier, sourceId: Identifier): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], clientOffset = null, sourceClientOffset = null)
    __obj.asInstanceOf[BeginDragPayload]
  }
  
  extension [Self <: BeginDragPayload](x: Self) {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    inline def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemType(value: Identifier): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    
    inline def setSourceClientOffsetNull: Self = StObject.set(x, "sourceClientOffset", null)
    
    inline def setSourceId(value: Identifier): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
