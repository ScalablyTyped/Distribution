package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeTakeResponseBodyAsStreamResponse extends js.Object {
  var paramsType: js.Array[TakeResponseBodyAsStreamRequest] = js.native
  var returnType: TakeResponseBodyAsStreamResponse = js.native
}

object ReturnTypeTakeResponseBodyAsStreamResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[TakeResponseBodyAsStreamRequest],
    returnType: TakeResponseBodyAsStreamResponse
  ): ReturnTypeTakeResponseBodyAsStreamResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeResponseBodyAsStreamResponse]
  }
  @scala.inline
  implicit class ReturnTypeTakeResponseBodyAsStreamResponseOps[Self <: ReturnTypeTakeResponseBodyAsStreamResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: TakeResponseBodyAsStreamRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[TakeResponseBodyAsStreamRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: TakeResponseBodyAsStreamResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

