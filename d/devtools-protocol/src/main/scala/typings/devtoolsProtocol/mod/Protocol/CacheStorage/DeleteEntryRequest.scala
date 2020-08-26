package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEntryRequest extends js.Object {
  /**
    * Id of cache where the entry will be deleted.
    */
  var cacheId: CacheId = js.native
  /**
    * URL spec of the request.
    */
  var request: String = js.native
}

object DeleteEntryRequest {
  @scala.inline
  def apply(cacheId: CacheId, request: String): DeleteEntryRequest = {
    val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntryRequest]
  }
  @scala.inline
  implicit class DeleteEntryRequestOps[Self <: DeleteEntryRequest] (val x: Self) extends AnyVal {
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
    def setCacheId(value: CacheId): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

