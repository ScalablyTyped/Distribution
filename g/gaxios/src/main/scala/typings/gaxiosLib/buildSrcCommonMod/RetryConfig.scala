package typings
package gaxiosLib.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  /**
    * The number of retries already attempted.
    */
  var currentRetryAttempt: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTTP Methods that will be automatically retried.
    * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
    */
  var httpMethodsToRetry: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When there is no response, the number of retries to attempt. Defaults to 2.
    */
  var noResponseRetries: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function to invoke when a retry attempt is made.
    */
  var onRetryAttempt: js.UndefOr[js.Function1[/* err */ GaxiosError[_], scala.Unit]] = js.undefined
  /**
    * The number of times to retry the request.  Defaults to 3.
    */
  var retry: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of time to initially delay the retry.  Defaults to 100.
    */
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function to invoke which determines if you should retry
    */
  var shouldRetry: js.UndefOr[js.Function1[/* err */ GaxiosError[_], scala.Boolean]] = js.undefined
  /**
    * The HTTP response status codes that will automatically be retried.
    * Defaults to: [[100, 199], [429, 429], [500, 599]]
    */
  var statusCodesToRetry: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
}

object RetryConfig {
  @scala.inline
  def apply(
    currentRetryAttempt: scala.Int | scala.Double = null,
    httpMethodsToRetry: js.Array[java.lang.String] = null,
    noResponseRetries: scala.Int | scala.Double = null,
    onRetryAttempt: js.Function1[/* err */ GaxiosError[_], scala.Unit] = null,
    retry: scala.Int | scala.Double = null,
    retryDelay: scala.Int | scala.Double = null,
    shouldRetry: js.Function1[/* err */ GaxiosError[_], scala.Boolean] = null,
    statusCodesToRetry: js.Array[js.Array[scala.Double]] = null
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (currentRetryAttempt != null) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.asInstanceOf[js.Any])
    if (httpMethodsToRetry != null) __obj.updateDynamic("httpMethodsToRetry")(httpMethodsToRetry)
    if (noResponseRetries != null) __obj.updateDynamic("noResponseRetries")(noResponseRetries.asInstanceOf[js.Any])
    if (onRetryAttempt != null) __obj.updateDynamic("onRetryAttempt")(onRetryAttempt)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (shouldRetry != null) __obj.updateDynamic("shouldRetry")(shouldRetry)
    if (statusCodesToRetry != null) __obj.updateDynamic("statusCodesToRetry")(statusCodesToRetry)
    __obj.asInstanceOf[RetryConfig]
  }
}

