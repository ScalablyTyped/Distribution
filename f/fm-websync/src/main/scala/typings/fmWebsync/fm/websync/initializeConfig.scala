package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait initializeConfig extends StObject {
  
  /**
    * If set to true, an asynchronous disconnect request will be launched when the page unloads. If set to false, no automatic disconnection will be attempted.
    * If set to an object, then a disconnect request will be launched when the page unloads using the object as the disconnect configuration.
    * (See disconnectConfig for details.) Note that automatic disconnects are a best-effort. The only way to guarantee success is to execute the disconnect synchronously
    * and target a request URL on the same domain as the page ({ sync: true, requestUrl: '...relative path.../request.ashx' }). Defaults to false.
    */
  var autoDisconnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of time in milliseconds to add to the delay between each reconnect attempt in the event of network failure. Defaults to 3000 (3 seconds).
    */
  var backoffInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the HTML frame to be used with HTML5 postMessage for cross-domain environments. Must have the same domain as requestUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the WebSync Server
    * ClientHandler registered in web.config with "frame" added to the query.
    */
  var clientFrameUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The domain key to send with each request. If using WebSync On-Demand, this should be set to the public or private API key specified in the Frozen Mountain Portal.
    * If using WebSync Server, this should be used only if grouping connections. Defaults to "11111111-1111-1111-1111-111111111111".
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The callback to invoke after onSuccess or onFailure. See initializeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the initialize fails. Defaults to an alert of the error. See initializeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ initializeFailureArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the initialize succeeds. See initializeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseArgs, Unit]] = js.undefined
  
  /**
    * Whether or not to suppress the alerting of a failure if the client is already initialized.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL of the WebSync request handler. This URL typically ends with request.ashx. Must have the same domain as clientFrameUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the
    * WebSync Server RequestHandler registered in web.config.
    */
  var requestUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The number of times to retry a request in the event of network failure before considering it failed and invoking the corresponding OnFailure callback. Defaults to 3.
    */
  var retries: js.UndefOr[Double] = js.undefined
  
  /**
    * The URLs to use for streaming connections. Three properties are available:
    *
    * requestUrl: string
    *      Same as the root requestUrl parameter, but used for streaming connections. Must have the same domain as stream.clientFrameUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the streamHost web.config attribute, if specified) and the path to the
    * WebSync Server RequestHandler registered in web.config.
    * clientFrameUrl: string
    *      Same as the root clientFrameUrl parameter, but used for streaming connections. Must have the same domain as stream.requestUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the streamHost web.config attribute, if specified) and the path to the
    * WebSync Server ClientHandler registered in web.config with "frame" added to the query.
    * timeout: number
    *      Same as the root timeout parameter, but used for streaming connections. Defaults to the root timeout + 25000 (25 seconds).
    */
  var stream: js.UndefOr[Any] = js.undefined
  
  /**
    * The number of milliseconds to wait for a standard request to return a response before it is cancelled and a new attempt is made. Defaults to 15000 (15 seconds).
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The token sent with every client request identifying it for query-based load balancing. Defaults to the current timestamp.
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * An object specifying URLs to be used for specific client methods. Overrides initializeConfig.requestUrl for the specified method type, but can be overridden
    * by the requestUrl specified in individual method configurations.
    *
    * connect: string
    * The URL to use for all client.connect requests.
    *
    * bind: string
    * The URL to use for all client.bind requests.
    *
    * unbind: string
    * The URL to use for all client.unbind requests.
    *
    * subscribe: string
    * The URL to use for all client.subscribe requests.
    *
    * unsubscribe: string
    * The URL to use for all client.unsubscribe requests.
    *
    * publish: string
    * The URL to use for all client.publish requests.
    *
    * disconnect: string
    * The URL to use for all client.disconnect requests.
    */
  var urls: js.UndefOr[Any] = js.undefined
}
object initializeConfig {
  
  inline def apply(): initializeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[initializeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: initializeConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoDisconnect(value: Boolean): Self = StObject.set(x, "autoDisconnect", value.asInstanceOf[js.Any])
    
    inline def setAutoDisconnectUndefined: Self = StObject.set(x, "autoDisconnect", js.undefined)
    
    inline def setBackoffInterval(value: Double): Self = StObject.set(x, "backoffInterval", value.asInstanceOf[js.Any])
    
    inline def setBackoffIntervalUndefined: Self = StObject.set(x, "backoffInterval", js.undefined)
    
    inline def setClientFrameUrl(value: String): Self = StObject.set(x, "clientFrameUrl", value.asInstanceOf[js.Any])
    
    inline def setClientFrameUrlUndefined: Self = StObject.set(x, "clientFrameUrl", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnComplete(value: /* args */ baseArgs => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnFailure(value: /* args */ initializeFailureArgs => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: /* args */ baseArgs => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUrls(value: Any): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
  }
}
