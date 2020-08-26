package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetPropertiesResponse extends js.Object {
  var paramsType: js.Array[GetPropertiesRequest] = js.native
  var returnType: GetPropertiesResponse = js.native
}

object ReturnTypeGetPropertiesResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetPropertiesRequest], returnType: GetPropertiesResponse): ReturnTypeGetPropertiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPropertiesResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetPropertiesResponseOps[Self <: ReturnTypeGetPropertiesResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetPropertiesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetPropertiesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetPropertiesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

