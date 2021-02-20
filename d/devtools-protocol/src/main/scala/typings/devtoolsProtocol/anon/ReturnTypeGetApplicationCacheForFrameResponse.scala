package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetApplicationCacheForFrameResponse extends StObject {
  
  var paramsType: js.Array[GetApplicationCacheForFrameRequest] = js.native
  
  var returnType: GetApplicationCacheForFrameResponse = js.native
}
object ReturnTypeGetApplicationCacheForFrameResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetApplicationCacheForFrameRequest],
    returnType: GetApplicationCacheForFrameResponse
  ): ReturnTypeGetApplicationCacheForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetApplicationCacheForFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetApplicationCacheForFrameResponseMutableBuilder[Self <: ReturnTypeGetApplicationCacheForFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetApplicationCacheForFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetApplicationCacheForFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetApplicationCacheForFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
