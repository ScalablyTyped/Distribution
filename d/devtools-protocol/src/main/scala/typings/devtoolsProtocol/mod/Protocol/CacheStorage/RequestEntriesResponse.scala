package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEntriesResponse extends js.Object {
  /**
    * Array of object store data entries.
    */
  var cacheDataEntries: js.Array[DataEntry] = js.native
  /**
    * Count of returned entries from this storage. If pathFilter is empty, it
    * is the count of all entries from this storage.
    */
  var returnCount: Double = js.native
}

object RequestEntriesResponse {
  @scala.inline
  def apply(cacheDataEntries: js.Array[DataEntry], returnCount: Double): RequestEntriesResponse = {
    val __obj = js.Dynamic.literal(cacheDataEntries = cacheDataEntries.asInstanceOf[js.Any], returnCount = returnCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEntriesResponse]
  }
  @scala.inline
  implicit class RequestEntriesResponseOps[Self <: RequestEntriesResponse] (val x: Self) extends AnyVal {
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
    def setCacheDataEntriesVarargs(value: DataEntry*): Self = this.set("cacheDataEntries", js.Array(value :_*))
    @scala.inline
    def setCacheDataEntries(value: js.Array[DataEntry]): Self = this.set("cacheDataEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnCount(value: Double): Self = this.set("returnCount", value.asInstanceOf[js.Any])
  }
  
}

