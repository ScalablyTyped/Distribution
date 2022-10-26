package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSharedStorageEntriesResponse extends StObject {
  
  var entries: js.Array[SharedStorageEntry]
}
object GetSharedStorageEntriesResponse {
  
  inline def apply(entries: js.Array[SharedStorageEntry]): GetSharedStorageEntriesResponse = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSharedStorageEntriesResponse]
  }
  
  extension [Self <: GetSharedStorageEntriesResponse](x: Self) {
    
    inline def setEntries(value: js.Array[SharedStorageEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: SharedStorageEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
