package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
    * The number of seconds to wait between auto retry attempts
    *
    * @default `5`
    */
  var autoAttemptDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable or disable retrying uploads that receive any error response
    *
    * @default `false`
    */
  var enableAuto: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of times to attempt to retry a failed upload
    *
    * @default `3`
    */
  var maxAutoAttempts: js.UndefOr[scala.Double] = js.undefined
  /**
    * This property will be looked for in the server response and, if found and `true`, will indicate that no more retries should be attempted for this item
    *
    * @default `'preventRetry'`
    */
  var preventRetryResponseProperty: js.UndefOr[java.lang.String] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    autoAttemptDelay: scala.Int | scala.Double = null,
    enableAuto: js.UndefOr[scala.Boolean] = js.undefined,
    maxAutoAttempts: scala.Int | scala.Double = null,
    preventRetryResponseProperty: java.lang.String = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (autoAttemptDelay != null) __obj.updateDynamic("autoAttemptDelay")(autoAttemptDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAuto)) __obj.updateDynamic("enableAuto")(enableAuto)
    if (maxAutoAttempts != null) __obj.updateDynamic("maxAutoAttempts")(maxAutoAttempts.asInstanceOf[js.Any])
    if (preventRetryResponseProperty != null) __obj.updateDynamic("preventRetryResponseProperty")(preventRetryResponseProperty)
    __obj.asInstanceOf[RetryOptions]
  }
}

