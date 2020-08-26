package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetDatabaseTableNamesResponse extends js.Object {
  var paramsType: js.Array[GetDatabaseTableNamesRequest] = js.native
  var returnType: GetDatabaseTableNamesResponse = js.native
}

object ReturnTypeGetDatabaseTableNamesResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetDatabaseTableNamesRequest], returnType: GetDatabaseTableNamesResponse): ReturnTypeGetDatabaseTableNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDatabaseTableNamesResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetDatabaseTableNamesResponseOps[Self <: ReturnTypeGetDatabaseTableNamesResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetDatabaseTableNamesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetDatabaseTableNamesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetDatabaseTableNamesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

