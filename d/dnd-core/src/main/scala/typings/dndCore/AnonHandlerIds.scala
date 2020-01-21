package typings.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonHandlerIds {
  @scala.inline
  def apply(handlerIds: js.Array[String] = null): AnonHandlerIds = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandlerIds]
  }
}

