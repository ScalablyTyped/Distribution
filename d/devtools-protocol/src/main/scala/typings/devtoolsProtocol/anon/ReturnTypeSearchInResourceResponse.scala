package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SearchInResourceRequest
import typings.devtoolsProtocol.mod.Protocol.Page.SearchInResourceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSearchInResourceResponse extends js.Object {
  var paramsType: js.Array[SearchInResourceRequest] = js.native
  var returnType: SearchInResourceResponse = js.native
}

object ReturnTypeSearchInResourceResponse {
  @scala.inline
  def apply(paramsType: js.Array[SearchInResourceRequest], returnType: SearchInResourceResponse): ReturnTypeSearchInResourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInResourceResponse]
  }
  @scala.inline
  implicit class ReturnTypeSearchInResourceResponseOps[Self <: ReturnTypeSearchInResourceResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SearchInResourceRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SearchInResourceRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SearchInResourceResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

