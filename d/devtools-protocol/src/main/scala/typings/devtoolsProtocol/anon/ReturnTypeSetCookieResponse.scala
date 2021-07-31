package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieRequest
import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetCookieResponse extends StObject {
  
  var paramsType: js.Array[SetCookieRequest]
  
  var returnType: SetCookieResponse
}
object ReturnTypeSetCookieResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetCookieRequest], returnType: SetCookieResponse): ReturnTypeSetCookieResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetCookieResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetCookieResponseMutableBuilder[Self <: ReturnTypeSetCookieResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetCookieRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetCookieRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetCookieResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
