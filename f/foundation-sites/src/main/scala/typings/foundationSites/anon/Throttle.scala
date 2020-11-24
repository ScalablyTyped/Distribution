package typings.foundationSites.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Throttle extends js.Object {
  
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _] = js.native
}
object Throttle {
  
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]
  ): Throttle = {
    val __obj = js.Dynamic.literal(throttle = js.Any.fromFunction2(throttle))
    __obj.asInstanceOf[Throttle]
  }
  
  @scala.inline
  implicit class ThrottleOps[Self <: Throttle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThrottle(value: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]): Self = this.set("throttle", js.Any.fromFunction2(value))
  }
}
