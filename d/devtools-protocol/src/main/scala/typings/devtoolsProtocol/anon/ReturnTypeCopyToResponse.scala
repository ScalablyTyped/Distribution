package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.CopyToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.CopyToResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCopyToResponse extends StObject {
  
  var paramsType: js.Array[CopyToRequest]
  
  var returnType: CopyToResponse
}
object ReturnTypeCopyToResponse {
  
  inline def apply(paramsType: js.Array[CopyToRequest], returnType: CopyToResponse): ReturnTypeCopyToResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCopyToResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCopyToResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CopyToRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CopyToRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CopyToResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
