package typings.googleCloudKms.mod.GAX

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#CallOptions */
trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var isBundling: js.UndefOr[Boolean] = js.undefined
  var longrunning: js.UndefOr[BackoffSettings] = js.undefined
  var pageToken: js.UndefOr[js.Object] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    isBundling: js.UndefOr[Boolean] = js.undefined,
    longrunning: BackoffSettings = null,
    pageToken: js.Object = null,
    promise: PromiseConstructor = null,
    retry: RetryOptions = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundling)) __obj.updateDynamic("isBundling")(isBundling.get.asInstanceOf[js.Any])
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

