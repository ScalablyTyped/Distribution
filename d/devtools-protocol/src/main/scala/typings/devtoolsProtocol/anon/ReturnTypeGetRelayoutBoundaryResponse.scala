package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetRelayoutBoundaryResponse extends StObject {
  
  var paramsType: js.Array[GetRelayoutBoundaryRequest] = js.native
  
  var returnType: GetRelayoutBoundaryResponse = js.native
}
object ReturnTypeGetRelayoutBoundaryResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetRelayoutBoundaryRequest], returnType: GetRelayoutBoundaryResponse): ReturnTypeGetRelayoutBoundaryResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRelayoutBoundaryResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetRelayoutBoundaryResponseMutableBuilder[Self <: ReturnTypeGetRelayoutBoundaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetRelayoutBoundaryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetRelayoutBoundaryRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetRelayoutBoundaryResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
