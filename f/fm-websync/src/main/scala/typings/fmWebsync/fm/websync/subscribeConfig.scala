package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subscribeConfig
  extends StObject
     with baseRequestConfig {
  
  /**
    * The channel to which the client should be subscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.undefined
  
  /**
    * The channels to which the client should be subscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The callback to invoke after onSuccess or onFailure. See subscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ subscribeCompleteArgs, Unit]] = js.undefined
  
  /**
    * (OptionalThe callback to invoke if the subscribe fails. See subscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ subscribeFailureArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke when data is received on the channel(s). See receiveArgs for callback argument details.
    */
  var onReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, Unit]] = js.undefined
  
  /**
    * Subscribers extension. The callback to invoke when a subscribers change notification is received (i.e. when a client subscribes to or unsubscribes from the channel(s)).
    * The current subscribe request will trigger this callback. See subscribersChangeArgs for callback argument details.
    */
  var onSubscribersChange: js.UndefOr[js.Function1[/* args */ subscribersChangeArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the subscribe succeeds. See subscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ subscribeSuccessArgs, Unit]] = js.undefined
}
object subscribeConfig {
  
  inline def apply(): subscribeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[subscribeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: subscribeConfig] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setOnComplete(value: /* args */ subscribeCompleteArgs => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnFailure(value: /* args */ subscribeFailureArgs => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnReceive(value: /* args */ receiveArgs => Unit): Self = StObject.set(x, "onReceive", js.Any.fromFunction1(value))
    
    inline def setOnReceiveUndefined: Self = StObject.set(x, "onReceive", js.undefined)
    
    inline def setOnSubscribersChange(value: /* args */ subscribersChangeArgs => Unit): Self = StObject.set(x, "onSubscribersChange", js.Any.fromFunction1(value))
    
    inline def setOnSubscribersChangeUndefined: Self = StObject.set(x, "onSubscribersChange", js.undefined)
    
    inline def setOnSuccess(value: /* args */ subscribeSuccessArgs => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
