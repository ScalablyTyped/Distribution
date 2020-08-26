package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetCurrentTimeResponse extends js.Object {
  var paramsType: js.Array[GetCurrentTimeRequest] = js.native
  var returnType: GetCurrentTimeResponse = js.native
}

object ReturnTypeGetCurrentTimeResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetCurrentTimeRequest], returnType: GetCurrentTimeResponse): ReturnTypeGetCurrentTimeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCurrentTimeResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetCurrentTimeResponseOps[Self <: ReturnTypeGetCurrentTimeResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetCurrentTimeRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetCurrentTimeRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetCurrentTimeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

