package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSearchInResponseBodyResponse extends StObject {
  
  var paramsType: js.Array[SearchInResponseBodyRequest] = js.native
  
  var returnType: SearchInResponseBodyResponse = js.native
}
object ReturnTypeSearchInResponseBodyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SearchInResponseBodyRequest], returnType: SearchInResponseBodyResponse): ReturnTypeSearchInResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInResponseBodyResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSearchInResponseBodyResponseMutableBuilder[Self <: ReturnTypeSearchInResponseBodyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SearchInResponseBodyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SearchInResponseBodyRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SearchInResponseBodyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
