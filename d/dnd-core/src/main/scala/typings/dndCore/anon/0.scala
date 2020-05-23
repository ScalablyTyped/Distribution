package typings.dndCore.anon

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object `0` {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

