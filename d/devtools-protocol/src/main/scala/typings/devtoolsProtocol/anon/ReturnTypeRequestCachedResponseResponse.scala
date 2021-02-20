package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestCachedResponseResponse extends StObject {
  
  var paramsType: js.Array[RequestCachedResponseRequest] = js.native
  
  var returnType: RequestCachedResponseResponse = js.native
}
object ReturnTypeRequestCachedResponseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestCachedResponseRequest], returnType: RequestCachedResponseResponse): ReturnTypeRequestCachedResponseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestCachedResponseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestCachedResponseResponseMutableBuilder[Self <: ReturnTypeRequestCachedResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestCachedResponseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestCachedResponseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestCachedResponseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
