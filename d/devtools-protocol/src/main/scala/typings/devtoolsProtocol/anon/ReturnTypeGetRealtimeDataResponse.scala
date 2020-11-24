package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataRequest
import typings.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetRealtimeDataResponse extends js.Object {
  
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
  implicit class ReturnTypeGetRealtimeDataResponseOps[Self <: ReturnTypeGetRealtimeDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: GetRealtimeDataRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetRealtimeDataRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetRealtimeDataResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
