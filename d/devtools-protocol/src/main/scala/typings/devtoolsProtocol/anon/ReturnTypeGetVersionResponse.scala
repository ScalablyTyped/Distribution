package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetVersionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetVersionResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetVersionResponse
}
object ReturnTypeGetVersionResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetVersionResponse): ReturnTypeGetVersionResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetVersionResponse]
  }
  
  extension [Self <: ReturnTypeGetVersionResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetVersionResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
