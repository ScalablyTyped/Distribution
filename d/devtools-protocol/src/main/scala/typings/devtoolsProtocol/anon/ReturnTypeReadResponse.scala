package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.ReadRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeReadResponse extends js.Object {
  var paramsType: js.Array[ReadRequest] = js.native
  var returnType: ReadResponse = js.native
}

object ReturnTypeReadResponse {
  @scala.inline
  def apply(paramsType: js.Array[ReadRequest], returnType: ReadResponse): ReturnTypeReadResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeReadResponse]
  }
  @scala.inline
  implicit class ReturnTypeReadResponseOps[Self <: ReturnTypeReadResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ReadRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ReadRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ReadResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

