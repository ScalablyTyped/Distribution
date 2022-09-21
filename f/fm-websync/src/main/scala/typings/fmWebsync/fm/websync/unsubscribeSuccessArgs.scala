package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait unsubscribeSuccessArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The channel from which the client was unsubscribed. Must start with a forward slash (/).
    */
  var channel: String
  
  /**
    * The channels from which the client was unsubscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[String]
}
object unsubscribeSuccessArgs {
  
  inline def apply(
    channel: String,
    channels: js.Array[String],
    client: client,
    clientId: String,
    meta: Any,
    timestamp: js.Date
  ): unsubscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsubscribeSuccessArgs]
  }
  
  extension [Self <: unsubscribeSuccessArgs](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
  }
}
