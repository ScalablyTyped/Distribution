package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsync extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonAsync {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    method: String = null,
    params: js.Any = null,
    payload: js.Any = null,
    timeout: Int | Double = null,
    url: String = null
  ): AnonAsync = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
}

