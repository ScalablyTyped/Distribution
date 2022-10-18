package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainAllocationStore extends StObject {
  
  var allocation_id: String
  
  var found: Boolean
  
  var in_sync: Boolean
  
  var matching_size_in_bytes: long
  
  var matching_sync_id: Boolean
  
  var store_exception: String
}
object ClusterAllocationExplainAllocationStore {
  
  inline def apply(
    allocation_id: String,
    found: Boolean,
    in_sync: Boolean,
    matching_size_in_bytes: long,
    matching_sync_id: Boolean,
    store_exception: String
  ): ClusterAllocationExplainAllocationStore = {
    val __obj = js.Dynamic.literal(allocation_id = allocation_id.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], in_sync = in_sync.asInstanceOf[js.Any], matching_size_in_bytes = matching_size_in_bytes.asInstanceOf[js.Any], matching_sync_id = matching_sync_id.asInstanceOf[js.Any], store_exception = store_exception.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainAllocationStore]
  }
  
  extension [Self <: ClusterAllocationExplainAllocationStore](x: Self) {
    
    inline def setAllocation_id(value: String): Self = StObject.set(x, "allocation_id", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setIn_sync(value: Boolean): Self = StObject.set(x, "in_sync", value.asInstanceOf[js.Any])
    
    inline def setMatching_size_in_bytes(value: long): Self = StObject.set(x, "matching_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMatching_sync_id(value: Boolean): Self = StObject.set(x, "matching_sync_id", value.asInstanceOf[js.Any])
    
    inline def setStore_exception(value: String): Self = StObject.set(x, "store_exception", value.asInstanceOf[js.Any])
  }
}
