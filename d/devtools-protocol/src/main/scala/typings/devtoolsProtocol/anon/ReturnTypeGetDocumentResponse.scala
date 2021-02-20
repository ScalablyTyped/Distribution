package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetDocumentResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetDocumentRequest]] = js.native
  
  var returnType: GetDocumentResponse = js.native
}
object ReturnTypeGetDocumentResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetDocumentRequest]], returnType: GetDocumentResponse): ReturnTypeGetDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDocumentResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDocumentResponseMutableBuilder[Self <: ReturnTypeGetDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetDocumentRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetDocumentRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetDocumentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
