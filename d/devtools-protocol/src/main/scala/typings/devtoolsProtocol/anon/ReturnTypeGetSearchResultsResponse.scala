package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetSearchResultsResponse extends js.Object {
  var paramsType: js.Array[GetSearchResultsRequest] = js.native
  var returnType: GetSearchResultsResponse = js.native
}

object ReturnTypeGetSearchResultsResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetSearchResultsRequest], returnType: GetSearchResultsResponse): ReturnTypeGetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSearchResultsResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetSearchResultsResponseOps[Self <: ReturnTypeGetSearchResultsResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetSearchResultsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetSearchResultsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetSearchResultsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

