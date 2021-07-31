package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetComputedStyleForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetComputedStyleForNodeRequest]
  
  var returnType: GetComputedStyleForNodeResponse
}
object ReturnTypeGetComputedStyleForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetComputedStyleForNodeRequest], returnType: GetComputedStyleForNodeResponse): ReturnTypeGetComputedStyleForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetComputedStyleForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetComputedStyleForNodeResponseMutableBuilder[Self <: ReturnTypeGetComputedStyleForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetComputedStyleForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetComputedStyleForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetComputedStyleForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
