package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetBreakpointByUrlResponse extends StObject {
  
  var paramsType: js.Array[SetBreakpointByUrlRequest] = js.native
  
  var returnType: SetBreakpointByUrlResponse = js.native
}
object ReturnTypeSetBreakpointByUrlResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetBreakpointByUrlRequest], returnType: SetBreakpointByUrlResponse): ReturnTypeSetBreakpointByUrlResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointByUrlResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetBreakpointByUrlResponseMutableBuilder[Self <: ReturnTypeSetBreakpointByUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetBreakpointByUrlRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetBreakpointByUrlRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetBreakpointByUrlResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
