package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeQueryObjectsResponse extends js.Object {
  var paramsType: js.Array[QueryObjectsRequest] = js.native
  var returnType: QueryObjectsResponse = js.native
}

object ReturnTypeQueryObjectsResponse {
  @scala.inline
  def apply(paramsType: js.Array[QueryObjectsRequest], returnType: QueryObjectsResponse): ReturnTypeQueryObjectsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQueryObjectsResponse]
  }
  @scala.inline
  implicit class ReturnTypeQueryObjectsResponseOps[Self <: ReturnTypeQueryObjectsResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: QueryObjectsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[QueryObjectsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: QueryObjectsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

