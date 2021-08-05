package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetManifestForFrameResponse extends StObject {
  
  var paramsType: js.Array[GetManifestForFrameRequest]
  
  var returnType: GetManifestForFrameResponse
}
object ReturnTypeGetManifestForFrameResponse {
  
  inline def apply(paramsType: js.Array[GetManifestForFrameRequest], returnType: GetManifestForFrameResponse): ReturnTypeGetManifestForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetManifestForFrameResponse]
  }
  
  extension [Self <: ReturnTypeGetManifestForFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetManifestForFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetManifestForFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetManifestForFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
