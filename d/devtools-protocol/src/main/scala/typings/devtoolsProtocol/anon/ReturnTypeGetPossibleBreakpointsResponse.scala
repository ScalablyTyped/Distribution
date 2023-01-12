package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPossibleBreakpointsResponse extends StObject {
  
  var paramsType: js.Array[GetPossibleBreakpointsRequest]
  
  var returnType: GetPossibleBreakpointsResponse
}
object ReturnTypeGetPossibleBreakpointsResponse {
  
  inline def apply(paramsType: js.Array[GetPossibleBreakpointsRequest], returnType: GetPossibleBreakpointsResponse): ReturnTypeGetPossibleBreakpointsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPossibleBreakpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetPossibleBreakpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetPossibleBreakpointsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetPossibleBreakpointsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetPossibleBreakpointsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
