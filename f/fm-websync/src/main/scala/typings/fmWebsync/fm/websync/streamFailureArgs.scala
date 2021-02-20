package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait streamFailureArgs extends baseResponseArgs {
  
  /**
    * The error generated while completing the request.
    */
  var error: String = js.native
  
  /**
    * Whether the client will automatically reconnect after the callback returns.
    */
  var willReconnect: Boolean = js.native
}
object streamFailureArgs {
  
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    meta: js.Any,
    timestamp: Date,
    willReconnect: Boolean
  ): streamFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], willReconnect = willReconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamFailureArgs]
  }
  
  @scala.inline
  implicit class streamFailureArgsMutableBuilder[Self <: streamFailureArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillReconnect(value: Boolean): Self = StObject.set(x, "willReconnect", value.asInstanceOf[js.Any])
  }
}
