package typings.driftless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var customClearTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply(customClearTimeout: /* repeated */ js.Any => Unit = null): AnonArgs = {
    val __obj = js.Dynamic.literal()
    if (customClearTimeout != null) __obj.updateDynamic("customClearTimeout")(js.Any.fromFunction1(customClearTimeout))
    __obj.asInstanceOf[AnonArgs]
  }
}

