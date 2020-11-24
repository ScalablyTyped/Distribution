package typings.egjsAxes.animationManagerMod

import typings.egjsAxes.anon.DestPos
import typings.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationParam extends js.Object {
  
  var delta: Axis = js.native
  
  var depaPos: Axis = js.native
  
  var destPos: Axis = js.native
  
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  
  var duration: Double = js.native
  
  var inputEvent: js.UndefOr[js.Any] = js.native
  
  var setTo: js.UndefOr[
    js.Function2[/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double], DestPos]
  ] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
}
object AnimationParam {
  
  @scala.inline
  def apply(delta: Axis, depaPos: Axis, destPos: Axis, duration: Double): AnimationParam = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], depaPos = depaPos.asInstanceOf[js.Any], destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
  
  @scala.inline
  implicit class AnimationParamOps[Self <: AnimationParam] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Axis): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepaPos(value: Axis): Self = this.set("depaPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPos(value: Axis): Self = this.set("destPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setInputEvent(value: js.Any): Self = this.set("inputEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputEvent: Self = this.set("inputEvent", js.undefined)
    
    @scala.inline
    def setSetTo(value: (/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double]) => DestPos): Self = this.set("setTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetTo: Self = this.set("setTo", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
