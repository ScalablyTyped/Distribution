package typings.devexpressUtils.anon

import typings.devexpressUtils.mutableMod.MutableInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interval[T /* <: MutableInterval */] extends js.Object {
  
  var interval: T = js.native
}
object Interval {
  
  @scala.inline
  def apply[T /* <: MutableInterval */](interval: T): Interval[T] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval[T]]
  }
  
  @scala.inline
  implicit class IntervalOps[Self <: Interval[_], T /* <: MutableInterval */] (val x: Self with Interval[T]) extends AnyVal {
    
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
    def setInterval(value: T): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
}
