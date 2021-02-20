package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypePerformSearchResponse extends StObject {
  
  var paramsType: js.Array[PerformSearchRequest] = js.native
  
  var returnType: PerformSearchResponse = js.native
}
object ReturnTypePerformSearchResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[PerformSearchRequest], returnType: PerformSearchResponse): ReturnTypePerformSearchResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePerformSearchResponse]
  }
  
  @scala.inline
  implicit class ReturnTypePerformSearchResponseMutableBuilder[Self <: ReturnTypePerformSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[PerformSearchRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: PerformSearchRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: PerformSearchResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
