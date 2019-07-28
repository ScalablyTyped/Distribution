package typings.foundationDashSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _]
}

object Anon_Args {
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(throttle = js.Any.fromFunction2(throttle))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

