package typings.devexpressUtils.anon

import typings.devexpressUtils.constMod.ConstInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalConstInterval extends js.Object {
  
  var interval: ConstInterval = js.native
}
object IntervalConstInterval {
  
  @scala.inline
  def apply(interval: ConstInterval): IntervalConstInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalConstInterval]
  }
  
  @scala.inline
  implicit class IntervalConstIntervalOps[Self <: IntervalConstInterval] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: ConstInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
}
