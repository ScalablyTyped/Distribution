package typings.dndCore

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

