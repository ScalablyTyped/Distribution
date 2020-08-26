package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsTypeReturnTypeGetResponseBodyResponse extends js.Object {
  var paramsType: js.Array[GetResponseBodyRequest] = js.native
  var returnType: GetResponseBodyResponse = js.native
}

object ParamsTypeReturnTypeGetResponseBodyResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetResponseBodyRequest], returnType: GetResponseBodyResponse): ParamsTypeReturnTypeGetResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeGetResponseBodyResponse]
  }
  @scala.inline
  implicit class ParamsTypeReturnTypeGetResponseBodyResponseOps[Self <: ParamsTypeReturnTypeGetResponseBodyResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetResponseBodyRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetResponseBodyRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetResponseBodyResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

