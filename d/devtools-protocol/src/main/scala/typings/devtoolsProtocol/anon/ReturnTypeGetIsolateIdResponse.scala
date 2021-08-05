package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GetIsolateIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetIsolateIdResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetIsolateIdResponse
}
object ReturnTypeGetIsolateIdResponse {
  
  inline def apply(paramsType: js.Array[js.Any], returnType: GetIsolateIdResponse): ReturnTypeGetIsolateIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetIsolateIdResponse]
  }
  
  extension [Self <: ReturnTypeGetIsolateIdResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetIsolateIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
