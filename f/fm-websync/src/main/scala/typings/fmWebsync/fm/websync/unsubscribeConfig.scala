package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait unsubscribeConfig extends baseRequestConfig {
  /**
    * The channel from which the client should be unsubscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.undefined
  /**
    * The channels from which the client should be unsubscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The callback to invoke after onSuccess or onFailure. See unsubscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe fails. See unsubscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe succeeds. See unsubscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ unsubscribeSuccessArgs, Unit]] = js.undefined
}

object unsubscribeConfig {
  @scala.inline
  def apply(
    channel: String = null,
    channels: js.Array[String] = null,
    meta: js.Any = null,
    onComplete: /* args */ baseResponseArgs => Unit = null,
    onFailure: /* args */ baseFailureArgs => Unit = null,
    onSuccess: /* args */ unsubscribeSuccessArgs => Unit = null,
    requestUrl: String = null,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): unsubscribeConfig = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsubscribeConfig]
  }
}

