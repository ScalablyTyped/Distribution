package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearObjectStoreRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String
  
  /**
    * Object store name.
    */
  var objectStoreName: String
  
  /**
    * At least and at most one of securityOrigin, storageKey must be specified.
    * Security origin.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * Storage key.
    */
  var storageKey: js.UndefOr[String] = js.undefined
}
object ClearObjectStoreRequest {
  
  inline def apply(databaseName: String, objectStoreName: String): ClearObjectStoreRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearObjectStoreRequest]
  }
  
  extension [Self <: ClearObjectStoreRequest](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
