package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait connectConfig
  extends StObject
     with baseRequestConfig {
  
  /**
    * The callback to invoke after onSuccess or onFailure. See connectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ connectCompleteArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the connect fails. Defaults to an alert of the error. See connectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ connectFailureArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the streaming connection fails. See streamFailureArgs for callback argument details.
    * This method will be invoked if (a) the connection was lost, automatic retries succeeded, but the client had idled on the server (and so needs to reconnect),
    * or (b) the connection was lost and automatic retries failed. In the former case, willReconnect is true, and in the latter case, willReconnect is false.
    * See client for more details on these two scenarios.
    * If willReconnect is true, the client will automatically reconnect. If the reconnect succeeds, the callback specified by onSuccess will be invoked with isReconnect set to true.
    * If the reconnect fails, the callback specified by onFailure will be invoked with isReconnect set to false.
    * With the exception of UI updates, invocations of this callback with willReconnect set to true can be ignored.
    */
  var onStreamFailure: js.UndefOr[js.Function1[/* args */ streamFailureArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the connect succeeds. See connectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ connectSuccessArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke when a message is received on a channel that has no local callback specified to handle it. See receiveArgs for callback argument details.
    * This can occur if (a) a client is manually subscribed to a channel by the server or (b) a client subscribed to a channel and then manually removed the local callback using client.
    */
  var onUnhandledReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, Unit]] = js.undefined
  
  /**
    * Whether to always attempt to stay connected in the event of network failure. If true, the client will continually reconnect, even after exhausting the specified number
    * of retries specified by initializeConfig.retries. If false, the client will stop reconnecting if all retry attempts fail.
    */
  var stayConnected: js.UndefOr[Boolean] = js.undefined
}
object connectConfig {
  
  @scala.inline
  def apply(): connectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[connectConfig]
  }
  
  @scala.inline
  implicit class connectConfigMutableBuilder[Self <: connectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: /* args */ connectCompleteArgs => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnFailure(value: /* args */ connectFailureArgs => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnStreamFailure(value: /* args */ streamFailureArgs => Unit): Self = StObject.set(x, "onStreamFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStreamFailureUndefined: Self = StObject.set(x, "onStreamFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* args */ connectSuccessArgs => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setOnUnhandledReceive(value: /* args */ receiveArgs => Unit): Self = StObject.set(x, "onUnhandledReceive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnhandledReceiveUndefined: Self = StObject.set(x, "onUnhandledReceive", js.undefined)
    
    @scala.inline
    def setStayConnected(value: Boolean): Self = StObject.set(x, "stayConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStayConnectedUndefined: Self = StObject.set(x, "stayConnected", js.undefined)
  }
}
