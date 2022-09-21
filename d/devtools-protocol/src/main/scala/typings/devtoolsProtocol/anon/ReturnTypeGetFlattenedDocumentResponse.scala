package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetFlattenedDocumentResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetFlattenedDocumentRequest]]
  
  var returnType: GetFlattenedDocumentResponse
}
object ReturnTypeGetFlattenedDocumentResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[GetFlattenedDocumentRequest]],
    returnType: GetFlattenedDocumentResponse
  ): ReturnTypeGetFlattenedDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFlattenedDocumentResponse]
  }
  
  extension [Self <: ReturnTypeGetFlattenedDocumentResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetFlattenedDocumentRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetFlattenedDocumentRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetFlattenedDocumentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
