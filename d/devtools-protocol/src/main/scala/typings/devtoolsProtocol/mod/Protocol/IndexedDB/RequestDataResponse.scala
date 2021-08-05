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
  
  inline def apply(hasMore: Boolean, objectStoreDataEntries: js.Array[DataEntry]): RequestDataResponse = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], objectStoreDataEntries = objectStoreDataEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataResponse]
  }
  
  extension [Self <: RequestDataResponse](x: Self) {
    
    inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreDataEntries(value: js.Array[DataEntry]): Self = StObject.set(x, "objectStoreDataEntries", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreDataEntriesVarargs(value: DataEntry*): Self = StObject.set(x, "objectStoreDataEntries", js.Array(value :_*))
  }
}
