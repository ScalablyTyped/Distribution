package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPlatformFontsForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetPlatformFontsForNodeRequest]
  
  var returnType: GetPlatformFontsForNodeResponse
}
object ReturnTypeGetPlatformFontsForNodeResponse {
  
  inline def apply(paramsType: js.Array[GetPlatformFontsForNodeRequest], returnType: GetPlatformFontsForNodeResponse): ReturnTypeGetPlatformFontsForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPlatformFontsForNodeResponse]
  }
  
  extension [Self <: ReturnTypeGetPlatformFontsForNodeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetPlatformFontsForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetPlatformFontsForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetPlatformFontsForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
