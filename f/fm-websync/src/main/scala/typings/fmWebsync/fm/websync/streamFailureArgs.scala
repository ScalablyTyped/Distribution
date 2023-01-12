package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait streamFailureArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The error generated while completing the request.
    */
  var error: String
  
  /**
    * Whether the client will automatically reconnect after the callback returns.
    */
  var willReconnect: Boolean
}
object streamFailureArgs {
  
  inline def apply(
    client: client,
    clientId: String,
    error: String,
    meta: Any,
    timestamp: js.Date,
    willReconnect: Boolean
  ): streamFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], willReconnect = willReconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamFailureArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: streamFailureArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setWillReconnect(value: Boolean): Self = StObject.set(x, "willReconnect", value.asInstanceOf[js.Any])
  }
}
