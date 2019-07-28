package typings.eventsource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventInit extends EventInit {
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
}

object MessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    lastEventId: String = null,
    origin: String = null
  ): MessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (data != null) __obj.updateDynamic("data")(data)
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[MessageEventInit]
  }
}

