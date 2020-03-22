package typings.expressBrute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  var reset: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
}

object AnonReset {
  @scala.inline
  def apply(reset: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit = null): AnonReset = {
    val __obj = js.Dynamic.literal()
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    __obj.asInstanceOf[AnonReset]
  }
}

