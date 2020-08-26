package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeResolveNodeResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[ResolveNodeRequest]] = js.native
  var returnType: ResolveNodeResponse = js.native
}

object ReturnTypeResolveNodeResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[ResolveNodeRequest]], returnType: ResolveNodeResponse): ReturnTypeResolveNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveNodeResponse]
  }
  @scala.inline
  implicit class ReturnTypeResolveNodeResponseOps[Self <: ReturnTypeResolveNodeResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[ResolveNodeRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[ResolveNodeRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ResolveNodeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

