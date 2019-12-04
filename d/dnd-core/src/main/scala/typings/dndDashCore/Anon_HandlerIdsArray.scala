package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerIdsArray extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object Anon_HandlerIdsArray {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): Anon_HandlerIdsArray = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandlerIdsArray]
  }
}

