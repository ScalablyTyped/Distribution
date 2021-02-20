package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subscribersChange extends StObject {
  
  /**
    * The clients who subscribed to or unsubscribed from the channel.
    */
  var clients: js.Array[subscribedClient] = js.native
  
  /**
    * The type of the change, either "subscribe" or "unsubscribe".
    */
  var `type`: String = js.native
}
object subscribersChange {
  
  @scala.inline
  def apply(clients: js.Array[subscribedClient], `type`: String): subscribersChange = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChange]
  }
  
  @scala.inline
  implicit class subscribersChangeMutableBuilder[Self <: subscribersChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClients(value: js.Array[subscribedClient]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientsVarargs(value: subscribedClient*): Self = StObject.set(x, "clients", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
