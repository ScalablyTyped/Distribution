package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMaxCallStackSizeToCaptureRequest extends StObject {
  
  var size: integer
}
object SetMaxCallStackSizeToCaptureRequest {
  
  inline def apply(size: integer): SetMaxCallStackSizeToCaptureRequest = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMaxCallStackSizeToCaptureRequest]
  }
  
  extension [Self <: SetMaxCallStackSizeToCaptureRequest](x: Self) {
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
