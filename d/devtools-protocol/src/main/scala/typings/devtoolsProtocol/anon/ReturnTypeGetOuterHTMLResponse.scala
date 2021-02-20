package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetOuterHTMLResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]] = js.native
  
  var returnType: GetOuterHTMLResponse = js.native
}
object ReturnTypeGetOuterHTMLResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]], returnType: GetOuterHTMLResponse): ReturnTypeGetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetOuterHTMLResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetOuterHTMLResponseMutableBuilder[Self <: ReturnTypeGetOuterHTMLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetOuterHTMLRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetOuterHTMLRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetOuterHTMLResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
