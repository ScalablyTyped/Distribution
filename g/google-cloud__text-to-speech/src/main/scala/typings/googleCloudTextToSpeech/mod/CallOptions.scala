package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var isBundling: Boolean
  var longrunning: js.UndefOr[js.Any] = js.undefined
  var pageToken: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var retry: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    isBundling: Boolean,
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    longrunning: js.Any = null,
    pageToken: js.Any = null,
    promise: js.Any = null,
    retry: js.Any = null,
    timeout: Int | Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal(isBundling = isBundling.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.asInstanceOf[js.Any])
    if (longrunning != null) __obj.updateDynamic("longrunning")(longrunning.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

