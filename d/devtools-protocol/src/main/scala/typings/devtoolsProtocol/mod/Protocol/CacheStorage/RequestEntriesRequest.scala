package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEntriesRequest extends js.Object {
  /**
    * ID of cache to get entries from.
    */
  var cacheId: CacheId = js.native
  /**
    * Number of records to fetch.
    */
  var pageSize: js.UndefOr[integer] = js.native
  /**
    * If present, only return the entries containing this substring in the path
    */
  var pathFilter: js.UndefOr[String] = js.native
  /**
    * Number of records to skip.
    */
  var skipCount: js.UndefOr[integer] = js.native
}

object RequestEntriesRequest {
  @scala.inline
  def apply(cacheId: CacheId): RequestEntriesRequest = {
    val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEntriesRequest]
  }
  @scala.inline
  implicit class RequestEntriesRequestOps[Self <: RequestEntriesRequest] (val x: Self) extends AnyVal {
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
    def setPageSize(value: integer): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPathFilter(value: String): Self = this.set("pathFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathFilter: Self = this.set("pathFilter", js.undefined)
    @scala.inline
    def setSkipCount(value: integer): Self = this.set("skipCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipCount: Self = this.set("skipCount", js.undefined)
  }
  
}

