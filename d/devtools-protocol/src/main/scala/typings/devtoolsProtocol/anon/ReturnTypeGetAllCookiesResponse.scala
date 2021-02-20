package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetAllCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetAllCookiesResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetAllCookiesResponse = js.native
}
object ReturnTypeGetAllCookiesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetAllCookiesResponse): ReturnTypeGetAllCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAllCookiesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetAllCookiesResponseMutableBuilder[Self <: ReturnTypeGetAllCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetAllCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
