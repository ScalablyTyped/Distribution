package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDatabaseNamesRequest extends StObject {
  
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
object RequestDatabaseNamesRequest {
  
  inline def apply(): RequestDatabaseNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDatabaseNamesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestDatabaseNamesRequest] (val x: Self) extends AnyVal {
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
    
    inline def setStorageBucket(value: StorageBucket): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
