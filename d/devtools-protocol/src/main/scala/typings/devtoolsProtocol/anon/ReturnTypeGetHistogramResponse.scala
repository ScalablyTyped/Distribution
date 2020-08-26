package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetHistogramResponse extends js.Object {
  var paramsType: js.Array[GetHistogramRequest] = js.native
  var returnType: GetHistogramResponse = js.native
}

object ReturnTypeGetHistogramResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetHistogramRequest], returnType: GetHistogramResponse): ReturnTypeGetHistogramResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHistogramResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetHistogramResponseOps[Self <: ReturnTypeGetHistogramResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetHistogramRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetHistogramRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetHistogramResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

