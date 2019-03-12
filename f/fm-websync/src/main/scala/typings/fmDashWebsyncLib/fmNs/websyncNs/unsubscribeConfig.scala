package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait unsubscribeConfig extends baseRequestConfig {
  /**
    * The channel from which the client should be unsubscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The channels from which the client should be unsubscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The callback to invoke after onSuccess or onFailure. See unsubscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe fails. See unsubscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe succeeds. See unsubscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ unsubscribeSuccessArgs, scala.Unit]] = js.undefined
}

object unsubscribeConfig {
  @scala.inline
  def apply(
    channel: java.lang.String = null,
    channels: js.Array[java.lang.String] = null,
    meta: js.Any = null,
    onComplete: /* args */ baseResponseArgs => scala.Unit = null,
    onFailure: /* args */ baseFailureArgs => scala.Unit = null,
    onSuccess: /* args */ unsubscribeSuccessArgs => scala.Unit = null,
    requestUrl: java.lang.String = null,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): unsubscribeConfig = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[unsubscribeConfig]
  }
}

