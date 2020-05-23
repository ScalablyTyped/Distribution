package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectConfig extends baseRequestConfig {
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
  def apply(
    meta: js.Any = null,
    onComplete: /* args */ connectCompleteArgs => Unit = null,
    onFailure: /* args */ connectFailureArgs => Unit = null,
    onStreamFailure: /* args */ streamFailureArgs => Unit = null,
    onSuccess: /* args */ connectSuccessArgs => Unit = null,
    onUnhandledReceive: /* args */ receiveArgs => Unit = null,
    requestUrl: String = null,
    stayConnected: js.UndefOr[Boolean] = js.undefined,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): connectConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onStreamFailure != null) __obj.updateDynamic("onStreamFailure")(js.Any.fromFunction1(onStreamFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (onUnhandledReceive != null) __obj.updateDynamic("onUnhandledReceive")(js.Any.fromFunction1(onUnhandledReceive))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(stayConnected)) __obj.updateDynamic("stayConnected")(stayConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectConfig]
  }
}

