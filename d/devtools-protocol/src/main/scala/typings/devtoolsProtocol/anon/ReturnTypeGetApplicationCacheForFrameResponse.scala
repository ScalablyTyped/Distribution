package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetApplicationCacheForFrameResponse extends StObject {
  
  var paramsType: js.Array[GetApplicationCacheForFrameRequest]
  
  var returnType: GetApplicationCacheForFrameResponse
}
object ReturnTypeGetApplicationCacheForFrameResponse {
  
  inline def apply(
    paramsType: js.Array[GetApplicationCacheForFrameRequest],
    returnType: GetApplicationCacheForFrameResponse
  ): ReturnTypeGetApplicationCacheForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetApplicationCacheForFrameResponse]
  }
  
  extension [Self <: ReturnTypeGetApplicationCacheForFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetApplicationCacheForFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetApplicationCacheForFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetApplicationCacheForFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
