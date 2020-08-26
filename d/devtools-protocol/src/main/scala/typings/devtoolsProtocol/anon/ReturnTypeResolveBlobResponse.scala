package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeResolveBlobResponse extends js.Object {
  var paramsType: js.Array[ResolveBlobRequest] = js.native
  var returnType: ResolveBlobResponse = js.native
}

object ReturnTypeResolveBlobResponse {
  @scala.inline
  def apply(paramsType: js.Array[ResolveBlobRequest], returnType: ResolveBlobResponse): ReturnTypeResolveBlobResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveBlobResponse]
  }
  @scala.inline
  implicit class ReturnTypeResolveBlobResponseOps[Self <: ReturnTypeResolveBlobResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ResolveBlobRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ResolveBlobRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ResolveBlobResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

