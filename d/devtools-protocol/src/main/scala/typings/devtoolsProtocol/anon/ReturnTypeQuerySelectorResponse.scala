package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQuerySelectorResponse extends StObject {
  
  var paramsType: js.Array[QuerySelectorRequest] = js.native
  
  var returnType: QuerySelectorResponse = js.native
}
object ReturnTypeQuerySelectorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[QuerySelectorRequest], returnType: QuerySelectorResponse): ReturnTypeQuerySelectorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQuerySelectorResponseMutableBuilder[Self <: ReturnTypeQuerySelectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[QuerySelectorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: QuerySelectorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: QuerySelectorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
