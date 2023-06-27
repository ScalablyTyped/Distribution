package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorageListUpdatedEvent extends StObject {
  
  /**
    * Storage bucket to update.
    */
  var bucketId: String
  
  /**
    * Origin to update.
    */
  var origin: String
  
  /**
    * Storage key to update.
    */
  var storageKey: String
}
object CacheStorageListUpdatedEvent {
  
  inline def apply(bucketId: String, origin: String, storageKey: String): CacheStorageListUpdatedEvent = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageListUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheStorageListUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
