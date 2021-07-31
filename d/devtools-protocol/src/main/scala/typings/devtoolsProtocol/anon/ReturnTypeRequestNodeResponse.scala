package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.RequestNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.RequestNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestNodeResponse extends StObject {
  
  var paramsType: js.Array[RequestNodeRequest]
  
  var returnType: RequestNodeResponse
}
object ReturnTypeRequestNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestNodeRequest], returnType: RequestNodeResponse): ReturnTypeRequestNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestNodeResponseMutableBuilder[Self <: ReturnTypeRequestNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
