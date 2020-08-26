package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetOuterHTMLResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]] = js.native
  var returnType: GetOuterHTMLResponse = js.native
}

object ReturnTypeGetOuterHTMLResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetOuterHTMLRequest]], returnType: GetOuterHTMLResponse): ReturnTypeGetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetOuterHTMLResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetOuterHTMLResponseOps[Self <: ReturnTypeGetOuterHTMLResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[GetOuterHTMLRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetOuterHTMLRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetOuterHTMLResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

