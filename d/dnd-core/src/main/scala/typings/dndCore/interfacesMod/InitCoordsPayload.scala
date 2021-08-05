package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitCoordsPayload extends StObject {
  
  var clientOffset: XYCoord | Null
  
  var sourceClientOffset: XYCoord | Null
}
object InitCoordsPayload {
  
  inline def apply(): InitCoordsPayload = {
    val __obj = js.Dynamic.literal(clientOffset = null, sourceClientOffset = null)
    __obj.asInstanceOf[InitCoordsPayload]
  }
  
  extension [Self <: InitCoordsPayload](x: Self) {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    inline def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    
    inline def setSourceClientOffsetNull: Self = StObject.set(x, "sourceClientOffset", null)
  }
}
