package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetInlineStylesForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetInlineStylesForNodeRequest]
  
  var returnType: GetInlineStylesForNodeResponse
}
object ReturnTypeGetInlineStylesForNodeResponse {
  
  inline def apply(paramsType: js.Array[GetInlineStylesForNodeRequest], returnType: GetInlineStylesForNodeResponse): ReturnTypeGetInlineStylesForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetInlineStylesForNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetInlineStylesForNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetInlineStylesForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetInlineStylesForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetInlineStylesForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
