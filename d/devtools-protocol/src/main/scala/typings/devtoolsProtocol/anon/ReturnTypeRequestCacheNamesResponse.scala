package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeRequestCacheNamesResponse extends js.Object {
  var paramsType: js.Array[RequestCacheNamesRequest] = js.native
  var returnType: RequestCacheNamesResponse = js.native
}

object ReturnTypeRequestCacheNamesResponse {
  @scala.inline
  def apply(paramsType: js.Array[RequestCacheNamesRequest], returnType: RequestCacheNamesResponse): ReturnTypeRequestCacheNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestCacheNamesResponse]
  }
  @scala.inline
  implicit class ReturnTypeRequestCacheNamesResponseOps[Self <: ReturnTypeRequestCacheNamesResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: RequestCacheNamesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[RequestCacheNamesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: RequestCacheNamesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

