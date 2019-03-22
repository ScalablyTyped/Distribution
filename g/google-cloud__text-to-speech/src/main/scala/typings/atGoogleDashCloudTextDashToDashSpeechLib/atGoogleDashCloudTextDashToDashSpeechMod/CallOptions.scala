package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var isBundling: scala.Boolean
  var longrunning: js.UndefOr[js.Any] = js.undefined
  var pageToken: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var retry: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    isBundling: scala.Boolean,
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    longrunning: js.Any = null,
    pageToken: js.Any = null,
    promise: js.Any = null,
    retry: js.Any = null,
    timeout: scala.Int | scala.Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal(isBundling = isBundling)
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

