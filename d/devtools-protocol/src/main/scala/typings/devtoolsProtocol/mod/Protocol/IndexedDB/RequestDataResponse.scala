package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDataResponse extends StObject {
  
  /**
    * If true, there are more entries to fetch in the given range.
    */
  var hasMore: Boolean
  
  /**
    * Array of object store data entries.
    */
  var objectStoreDataEntries: js.Array[DataEntry]
}
object RequestDataResponse {
  
  @scala.inline
  def apply(hasMore: Boolean, objectStoreDataEntries: js.Array[DataEntry]): RequestDataResponse = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], objectStoreDataEntries = objectStoreDataEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataResponse]
  }
  
  @scala.inline
  implicit class RequestDataResponseMutableBuilder[Self <: RequestDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreDataEntries(value: js.Array[DataEntry]): Self = StObject.set(x, "objectStoreDataEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreDataEntriesVarargs(value: DataEntry*): Self = StObject.set(x, "objectStoreDataEntries", js.Array(value :_*))
  }
}
