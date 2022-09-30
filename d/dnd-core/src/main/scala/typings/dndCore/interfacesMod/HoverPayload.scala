package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverPayload extends StObject {
  
  var clientOffset: XYCoord | Null
  
  var targetIds: js.Array[Identifier]
}
object HoverPayload {
  
  inline def apply(targetIds: js.Array[Identifier]): HoverPayload = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any], clientOffset = null)
    __obj.asInstanceOf[HoverPayload]
  }
  
  extension [Self <: HoverPayload](x: Self) {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    inline def setTargetIds(value: js.Array[Identifier]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsVarargs(value: Identifier*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
