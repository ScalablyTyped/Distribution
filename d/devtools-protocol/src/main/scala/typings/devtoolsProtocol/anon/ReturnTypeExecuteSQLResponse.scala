package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLRequest
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeExecuteSQLResponse extends js.Object {
  var paramsType: js.Array[ExecuteSQLRequest] = js.native
  var returnType: ExecuteSQLResponse = js.native
}

object ReturnTypeExecuteSQLResponse {
  @scala.inline
  def apply(paramsType: js.Array[ExecuteSQLRequest], returnType: ExecuteSQLResponse): ReturnTypeExecuteSQLResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeExecuteSQLResponse]
  }
  @scala.inline
  implicit class ReturnTypeExecuteSQLResponseOps[Self <: ReturnTypeExecuteSQLResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ExecuteSQLRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ExecuteSQLRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ExecuteSQLResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

