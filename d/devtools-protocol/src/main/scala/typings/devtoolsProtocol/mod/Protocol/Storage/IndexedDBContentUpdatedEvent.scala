package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedDBContentUpdatedEvent extends StObject {
  
  /**
    * Database to update.
    */
  var databaseName: String = js.native
  
  /**
    * ObjectStore to update.
    */
  var objectStoreName: String = js.native
  
  /**
    * Origin to update.
    */
  var origin: String = js.native
}
object IndexedDBContentUpdatedEvent {
  
  @scala.inline
  def apply(databaseName: String, objectStoreName: String, origin: String): IndexedDBContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBContentUpdatedEvent]
  }
  
  @scala.inline
  implicit class IndexedDBContentUpdatedEventMutableBuilder[Self <: IndexedDBContentUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
