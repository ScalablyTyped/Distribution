package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subscribeSuccessArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The channel to which the client was subscribed. Must start with a forward slash (/).
    */
  var channel: String
  
  /**
    * The channels to which the client was subscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[String]
  
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean
  
  /**
    * Subscribers extension. The active subscribed clients on the just-subscribed channel(s).
    */
  var subscribedClients: js.Array[subscribedClient]
}
object subscribeSuccessArgs {
  
  inline def apply(
    channel: String,
    channels: js.Array[String],
    client: client,
    clientId: String,
    isResubscribe: Boolean,
    meta: js.Any,
    subscribedClients: js.Array[subscribedClient],
    timestamp: Date
  ): subscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], subscribedClients = subscribedClients.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeSuccessArgs]
  }
  
  extension [Self <: subscribeSuccessArgs](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    inline def setIsResubscribe(value: Boolean): Self = StObject.set(x, "isResubscribe", value.asInstanceOf[js.Any])
    
    inline def setSubscribedClients(value: js.Array[subscribedClient]): Self = StObject.set(x, "subscribedClients", value.asInstanceOf[js.Any])
    
    inline def setSubscribedClientsVarargs(value: subscribedClient*): Self = StObject.set(x, "subscribedClients", js.Array(value :_*))
  }
}
