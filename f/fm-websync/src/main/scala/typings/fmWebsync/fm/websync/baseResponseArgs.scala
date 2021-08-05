package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait baseResponseArgs
  extends StObject
     with baseArgs {
  
  /**
    * The singleton client.
    */
  var client: typings.fmWebsync.fm.websync.client
  
  /**
    * The ID of the singleton client.
    */
  var clientId: String
  
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any
  
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: Date
}
object baseResponseArgs {
  
  inline def apply(client: client, clientId: String, meta: js.Any, timestamp: Date): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseResponseArgs]
  }
  
  extension [Self <: baseResponseArgs](x: Self) {
    
    inline def setClient(value: client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
