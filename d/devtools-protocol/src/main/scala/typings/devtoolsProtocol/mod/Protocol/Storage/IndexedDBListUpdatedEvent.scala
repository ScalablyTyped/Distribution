package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedDBListUpdatedEvent extends StObject {
  
  /**
    * Origin to update.
    */
  var origin: String = js.native
}
object IndexedDBListUpdatedEvent {
  
  @scala.inline
  def apply(origin: String): IndexedDBListUpdatedEvent = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBListUpdatedEvent]
  }
  
  @scala.inline
  implicit class IndexedDBListUpdatedEventMutableBuilder[Self <: IndexedDBListUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
