package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowLayoutShiftRegionsRequest extends StObject {
  
  /**
    * True for showing layout shift regions
    */
  var result: Boolean
}
object SetShowLayoutShiftRegionsRequest {
  
  inline def apply(result: Boolean): SetShowLayoutShiftRegionsRequest = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowLayoutShiftRegionsRequest]
  }
  
  extension [Self <: SetShowLayoutShiftRegionsRequest](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
