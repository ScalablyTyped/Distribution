package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetBrowserCommandLineResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetBrowserCommandLineResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetBrowserCommandLineResponse
}
object ReturnTypeGetBrowserCommandLineResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetBrowserCommandLineResponse): ReturnTypeGetBrowserCommandLineResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBrowserCommandLineResponse]
  }
  
  extension [Self <: ReturnTypeGetBrowserCommandLineResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetBrowserCommandLineResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
