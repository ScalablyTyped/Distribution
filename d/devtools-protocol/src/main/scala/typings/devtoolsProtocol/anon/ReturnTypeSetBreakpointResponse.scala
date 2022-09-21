package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetBreakpointResponse extends StObject {
  
  var paramsType: js.Array[SetBreakpointRequest]
  
  var returnType: SetBreakpointResponse
}
object ReturnTypeSetBreakpointResponse {
  
  inline def apply(paramsType: js.Array[SetBreakpointRequest], returnType: SetBreakpointResponse): ReturnTypeSetBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointResponse]
  }
  
  extension [Self <: ReturnTypeSetBreakpointResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetBreakpointResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
