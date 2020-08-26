package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSearchInResponseBodyResponse extends js.Object {
  var paramsType: js.Array[SearchInResponseBodyRequest] = js.native
  var returnType: SearchInResponseBodyResponse = js.native
}

object ReturnTypeSearchInResponseBodyResponse {
  @scala.inline
  def apply(paramsType: js.Array[SearchInResponseBodyRequest], returnType: SearchInResponseBodyResponse): ReturnTypeSearchInResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInResponseBodyResponse]
  }
  @scala.inline
  implicit class ReturnTypeSearchInResponseBodyResponseOps[Self <: ReturnTypeSearchInResponseBodyResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SearchInResponseBodyRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SearchInResponseBodyRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SearchInResponseBodyResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

