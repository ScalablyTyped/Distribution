package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetNodeForLocationResponse extends js.Object {
  var paramsType: js.Array[GetNodeForLocationRequest] = js.native
  var returnType: GetNodeForLocationResponse = js.native
}

object ReturnTypeGetNodeForLocationResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetNodeForLocationRequest], returnType: GetNodeForLocationResponse): ReturnTypeGetNodeForLocationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodeForLocationResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetNodeForLocationResponseOps[Self <: ReturnTypeGetNodeForLocationResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetNodeForLocationRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetNodeForLocationRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetNodeForLocationResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

