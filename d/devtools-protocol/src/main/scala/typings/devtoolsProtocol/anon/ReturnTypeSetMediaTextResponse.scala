package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSetMediaTextResponse extends js.Object {
  var paramsType: js.Array[SetMediaTextRequest] = js.native
  var returnType: SetMediaTextResponse = js.native
}

object ReturnTypeSetMediaTextResponse {
  @scala.inline
  def apply(paramsType: js.Array[SetMediaTextRequest], returnType: SetMediaTextResponse): ReturnTypeSetMediaTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetMediaTextResponse]
  }
  @scala.inline
  implicit class ReturnTypeSetMediaTextResponseOps[Self <: ReturnTypeSetMediaTextResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SetMediaTextRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SetMediaTextRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SetMediaTextResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

