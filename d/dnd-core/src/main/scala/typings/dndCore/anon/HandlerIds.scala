package typings.dndCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[String]] = js.undefined
}

object HandlerIds {
  @scala.inline
  def apply(handlerIds: js.Array[String] = null): HandlerIds = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerIds]
  }
}

