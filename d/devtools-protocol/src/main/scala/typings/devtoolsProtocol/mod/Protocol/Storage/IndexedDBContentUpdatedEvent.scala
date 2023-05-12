package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedDBContentUpdatedEvent extends StObject {
  
  /**
    * Storage bucket to update.
    */
  var bucketId: String
  
  /**
    * Database to update.
    */
  var databaseName: String
  
  /**
    * ObjectStore to update.
    */
  var objectStoreName: String
  
  /**
    * Origin to update.
    */
  var origin: String
  
  /**
    * Storage key to update.
    */
  var storageKey: String
}
object IndexedDBContentUpdatedEvent {
  
  inline def apply(
    bucketId: String,
    databaseName: String,
    objectStoreName: String,
    origin: String,
    storageKey: String
  ): IndexedDBContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBContentUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexedDBContentUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
