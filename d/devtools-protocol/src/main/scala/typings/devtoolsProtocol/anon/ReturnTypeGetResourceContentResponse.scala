package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentRequest
import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetResourceContentResponse extends StObject {
  
  var paramsType: js.Array[GetResourceContentRequest] = js.native
  
  var returnType: GetResourceContentResponse = js.native
}
object ReturnTypeGetResourceContentResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetResourceContentRequest], returnType: GetResourceContentResponse): ReturnTypeGetResourceContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResourceContentResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetResourceContentResponseMutableBuilder[Self <: ReturnTypeGetResourceContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetResourceContentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetResourceContentRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetResourceContentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
