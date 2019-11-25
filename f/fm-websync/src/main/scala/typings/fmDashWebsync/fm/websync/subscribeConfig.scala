package typings.fmDashWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeConfig extends baseRequestConfig {
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
  @scala.inline
  def apply(
    channel: String = null,
    channels: js.Array[String] = null,
    meta: js.Any = null,
    onComplete: /* args */ subscribeCompleteArgs => Unit = null,
    onFailure: /* args */ subscribeFailureArgs => Unit = null,
    onReceive: /* args */ receiveArgs => Unit = null,
    onSubscribersChange: /* args */ subscribersChangeArgs => Unit = null,
    onSuccess: /* args */ subscribeSuccessArgs => Unit = null,
    requestUrl: String = null,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): subscribeConfig = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onReceive != null) __obj.updateDynamic("onReceive")(js.Any.fromFunction1(onReceive))
    if (onSubscribersChange != null) __obj.updateDynamic("onSubscribersChange")(js.Any.fromFunction1(onSubscribersChange))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeConfig]
  }
}

