package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedDBContentUpdatedEvent extends StObject {
  
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
}
object IndexedDBContentUpdatedEvent {
  
  inline def apply(databaseName: String, objectStoreName: String, origin: String): IndexedDBContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBContentUpdatedEvent]
  }
  
  extension [Self <: IndexedDBContentUpdatedEvent](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
