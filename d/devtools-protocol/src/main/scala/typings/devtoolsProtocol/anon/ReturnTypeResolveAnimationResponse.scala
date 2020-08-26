package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeResolveAnimationResponse extends js.Object {
  var paramsType: js.Array[ResolveAnimationRequest] = js.native
  var returnType: ResolveAnimationResponse = js.native
}

object ReturnTypeResolveAnimationResponse {
  @scala.inline
  def apply(paramsType: js.Array[ResolveAnimationRequest], returnType: ResolveAnimationResponse): ReturnTypeResolveAnimationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveAnimationResponse]
  }
  @scala.inline
  implicit class ReturnTypeResolveAnimationResponseOps[Self <: ReturnTypeResolveAnimationResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ResolveAnimationRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ResolveAnimationRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ResolveAnimationResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

