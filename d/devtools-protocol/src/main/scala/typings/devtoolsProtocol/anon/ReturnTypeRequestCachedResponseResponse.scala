package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestCachedResponseResponse extends StObject {
  
  var paramsType: js.Array[RequestCachedResponseRequest]
  
  var returnType: RequestCachedResponseResponse
}
object ReturnTypeRequestCachedResponseResponse {
  
  inline def apply(paramsType: js.Array[RequestCachedResponseRequest], returnType: RequestCachedResponseResponse): ReturnTypeRequestCachedResponseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestCachedResponseResponse]
  }
  
  extension [Self <: ReturnTypeRequestCachedResponseResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[RequestCachedResponseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestCachedResponseRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RequestCachedResponseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
