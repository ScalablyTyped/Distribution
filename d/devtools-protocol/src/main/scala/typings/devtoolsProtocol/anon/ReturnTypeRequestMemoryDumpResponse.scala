package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpRequest
import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeRequestMemoryDumpResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]] = js.native
  var returnType: RequestMemoryDumpResponse = js.native
}

object ReturnTypeRequestMemoryDumpResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]], returnType: RequestMemoryDumpResponse): ReturnTypeRequestMemoryDumpResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestMemoryDumpResponse]
  }
  @scala.inline
  implicit class ReturnTypeRequestMemoryDumpResponseOps[Self <: ReturnTypeRequestMemoryDumpResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[RequestMemoryDumpRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[RequestMemoryDumpRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: RequestMemoryDumpResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

