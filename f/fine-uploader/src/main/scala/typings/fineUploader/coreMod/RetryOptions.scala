package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
    * The number of seconds to wait between auto retry attempts
    *
    * @default `5`
    */
  var autoAttemptDelay: js.UndefOr[Double] = js.undefined
  /**
    * Enable or disable retrying uploads that receive any error response
    *
    * @default `false`
    */
  var enableAuto: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of times to attempt to retry a failed upload
    *
    * @default `3`
    */
  var maxAutoAttempts: js.UndefOr[Double] = js.undefined
  /**
    * This property will be looked for in the server response and, if found and `true`, will indicate that no more retries should be attempted for this item
    *
    * @default `'preventRetry'`
    */
  var preventRetryResponseProperty: js.UndefOr[String] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    autoAttemptDelay: js.UndefOr[Double] = js.undefined,
    enableAuto: js.UndefOr[Boolean] = js.undefined,
    maxAutoAttempts: js.UndefOr[Double] = js.undefined,
    preventRetryResponseProperty: String = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoAttemptDelay)) __obj.updateDynamic("autoAttemptDelay")(autoAttemptDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAuto)) __obj.updateDynamic("enableAuto")(enableAuto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAutoAttempts)) __obj.updateDynamic("maxAutoAttempts")(maxAutoAttempts.get.asInstanceOf[js.Any])
    if (preventRetryResponseProperty != null) __obj.updateDynamic("preventRetryResponseProperty")(preventRetryResponseProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

