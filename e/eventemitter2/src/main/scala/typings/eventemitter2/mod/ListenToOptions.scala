package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenToOptions extends js.Object {
  var off: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.undefined
  var on: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.undefined
  var reducers: js.Function | js.Object
}

object ListenToOptions {
  @scala.inline
  def apply(
    reducers: js.Function | js.Object,
    off: (/* event */ event | eventNS, /* handler */ js.Function) => Unit = null,
    on: (/* event */ event | eventNS, /* handler */ js.Function) => Unit = null
  ): ListenToOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any])
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction2(off))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2(on))
    __obj.asInstanceOf[ListenToOptions]
  }
}

