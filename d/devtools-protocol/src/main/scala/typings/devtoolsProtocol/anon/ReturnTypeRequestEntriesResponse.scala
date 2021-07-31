package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestEntriesResponse extends StObject {
  
  var paramsType: js.Array[RequestEntriesRequest]
  
  var returnType: RequestEntriesResponse
}
object ReturnTypeRequestEntriesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestEntriesRequest], returnType: RequestEntriesResponse): ReturnTypeRequestEntriesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestEntriesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestEntriesResponseMutableBuilder[Self <: ReturnTypeRequestEntriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestEntriesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
