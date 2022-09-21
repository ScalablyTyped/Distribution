package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait baseFailureArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The error generated while completing the request.
    */
  var error: String
}
object baseFailureArgs {
  
  inline def apply(client: client, clientId: String, error: String, meta: Any, timestamp: js.Date): baseFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseFailureArgs]
  }
  
  extension [Self <: baseFailureArgs](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
