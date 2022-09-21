package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.GetBrowserSamplingProfileResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetBrowserSamplingProfileResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetBrowserSamplingProfileResponse
}
object ReturnTypeGetBrowserSamplingProfileResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetBrowserSamplingProfileResponse): ReturnTypeGetBrowserSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBrowserSamplingProfileResponse]
  }
  
  extension [Self <: ReturnTypeGetBrowserSamplingProfileResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetBrowserSamplingProfileResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
