package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorageContentUpdatedEvent extends StObject {
  
  /**
    * Name of cache in origin.
    */
  var cacheName: String
  
  /**
    * Origin to update.
    */
  var origin: String
}
object CacheStorageContentUpdatedEvent {
  
  inline def apply(cacheName: String, origin: String): CacheStorageContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageContentUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheStorageContentUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
