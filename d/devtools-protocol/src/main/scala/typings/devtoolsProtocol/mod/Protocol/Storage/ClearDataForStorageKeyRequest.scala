package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearDataForStorageKeyRequest extends StObject {
  
  /**
    * Storage key.
    */
  var storageKey: String
  
  /**
    * Comma separated list of StorageType to clear.
    */
  var storageTypes: String
}
object ClearDataForStorageKeyRequest {
  
  inline def apply(storageKey: String, storageTypes: String): ClearDataForStorageKeyRequest = {
    val __obj = js.Dynamic.literal(storageKey = storageKey.asInstanceOf[js.Any], storageTypes = storageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDataForStorageKeyRequest]
  }
  
  extension [Self <: ClearDataForStorageKeyRequest](x: Self) {
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageTypes(value: String): Self = StObject.set(x, "storageTypes", value.asInstanceOf[js.Any])
  }
}
