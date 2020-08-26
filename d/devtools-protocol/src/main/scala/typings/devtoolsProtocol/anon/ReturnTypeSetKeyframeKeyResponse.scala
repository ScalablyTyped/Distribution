package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSetKeyframeKeyResponse extends js.Object {
  var paramsType: js.Array[SetKeyframeKeyRequest] = js.native
  var returnType: SetKeyframeKeyResponse = js.native
}

object ReturnTypeSetKeyframeKeyResponse {
  @scala.inline
  def apply(paramsType: js.Array[SetKeyframeKeyRequest], returnType: SetKeyframeKeyResponse): ReturnTypeSetKeyframeKeyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetKeyframeKeyResponse]
  }
  @scala.inline
  implicit class ReturnTypeSetKeyframeKeyResponseOps[Self <: ReturnTypeSetKeyframeKeyResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SetKeyframeKeyRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SetKeyframeKeyRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SetKeyframeKeyResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

