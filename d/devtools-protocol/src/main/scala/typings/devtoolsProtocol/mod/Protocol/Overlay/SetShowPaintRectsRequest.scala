package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowPaintRectsRequest extends StObject {
  
  /**
    * True for showing paint rectangles
    */
  var result: Boolean
}
object SetShowPaintRectsRequest {
  
  inline def apply(result: Boolean): SetShowPaintRectsRequest = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowPaintRectsRequest]
  }
  
  extension [Self <: SetShowPaintRectsRequest](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
