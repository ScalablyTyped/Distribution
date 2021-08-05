package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetResponseBodyForInterceptionResponse extends StObject {
  
  var paramsType: js.Array[GetResponseBodyForInterceptionRequest]
  
  var returnType: GetResponseBodyForInterceptionResponse
}
object ReturnTypeGetResponseBodyForInterceptionResponse {
  
  inline def apply(
    paramsType: js.Array[GetResponseBodyForInterceptionRequest],
    returnType: GetResponseBodyForInterceptionResponse
  ): ReturnTypeGetResponseBodyForInterceptionResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResponseBodyForInterceptionResponse]
  }
  
  extension [Self <: ReturnTypeGetResponseBodyForInterceptionResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetResponseBodyForInterceptionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetResponseBodyForInterceptionRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetResponseBodyForInterceptionResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
