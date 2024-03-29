package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectStoreEntriesRequest extends StObject {
  
  var databaseName: String
  
  /**
    * Range of entry keys to delete
    */
  var keyRange: KeyRange
  
  var objectStoreName: String
  
  /**
    * At least and at most one of securityOrigin, storageKey, or storageBucket must be specified.
    * Security origin.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * Storage bucket. If not specified, it uses the default bucket.
    */
  var storageBucket: js.UndefOr[StorageBucket] = js.undefined
  
  /**
    * Storage key.
    */
  var storageKey: js.UndefOr[String] = js.undefined
}
object DeleteObjectStoreEntriesRequest {
  
  inline def apply(databaseName: String, keyRange: KeyRange, objectStoreName: String): DeleteObjectStoreEntriesRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], keyRange = keyRange.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectStoreEntriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObjectStoreEntriesRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setKeyRange(value: KeyRange): Self = StObject.set(x, "keyRange", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
    
    inline def setStorageBucket(value: StorageBucket): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
