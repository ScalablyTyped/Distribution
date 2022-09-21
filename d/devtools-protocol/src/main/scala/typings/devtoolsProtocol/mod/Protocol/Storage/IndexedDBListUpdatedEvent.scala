package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedDBListUpdatedEvent extends StObject {
  
  /**
    * Origin to update.
    */
  var origin: String
  
  /**
    * Storage key to update.
    */
  var storageKey: String
}
object IndexedDBListUpdatedEvent {
  
  inline def apply(origin: String, storageKey: String): IndexedDBListUpdatedEvent = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBListUpdatedEvent]
  }
  
  extension [Self <: IndexedDBListUpdatedEvent](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
