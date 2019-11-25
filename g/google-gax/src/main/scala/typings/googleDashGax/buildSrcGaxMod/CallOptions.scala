package typings.googleDashGax.buildSrcGaxMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashGax.buildSrcBundlingCallsBundleExecutorMod.BundleOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
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

object CallOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    bundleOptions: BundleOptions = null,
    isBundling: js.UndefOr[Boolean] = js.undefined,
    longrunning: BackoffSettings = null,
    maxResults: Int | Double = null,
    maxRetries: Int | Double = null,
    otherArgs: StringDictionary[js.Any] = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    promise: PromiseConstructor = null,
    retry: RetryOptions = null,
    timeout: Int | Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.asInstanceOf[js.Any])
    if (bundleOptions != null) __obj.updateDynamic("bundleOptions")(bundleOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundling)) __obj.updateDynamic("isBundling")(isBundling.asInstanceOf[js.Any])
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (otherArgs != null) __obj.updateDynamic("otherArgs")(otherArgs.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

