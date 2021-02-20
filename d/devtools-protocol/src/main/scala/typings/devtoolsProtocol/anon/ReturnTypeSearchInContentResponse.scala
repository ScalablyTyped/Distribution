package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSearchInContentResponse extends StObject {
  
  var paramsType: js.Array[SearchInContentRequest] = js.native
  
  var returnType: SearchInContentResponse = js.native
}
object ReturnTypeSearchInContentResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SearchInContentRequest], returnType: SearchInContentResponse): ReturnTypeSearchInContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInContentResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSearchInContentResponseMutableBuilder[Self <: ReturnTypeSearchInContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SearchInContentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SearchInContentRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SearchInContentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
