package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRecoveryOrigin extends StObject {
  
  var bootstrap_new_history_uuid: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[Host] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var ip: js.UndefOr[Ip] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var repository: js.UndefOr[Name] = js.undefined
  
  var restoreUUID: js.UndefOr[Uuid] = js.undefined
  
  var snapshot: js.UndefOr[Name] = js.undefined
  
  var transport_address: js.UndefOr[TransportAddress] = js.undefined
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object IndicesRecoveryRecoveryOrigin {
  
  inline def apply(): IndicesRecoveryRecoveryOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRecoveryRecoveryOrigin]
  }
  
  extension [Self <: IndicesRecoveryRecoveryOrigin](x: Self) {
    
    inline def setBootstrap_new_history_uuid(value: Boolean): Self = StObject.set(x, "bootstrap_new_history_uuid", value.asInstanceOf[js.Any])
    
    inline def setBootstrap_new_history_uuidUndefined: Self = StObject.set(x, "bootstrap_new_history_uuid", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRestoreUUID(value: Uuid): Self = StObject.set(x, "restoreUUID", value.asInstanceOf[js.Any])
    
    inline def setRestoreUUIDUndefined: Self = StObject.set(x, "restoreUUID", js.undefined)
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setTransport_addressUndefined: Self = StObject.set(x, "transport_address", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
