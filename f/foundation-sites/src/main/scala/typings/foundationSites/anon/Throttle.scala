package typings.foundationSites.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throttle extends js.Object {
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _]
}

object Throttle {
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]
  ): Throttle = {
    val __obj = js.Dynamic.literal(throttle = js.Any.fromFunction2(throttle))
    __obj.asInstanceOf[Throttle]
  }
}

