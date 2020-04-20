package typings.foundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThrottle extends js.Object {
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _]
}

object AnonThrottle {
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]
  ): AnonThrottle = {
    val __obj = js.Dynamic.literal(throttle = js.Any.fromFunction2(throttle))
    __obj.asInstanceOf[AnonThrottle]
  }
}

