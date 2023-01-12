package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GetIsolateIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetIsolateIdResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetIsolateIdResponse
}
object ReturnTypeGetIsolateIdResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetIsolateIdResponse): ReturnTypeGetIsolateIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetIsolateIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetIsolateIdResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetIsolateIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
