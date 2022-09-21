package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetAppManifestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetAppManifestResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetAppManifestResponse
}
object ReturnTypeGetAppManifestResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetAppManifestResponse): ReturnTypeGetAppManifestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAppManifestResponse]
  }
  
  extension [Self <: ReturnTypeGetAppManifestResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetAppManifestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
