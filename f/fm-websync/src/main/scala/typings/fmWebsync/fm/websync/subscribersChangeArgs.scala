package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subscribersChangeArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The details of the change that occurred.
    */
  var change: js.UndefOr[subscribersChange] = js.undefined
  
  /**
    * The channel on which the change occurred.
    */
  var channel: js.UndefOr[String] = js.undefined
}
object subscribersChangeArgs {
  
  inline def apply(client: client, clientId: String, meta: Any, timestamp: js.Date): subscribersChangeArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChangeArgs]
  }
  
  extension [Self <: subscribersChangeArgs](x: Self) {
    
    inline def setChange(value: subscribersChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
