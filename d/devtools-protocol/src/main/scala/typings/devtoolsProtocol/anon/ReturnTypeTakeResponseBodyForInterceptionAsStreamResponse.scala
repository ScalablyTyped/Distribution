package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamRequest
import typings.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse extends js.Object {
  
  var paramsType: js.Array[TakeResponseBodyForInterceptionAsStreamRequest] = js.native
  
  var returnType: TakeResponseBodyForInterceptionAsStreamResponse = js.native
}
object ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[TakeResponseBodyForInterceptionAsStreamRequest],
    returnType: TakeResponseBodyForInterceptionAsStreamResponse
  ): ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeTakeResponseBodyForInterceptionAsStreamResponseOps[Self <: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: TakeResponseBodyForInterceptionAsStreamRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[TakeResponseBodyForInterceptionAsStreamRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: TakeResponseBodyForInterceptionAsStreamResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
