package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetCookiesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetCookiesResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[GetCookiesRequest]] = js.native
  var returnType: GetCookiesResponse = js.native
}

object ReturnTypeGetCookiesResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetCookiesRequest]], returnType: GetCookiesResponse): ReturnTypeGetCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCookiesResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetCookiesResponseOps[Self <: ReturnTypeGetCookiesResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[GetCookiesRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetCookiesRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetCookiesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

