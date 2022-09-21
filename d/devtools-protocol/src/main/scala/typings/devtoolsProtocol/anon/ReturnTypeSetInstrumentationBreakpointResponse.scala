package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetInstrumentationBreakpointResponse extends StObject {
  
  var paramsType: js.Array[SetInstrumentationBreakpointRequest]
  
  var returnType: SetInstrumentationBreakpointResponse
}
object ReturnTypeSetInstrumentationBreakpointResponse {
  
  inline def apply(
    paramsType: js.Array[SetInstrumentationBreakpointRequest],
    returnType: SetInstrumentationBreakpointResponse
  ): ReturnTypeSetInstrumentationBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetInstrumentationBreakpointResponse]
  }
  
  extension [Self <: ReturnTypeSetInstrumentationBreakpointResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetInstrumentationBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInstrumentationBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetInstrumentationBreakpointResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
