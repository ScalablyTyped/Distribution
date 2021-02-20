package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetFramesWithManifestsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetFramesWithManifestsResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetFramesWithManifestsResponse = js.native
}
object ReturnTypeGetFramesWithManifestsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetFramesWithManifestsResponse): ReturnTypeGetFramesWithManifestsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFramesWithManifestsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetFramesWithManifestsResponseMutableBuilder[Self <: ReturnTypeGetFramesWithManifestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetFramesWithManifestsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
