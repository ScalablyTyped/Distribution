package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetAttributesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetAttributesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetAttributesResponse extends StObject {
  
  var paramsType: js.Array[GetAttributesRequest]
  
  var returnType: GetAttributesResponse
}
object ReturnTypeGetAttributesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetAttributesRequest], returnType: GetAttributesResponse): ReturnTypeGetAttributesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAttributesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetAttributesResponseMutableBuilder[Self <: ReturnTypeGetAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetAttributesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetAttributesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetAttributesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
