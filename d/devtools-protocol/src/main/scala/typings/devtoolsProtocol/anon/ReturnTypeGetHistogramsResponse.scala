package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetHistogramsResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[GetHistogramsRequest]] = js.native
  var returnType: GetHistogramsResponse = js.native
}

object ReturnTypeGetHistogramsResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetHistogramsRequest]], returnType: GetHistogramsResponse): ReturnTypeGetHistogramsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHistogramsResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetHistogramsResponseOps[Self <: ReturnTypeGetHistogramsResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[GetHistogramsRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetHistogramsRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetHistogramsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

