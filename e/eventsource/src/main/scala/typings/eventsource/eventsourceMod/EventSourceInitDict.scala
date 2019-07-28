package typings.eventsource.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceInitDict extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var https: js.UndefOr[js.Object] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object EventSourceInitDict {
  @scala.inline
  def apply(
    headers: js.Object = null,
    https: js.Object = null,
    proxy: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): EventSourceInitDict = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (https != null) __obj.updateDynamic("https")(https)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[EventSourceInitDict]
  }
}

