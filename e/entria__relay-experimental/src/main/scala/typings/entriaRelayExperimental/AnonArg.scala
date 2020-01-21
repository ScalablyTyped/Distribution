package typings.entriaRelayExperimental

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
}

object AnonArg {
  @scala.inline
  def apply(onComplete: /* arg */ Error | Null => Unit = null): AnonArg = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[AnonArg]
  }
}

