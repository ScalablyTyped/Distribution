package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetMediaTextResponse extends StObject {
  
  var paramsType: js.Array[SetMediaTextRequest]
  
  var returnType: SetMediaTextResponse
}
object ReturnTypeSetMediaTextResponse {
  
  inline def apply(paramsType: js.Array[SetMediaTextRequest], returnType: SetMediaTextResponse): ReturnTypeSetMediaTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetMediaTextResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeSetMediaTextResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetMediaTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetMediaTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetMediaTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
