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
  
  @scala.inline
  def apply(paramsType: js.Array[GetPossibleBreakpointsRequest], returnType: GetPossibleBreakpointsResponse): ReturnTypeGetPossibleBreakpointsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPossibleBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPossibleBreakpointsResponseMutableBuilder[Self <: ReturnTypeGetPossibleBreakpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetPossibleBreakpointsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetPossibleBreakpointsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetPossibleBreakpointsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
