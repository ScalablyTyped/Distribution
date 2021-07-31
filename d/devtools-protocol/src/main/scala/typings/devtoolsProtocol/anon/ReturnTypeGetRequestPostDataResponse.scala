package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetRequestPostDataResponse extends StObject {
  
  var paramsType: js.Array[GetRequestPostDataRequest]
  
  var returnType: GetRequestPostDataResponse
}
object ReturnTypeGetRequestPostDataResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetRequestPostDataRequest], returnType: GetRequestPostDataResponse): ReturnTypeGetRequestPostDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRequestPostDataResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetRequestPostDataResponseMutableBuilder[Self <: ReturnTypeGetRequestPostDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetRequestPostDataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetRequestPostDataRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetRequestPostDataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
