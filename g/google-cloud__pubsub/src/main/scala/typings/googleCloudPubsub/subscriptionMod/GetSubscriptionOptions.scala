package typings.googleCloudPubsub.subscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.bundleExecutorMod.BundleOptions
import typings.googleGax.gaxMod.BackoffSettings
import typings.googleGax.gaxMod.RetryOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined google-gax.google-gax.CallOptions & {  autoCreate ? :boolean} */
trait GetSubscriptionOptions extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.undefined
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var bundleOptions: js.UndefOr[BundleOptions | Null] = js.undefined
  var isBundling: js.UndefOr[Boolean] = js.undefined
  var longrunning: js.UndefOr[BackoffSettings] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var otherArgs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
  var retry: js.UndefOr[RetryOptions | Null] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GetSubscriptionOptions {
  @scala.inline
  def apply(
    autoCreate: js.UndefOr[Boolean] = js.undefined,
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    bundleOptions: js.UndefOr[Null | BundleOptions] = js.undefined,
    isBundling: js.UndefOr[Boolean] = js.undefined,
    longrunning: BackoffSettings = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    otherArgs: StringDictionary[js.Any] = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    promise: PromiseConstructor = null,
    retry: js.UndefOr[Null | RetryOptions] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): GetSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bundleOptions)) __obj.updateDynamic("bundleOptions")(bundleOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundling)) __obj.updateDynamic("isBundling")(isBundling.get.asInstanceOf[js.Any])
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (otherArgs != null) __obj.updateDynamic("otherArgs")(otherArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionOptions]
  }
}

