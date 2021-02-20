package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginDragPayload extends StObject {
  
  var clientOffset: XYCoord | Null = js.native
  
  var isSourcePublic: Boolean = js.native
  
  var item: js.Any = js.native
  
  var itemType: Identifier = js.native
  
  var sourceClientOffset: XYCoord | Null = js.native
  
  var sourceId: Identifier = js.native
}
object BeginDragPayload {
  
  @scala.inline
  def apply(isSourcePublic: Boolean, item: js.Any, itemType: Identifier, sourceId: Identifier): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDragPayload]
  }
  
  @scala.inline
  implicit class BeginDragPayloadMutableBuilder[Self <: BeginDragPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    @scala.inline
    def setIsSourcePublic(value: Boolean): Self = StObject.set(x, "isSourcePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemType(value: Identifier): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClientOffsetNull: Self = StObject.set(x, "sourceClientOffset", null)
    
    @scala.inline
    def setSourceId(value: Identifier): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
