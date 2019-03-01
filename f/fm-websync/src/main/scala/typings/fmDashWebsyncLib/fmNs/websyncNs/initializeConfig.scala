package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait initializeConfig extends js.Object {
  /**
    * If set to true, an asynchronous disconnect request will be launched when the page unloads. If set to false, no automatic disconnection will be attempted.
    * If set to an object, then a disconnect request will be launched when the page unloads using the object as the disconnect configuration.
    * (See disconnectConfig for details.) Note that automatic disconnects are a best-effort. The only way to guarantee success is to execute the disconnect synchronously
    * and target a request URL on the same domain as the page ({ sync: true, requestUrl: '...relative path.../request.ashx' }). Defaults to false.
    */
  var autoDisconnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount of time in milliseconds to add to the delay between each reconnect attempt in the event of network failure. Defaults to 3000 (3 seconds).
    */
  var backoffInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * The URL of the HTML frame to be used with HTML5 postMessage for cross-domain environments. Must have the same domain as requestUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the WebSync Server
    * ClientHandler registered in web.config with "frame" added to the query.
    */
  var clientFrameUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The domain key to send with each request. If using WebSync On-Demand, this should be set to the public or private API key specified in the Frozen Mountain Portal.
    * If using WebSync Server, this should be used only if grouping connections. Defaults to "11111111-1111-1111-1111-111111111111".
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The callback to invoke after onSuccess or onFailure. See initializeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the initialize fails. Defaults to an alert of the error. See initializeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ initializeFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the initialize succeeds. See initializeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseArgs, scala.Unit]] = js.undefined
  /**
    * Whether or not to suppress the alerting of a failure if the client is already initialized.
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL of the WebSync request handler. This URL typically ends with request.ashx. Must have the same domain as clientFrameUrl.
    * Defaults to a dynamically generated URL based on the host of the client script URL (or the host web.config attribute, if specified) and the path to the
    * WebSync Server RequestHandler registered in web.config.
    */
  var requestUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of times to retry a request in the event of network failure before considering it failed and invoking the corresponding OnFailure callback. Defaults to 3.
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
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
  var stream: js.UndefOr[js.Any] = js.undefined
  /**
    * The number of milliseconds to wait for a standard request to return a response before it is cancelled and a new attempt is made. Defaults to 15000 (15 seconds).
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The token sent with every client request identifying it for query-based load balancing. Defaults to the current timestamp.
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
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
  var urls: js.UndefOr[js.Any] = js.undefined
}

object initializeConfig {
  @scala.inline
  def apply(
    autoDisconnect: js.UndefOr[scala.Boolean] = js.undefined,
    backoffInterval: scala.Int | scala.Double = null,
    clientFrameUrl: java.lang.String = null,
    key: java.lang.String = null,
    onComplete: js.Function1[/* args */ baseArgs, scala.Unit] = null,
    onFailure: js.Function1[/* args */ initializeFailureArgs, scala.Unit] = null,
    onSuccess: js.Function1[/* args */ baseArgs, scala.Unit] = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    requestUrl: java.lang.String = null,
    retries: scala.Int | scala.Double = null,
    stream: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    urls: js.Any = null
  ): initializeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDisconnect)) __obj.updateDynamic("autoDisconnect")(autoDisconnect)
    if (backoffInterval != null) __obj.updateDynamic("backoffInterval")(backoffInterval.asInstanceOf[js.Any])
    if (clientFrameUrl != null) __obj.updateDynamic("clientFrameUrl")(clientFrameUrl)
    if (key != null) __obj.updateDynamic("key")(key)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[initializeConfig]
  }
}

