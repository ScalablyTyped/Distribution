package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataRequest
import typings.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetRealtimeDataResponse extends StObject {
  
  var paramsType: js.Array[GetRealtimeDataRequest] = js.native
  
  var returnType: GetRealtimeDataResponse = js.native
}
object ReturnTypeGetRealtimeDataResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetRealtimeDataRequest], returnType: GetRealtimeDataResponse): ReturnTypeGetRealtimeDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRealtimeDataResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetRealtimeDataResponseMutableBuilder[Self <: ReturnTypeGetRealtimeDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetRealtimeDataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetRealtimeDataRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetRealtimeDataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
