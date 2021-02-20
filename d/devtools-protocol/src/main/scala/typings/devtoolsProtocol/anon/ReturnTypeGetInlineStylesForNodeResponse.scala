package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetInlineStylesForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetInlineStylesForNodeRequest] = js.native
  
  var returnType: GetInlineStylesForNodeResponse = js.native
}
object ReturnTypeGetInlineStylesForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetInlineStylesForNodeRequest], returnType: GetInlineStylesForNodeResponse): ReturnTypeGetInlineStylesForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetInlineStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetInlineStylesForNodeResponseMutableBuilder[Self <: ReturnTypeGetInlineStylesForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetInlineStylesForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetInlineStylesForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetInlineStylesForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
