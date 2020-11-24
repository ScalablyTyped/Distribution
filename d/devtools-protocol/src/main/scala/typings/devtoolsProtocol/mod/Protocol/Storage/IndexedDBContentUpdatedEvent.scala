package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedDBContentUpdatedEvent extends js.Object {
  
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
  implicit class IndexedDBContentUpdatedEventOps[Self <: IndexedDBContentUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreName(value: String): Self = this.set("objectStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
