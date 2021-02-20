package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.GetPlaybackRateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetPlaybackRateResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetPlaybackRateResponse = js.native
}
object ReturnTypeGetPlaybackRateResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetPlaybackRateResponse): ReturnTypeGetPlaybackRateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPlaybackRateResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPlaybackRateResponseMutableBuilder[Self <: ReturnTypeGetPlaybackRateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetPlaybackRateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
