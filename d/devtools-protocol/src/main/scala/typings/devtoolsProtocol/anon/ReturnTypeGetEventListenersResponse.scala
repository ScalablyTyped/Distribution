package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersRequest
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetEventListenersResponse extends StObject {
  
  var paramsType: js.Array[GetEventListenersRequest] = js.native
  
  var returnType: GetEventListenersResponse = js.native
}
object ReturnTypeGetEventListenersResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetEventListenersRequest], returnType: GetEventListenersResponse): ReturnTypeGetEventListenersResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetEventListenersResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetEventListenersResponseMutableBuilder[Self <: ReturnTypeGetEventListenersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetEventListenersRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetEventListenersRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetEventListenersResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
