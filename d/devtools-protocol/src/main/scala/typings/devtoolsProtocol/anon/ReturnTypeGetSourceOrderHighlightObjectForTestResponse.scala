package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetSourceOrderHighlightObjectForTestResponse extends StObject {
  
  var paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest] = js.native
  
  var returnType: GetSourceOrderHighlightObjectForTestResponse = js.native
}
object ReturnTypeGetSourceOrderHighlightObjectForTestResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest],
    returnType: GetSourceOrderHighlightObjectForTestResponse
  ): ReturnTypeGetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSourceOrderHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetSourceOrderHighlightObjectForTestResponseMutableBuilder[Self <: ReturnTypeGetSourceOrderHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetSourceOrderHighlightObjectForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetSourceOrderHighlightObjectForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetSourceOrderHighlightObjectForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
