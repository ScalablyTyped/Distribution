package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShardStoresShardStore extends StObject {
  
  var allocation: IndicesShardStoresShardStoreAllocation
  
  var allocation_id: Id
  
  var attributes: Record[String, Any]
  
  var id: Id
  
  var legacy_version: VersionNumber
  
  var name: Name
  
  var store_exception: IndicesShardStoresShardStoreException
  
  var transport_address: TransportAddress
}
object IndicesShardStoresShardStore {
  
  inline def apply(
    allocation: IndicesShardStoresShardStoreAllocation,
    allocation_id: Id,
    attributes: Record[String, Any],
    id: Id,
    legacy_version: VersionNumber,
    name: Name,
    store_exception: IndicesShardStoresShardStoreException,
    transport_address: TransportAddress
  ): IndicesShardStoresShardStore = {
    val __obj = js.Dynamic.literal(allocation = allocation.asInstanceOf[js.Any], allocation_id = allocation_id.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], legacy_version = legacy_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], store_exception = store_exception.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresShardStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesShardStoresShardStore] (val x: Self) extends AnyVal {
    
    inline def setAllocation(value: IndicesShardStoresShardStoreAllocation): Self = StObject.set(x, "allocation", value.asInstanceOf[js.Any])
    
    inline def setAllocation_id(value: Id): Self = StObject.set(x, "allocation_id", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLegacy_version(value: VersionNumber): Self = StObject.set(x, "legacy_version", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStore_exception(value: IndicesShardStoresShardStoreException): Self = StObject.set(x, "store_exception", value.asInstanceOf[js.Any])
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
  }
}
