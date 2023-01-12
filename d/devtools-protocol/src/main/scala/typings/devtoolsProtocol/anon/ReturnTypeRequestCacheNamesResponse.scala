package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestCacheNamesResponse extends StObject {
  
  var paramsType: js.Array[RequestCacheNamesRequest]
  
  var returnType: RequestCacheNamesResponse
}
object ReturnTypeRequestCacheNamesResponse {
  
  inline def apply(paramsType: js.Array[RequestCacheNamesRequest], returnType: RequestCacheNamesResponse): ReturnTypeRequestCacheNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestCacheNamesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeRequestCacheNamesResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RequestCacheNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestCacheNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RequestCacheNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
