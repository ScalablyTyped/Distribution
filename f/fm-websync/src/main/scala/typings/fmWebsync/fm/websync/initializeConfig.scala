package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait initializeConfig extends js.Object {
  
  /**
    * If set to true, an asynchronous disconnect request will be launched when the page unloads. If set to false, no automatic disconnection will be attempted.
    * If set to an object, then a disconnect request will be launched when the page unloads using the object as the disconnect configuration.
    * (See disconnectConfig for details.) Note that automatic disconnects are a best-effort. The only way to guarantee success is to execute the disconnect synchronously
    * and target a request URL on the same domain as the page ({ sync: true, requestUrl: '...relative path.../request.ashx' }). Defaults to false.
    */
  var autoDisconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of time in milliseconds to add to the delay between each reconnect attempt in the event of network failure. Defaults to 3000 (3 seconds).
    */
  var backoffInterval: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the HTML frame to be used with HTML5 postMessage for cross-domain environments. Must have the same domain as requestUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the WebSync Server
    * ClientHandler registered in web.config with "frame" added to the query.
    */
  var clientFrameUrl: js.UndefOr[String] = js.native
  
  /**
    * The domain key to send with each request. If using WebSync On-Demand, this should be set to the public or private API key specified in the Frozen Mountain Portal.
    * If using WebSync Server, this should be used only if grouping connections. Defaults to "11111111-1111-1111-1111-111111111111".
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The callback to invoke after onSuccess or onFailure. See initializeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseArgs, Unit]] = js.native
  
  /**
    * The callback to invoke if the initialize fails. Defaults to an alert of the error. See initializeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ initializeFailureArgs, Unit]] = js.native
  
  /**
    * The callback to invoke if the initialize succeeds. See initializeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseArgs, Unit]] = js.native
  
  /**
    * Whether or not to suppress the alerting of a failure if the client is already initialized.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  /**
    * The URL of the WebSync request handler. This URL typically ends with request.ashx. Must have the same domain as clientFrameUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the
    * WebSync Server RequestHandler registered in web.config.
    */
  var requestUrl: js.UndefOr[String] = js.native
  
  /**
    * The number of times to retry a request in the event of network failure before considering it failed and invoking the corresponding OnFailure callback. Defaults to 3.
    */
  var retries: js.UndefOr[Double] = js.native
  
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
  var stream: js.UndefOr[js.Any] = js.native
  
  /**
    * The number of milliseconds to wait for a standard request to return a response before it is cancelled and a new attempt is made. Defaults to 15000 (15 seconds).
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The token sent with every client request identifying it for query-based load balancing. Defaults to the current timestamp.
    */
  var token: js.UndefOr[String] = js.native
  
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
  var urls: js.UndefOr[js.Any] = js.native
}
object initializeConfig {
  
  @scala.inline
  def apply(): initializeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[initializeConfig]
  }
  
  @scala.inline
  implicit class initializeConfigOps[Self <: initializeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoDisconnect(value: Boolean): Self = this.set("autoDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDisconnect: Self = this.set("autoDisconnect", js.undefined)
    
    @scala.inline
    def setBackoffInterval(value: Double): Self = this.set("backoffInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoffInterval: Self = this.set("backoffInterval", js.undefined)
    
    @scala.inline
    def setClientFrameUrl(value: String): Self = this.set("clientFrameUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientFrameUrl: Self = this.set("clientFrameUrl", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* args */ baseArgs => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnFailure(value: /* args */ initializeFailureArgs => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* args */ baseArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRequestUrl(value: String): Self = this.set("requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestUrl: Self = this.set("requestUrl", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setStream(value: js.Any): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Any): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
