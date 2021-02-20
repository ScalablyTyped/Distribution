package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetManifestForFrameResponse extends StObject {
  
  var paramsType: js.Array[GetManifestForFrameRequest] = js.native
  
  var returnType: GetManifestForFrameResponse = js.native
}
object ReturnTypeGetManifestForFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetManifestForFrameRequest], returnType: GetManifestForFrameResponse): ReturnTypeGetManifestForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetManifestForFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetManifestForFrameResponseMutableBuilder[Self <: ReturnTypeGetManifestForFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetManifestForFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetManifestForFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetManifestForFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
