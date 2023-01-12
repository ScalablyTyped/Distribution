package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetSupportsTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetSupportsTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetSupportsTextResponse extends StObject {
  
  var paramsType: js.Array[SetSupportsTextRequest]
  
  var returnType: SetSupportsTextResponse
}
object ReturnTypeSetSupportsTextResponse {
  
  inline def apply(paramsType: js.Array[SetSupportsTextRequest], returnType: SetSupportsTextResponse): ReturnTypeSetSupportsTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetSupportsTextResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeSetSupportsTextResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetSupportsTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetSupportsTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetSupportsTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
