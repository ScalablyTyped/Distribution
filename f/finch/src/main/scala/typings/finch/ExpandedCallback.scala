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
    load: FinchCallback = null,
    setup: FinchCallback = null,
    teardown: FinchCallback = null,
    unload: FinchCallback = null
  ): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(load)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (teardown != null) __obj.updateDynamic("teardown")(teardown)
    if (unload != null) __obj.updateDynamic("unload")(unload)
    __obj.asInstanceOf[ExpandedCallback]
  }
}

