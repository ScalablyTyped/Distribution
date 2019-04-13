package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.GAXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#CallOptions */
trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var isBundling: js.UndefOr[scala.Boolean] = js.undefined
  var longrunning: js.UndefOr[BackoffSettings] = js.undefined
  var pageToken: js.UndefOr[js.Object] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    isBundling: js.UndefOr[scala.Boolean] = js.undefined,
    longrunning: BackoffSettings = null,
    pageToken: js.Object = null,
    promise: stdLib.PromiseConstructor = null,
    retry: RetryOptions = null,
    timeout: scala.Int | scala.Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (!js.isUndefined(isBundling)) __obj.updateDynamic("isBundling")(isBundling)
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

