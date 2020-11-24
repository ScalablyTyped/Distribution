package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDataResponse extends js.Object {
  
  /**
    * If true, there are more entries to fetch in the given range.
    */
  var hasMore: Boolean = js.native
  
  /**
    * Array of object store data entries.
    */
  var objectStoreDataEntries: js.Array[DataEntry] = js.native
}
object RequestDataResponse {
  
  @scala.inline
  def apply(hasMore: Boolean, objectStoreDataEntries: js.Array[DataEntry]): RequestDataResponse = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], objectStoreDataEntries = objectStoreDataEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataResponse]
  }
  
  @scala.inline
  implicit class RequestDataResponseOps[Self <: RequestDataResponse] (val x: Self) extends AnyVal {
    
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
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreDataEntriesVarargs(value: DataEntry*): Self = this.set("objectStoreDataEntries", js.Array(value :_*))
    
    @scala.inline
    def setObjectStoreDataEntries(value: js.Array[DataEntry]): Self = this.set("objectStoreDataEntries", value.asInstanceOf[js.Any])
  }
}
