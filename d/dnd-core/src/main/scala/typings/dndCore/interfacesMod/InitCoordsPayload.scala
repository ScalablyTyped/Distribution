package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitCoordsPayload extends StObject {
  
  var clientOffset: XYCoord | Null = js.native
  
  var sourceClientOffset: XYCoord | Null = js.native
}
object InitCoordsPayload {
  
  @scala.inline
  def apply(): InitCoordsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCoordsPayload]
  }
  
  @scala.inline
  implicit class InitCoordsPayloadMutableBuilder[Self <: InitCoordsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    @scala.inline
    def setSourceClientOffset(value: XYCoord): Self = StObject.set(x, "sourceClientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClientOffsetNull: Self = StObject.set(x, "sourceClientOffset", null)
  }
}
