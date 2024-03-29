package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorageContentUpdatedEvent extends StObject {
  
  /**
    * Storage bucket to update.
    */
  var bucketId: String
  
  /**
    * Name of cache in origin.
    */
  var cacheName: String
  
  /**
    * Origin to update.
    */
  var origin: String
  
  /**
    * Storage key to update.
    */
  var storageKey: String
}
object CacheStorageContentUpdatedEvent {
  
  inline def apply(bucketId: String, cacheName: String, origin: String, storageKey: String): CacheStorageContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], cacheName = cacheName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageContentUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheStorageContentUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
