package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetMatchedStylesForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetMatchedStylesForNodeRequest] = js.native
  
  var returnType: GetMatchedStylesForNodeResponse = js.native
}
object ReturnTypeGetMatchedStylesForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetMatchedStylesForNodeRequest], returnType: GetMatchedStylesForNodeResponse): ReturnTypeGetMatchedStylesForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetMatchedStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetMatchedStylesForNodeResponseMutableBuilder[Self <: ReturnTypeGetMatchedStylesForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetMatchedStylesForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetMatchedStylesForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetMatchedStylesForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
