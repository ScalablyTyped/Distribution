package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAddScriptToEvaluateOnNewDocumentResponse extends StObject {
  
  var paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest]
  
  var returnType: AddScriptToEvaluateOnNewDocumentResponse
}
object ReturnTypeAddScriptToEvaluateOnNewDocumentResponse {
  
  inline def apply(
    paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest],
    returnType: AddScriptToEvaluateOnNewDocumentResponse
  ): ReturnTypeAddScriptToEvaluateOnNewDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddScriptToEvaluateOnNewDocumentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[AddScriptToEvaluateOnNewDocumentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AddScriptToEvaluateOnNewDocumentRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AddScriptToEvaluateOnNewDocumentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
