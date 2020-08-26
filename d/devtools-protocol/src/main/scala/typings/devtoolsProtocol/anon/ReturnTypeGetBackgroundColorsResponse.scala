package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetBackgroundColorsResponse extends js.Object {
  var paramsType: js.Array[GetBackgroundColorsRequest] = js.native
  var returnType: GetBackgroundColorsResponse = js.native
}

object ReturnTypeGetBackgroundColorsResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetBackgroundColorsRequest], returnType: GetBackgroundColorsResponse): ReturnTypeGetBackgroundColorsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBackgroundColorsResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetBackgroundColorsResponseOps[Self <: ReturnTypeGetBackgroundColorsResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetBackgroundColorsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetBackgroundColorsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetBackgroundColorsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

