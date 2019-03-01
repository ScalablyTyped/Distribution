package typings
package emojiDashMartLib.distDashEsUtilsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreHandlers extends js.Object {
  var getter: js.UndefOr[js.Function1[/* key */ java.lang.String, _]] = js.undefined
  var setter: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]] = js.undefined
}

object StoreHandlers {
  @scala.inline
  def apply(
    getter: js.Function1[/* key */ java.lang.String, _] = null,
    setter: js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit] = null
  ): StoreHandlers = {
    val __obj = js.Dynamic.literal()
    if (getter != null) __obj.updateDynamic("getter")(getter)
    if (setter != null) __obj.updateDynamic("setter")(setter)
    __obj.asInstanceOf[StoreHandlers]
  }
}

