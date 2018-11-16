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

