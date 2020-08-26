package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetUsageAndQuotaResponse extends js.Object {
  var paramsType: js.Array[GetUsageAndQuotaRequest] = js.native
  var returnType: GetUsageAndQuotaResponse = js.native
}

object ReturnTypeGetUsageAndQuotaResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetUsageAndQuotaRequest], returnType: GetUsageAndQuotaResponse): ReturnTypeGetUsageAndQuotaResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetUsageAndQuotaResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetUsageAndQuotaResponseOps[Self <: ReturnTypeGetUsageAndQuotaResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetUsageAndQuotaRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetUsageAndQuotaRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetUsageAndQuotaResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

