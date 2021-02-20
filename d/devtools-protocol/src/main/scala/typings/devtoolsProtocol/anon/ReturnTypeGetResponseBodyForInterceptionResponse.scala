package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetResponseBodyForInterceptionResponse extends StObject {
  
  var paramsType: js.Array[GetResponseBodyForInterceptionRequest] = js.native
  
  var returnType: GetResponseBodyForInterceptionResponse = js.native
}
object ReturnTypeGetResponseBodyForInterceptionResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetResponseBodyForInterceptionRequest],
    returnType: GetResponseBodyForInterceptionResponse
  ): ReturnTypeGetResponseBodyForInterceptionResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResponseBodyForInterceptionResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetResponseBodyForInterceptionResponseMutableBuilder[Self <: ReturnTypeGetResponseBodyForInterceptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetResponseBodyForInterceptionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetResponseBodyForInterceptionRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetResponseBodyForInterceptionResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
