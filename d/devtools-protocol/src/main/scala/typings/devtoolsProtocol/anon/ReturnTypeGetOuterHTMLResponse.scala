package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetOuterHTMLResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]]
  
  var returnType: GetOuterHTMLResponse
}
object ReturnTypeGetOuterHTMLResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]], returnType: GetOuterHTMLResponse): ReturnTypeGetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetOuterHTMLResponse]
  }
  
  extension [Self <: ReturnTypeGetOuterHTMLResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetOuterHTMLRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetOuterHTMLRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetOuterHTMLResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
