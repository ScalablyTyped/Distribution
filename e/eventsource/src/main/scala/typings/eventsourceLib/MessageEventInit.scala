package typings
package eventsourceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventInit extends EventInit {
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
}

object MessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    lastEventId: java.lang.String = null,
    origin: java.lang.String = null
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

