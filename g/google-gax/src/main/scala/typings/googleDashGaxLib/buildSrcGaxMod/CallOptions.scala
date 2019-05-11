package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var bundleOptions: js.UndefOr[googleDashGaxLib.buildSrcBundlingMod.BundleOptions | scala.Null] = js.undefined
  var isBundling: js.UndefOr[scala.Boolean] = js.undefined
  var longrunning: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var otherArgs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var pageToken: js.UndefOr[scala.Double] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var retry: js.UndefOr[RetryOptions | scala.Null] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    bundleOptions: googleDashGaxLib.buildSrcBundlingMod.BundleOptions = null,
    isBundling: js.UndefOr[scala.Boolean] = js.undefined,
    longrunning: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    otherArgs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    pageToken: scala.Int | scala.Double = null,
    promise: stdLib.PromiseConstructor = null,
    retry: RetryOptions = null,
    timeout: scala.Int | scala.Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (bundleOptions != null) __obj.updateDynamic("bundleOptions")(bundleOptions)
    if (!js.isUndefined(isBundling)) __obj.updateDynamic("isBundling")(isBundling)
    if (!js.isUndefined(longrunning)) __obj.updateDynamic("longrunning")(longrunning)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (otherArgs != null) __obj.updateDynamic("otherArgs")(otherArgs)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

