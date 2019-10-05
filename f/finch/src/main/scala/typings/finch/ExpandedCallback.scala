package typings.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedCallback extends js.Object {
  var load: js.UndefOr[FinchCallback] = js.undefined
  var setup: js.UndefOr[FinchCallback] = js.undefined
  var teardown: js.UndefOr[FinchCallback] = js.undefined
  var unload: js.UndefOr[FinchCallback] = js.undefined
}

object ExpandedCallback {
  @scala.inline
  def apply(
    load: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any = null,
    setup: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any = null,
    teardown: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any = null,
    unload: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any = null
  ): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2(setup))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction2(teardown))
    if (unload != null) __obj.updateDynamic("unload")(js.Any.fromFunction2(unload))
    __obj.asInstanceOf[ExpandedCallback]
  }
}

