package typings.emberRunloop.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmberRunTimer extends js.Object {
  
  var __ember_run_timer_brand__ : Boolean = js.native
}
object EmberRunTimer {
  
  @scala.inline
  def apply(__ember_run_timer_brand__ : Boolean): EmberRunTimer = {
    val __obj = js.Dynamic.literal(__ember_run_timer_brand__ = __ember_run_timer_brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmberRunTimer]
  }
  
  @scala.inline
  implicit class EmberRunTimerOps[Self <: EmberRunTimer] (val x: Self) extends AnyVal {
    
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
    def set__ember_run_timer_brand__(value: Boolean): Self = this.set("__ember_run_timer_brand__", value.asInstanceOf[js.Any])
  }
}
