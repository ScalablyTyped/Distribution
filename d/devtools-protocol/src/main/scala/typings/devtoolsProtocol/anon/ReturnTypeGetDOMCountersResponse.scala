package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.GetDOMCountersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetDOMCountersResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetDOMCountersResponse
}
object ReturnTypeGetDOMCountersResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetDOMCountersResponse): ReturnTypeGetDOMCountersResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDOMCountersResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDOMCountersResponseMutableBuilder[Self <: ReturnTypeGetDOMCountersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetDOMCountersResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
