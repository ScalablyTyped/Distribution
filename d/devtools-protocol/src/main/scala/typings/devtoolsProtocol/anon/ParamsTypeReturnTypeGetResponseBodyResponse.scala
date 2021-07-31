package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsTypeReturnTypeGetResponseBodyResponse extends StObject {
  
  var paramsType: js.Array[GetResponseBodyRequest]
  
  var returnType: GetResponseBodyResponse
}
object ParamsTypeReturnTypeGetResponseBodyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetResponseBodyRequest], returnType: GetResponseBodyResponse): ParamsTypeReturnTypeGetResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeGetResponseBodyResponse]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeGetResponseBodyResponseMutableBuilder[Self <: ParamsTypeReturnTypeGetResponseBodyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetResponseBodyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetResponseBodyRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetResponseBodyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
