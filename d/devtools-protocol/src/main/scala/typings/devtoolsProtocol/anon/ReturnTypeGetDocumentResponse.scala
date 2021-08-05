package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetDocumentResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetDocumentRequest]]
  
  var returnType: GetDocumentResponse
}
object ReturnTypeGetDocumentResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetDocumentRequest]], returnType: GetDocumentResponse): ReturnTypeGetDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDocumentResponse]
  }
  
  extension [Self <: ReturnTypeGetDocumentResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetDocumentRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetDocumentRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetDocumentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
