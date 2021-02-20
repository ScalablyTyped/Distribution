package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait connectFailureArgs extends baseResponseArgs {
  
  /**
    * The error generated while completing the request.
    */
  var error: String = js.native
  
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean = js.native
  
  /**
    * Whether or not to reconnect automatically after this callback has finished execution.
    */
  var reconnect: Boolean = js.native
}
object connectFailureArgs {
  
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    isReconnect: Boolean,
    meta: js.Any,
    reconnect: Boolean,
    timestamp: Date
  ): connectFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectFailureArgs]
  }
  
  @scala.inline
  implicit class connectFailureArgsMutableBuilder[Self <: connectFailureArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReconnect(value: Boolean): Self = StObject.set(x, "isReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
  }
}
