package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetCookiesResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetCookiesRequest]]
  
  var returnType: GetCookiesResponse
}
object ReturnTypeGetCookiesResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetCookiesRequest]], returnType: GetCookiesResponse): ReturnTypeGetCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCookiesResponse]
  }
  
  extension [Self <: ReturnTypeGetCookiesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetCookiesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetCookiesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
