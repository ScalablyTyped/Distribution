package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestCacheNamesResponse extends StObject {
  
  var paramsType: js.Array[RequestCacheNamesRequest] = js.native
  
  var returnType: RequestCacheNamesResponse = js.native
}
object ReturnTypeRequestCacheNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestCacheNamesRequest], returnType: RequestCacheNamesResponse): ReturnTypeRequestCacheNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestCacheNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestCacheNamesResponseMutableBuilder[Self <: ReturnTypeRequestCacheNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestCacheNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestCacheNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestCacheNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
