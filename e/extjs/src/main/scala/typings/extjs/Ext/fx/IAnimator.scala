package typings.extjs.Ext.fx

import typings.extjs.Ext.fx.target.ITarget
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimator extends IObservable {
  
  /** [Property] (Number) */
  var currentIteration: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var duration: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.native
  
  /** [Method] Fire afteranimate event and end the animation  */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var isAnimator: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var iterations: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var keyframeStep: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var keyframes: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var paused: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var running: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.fx.target.Target) */
  var target: js.UndefOr[ITarget] = js.native
}
object IAnimator {
  
  @scala.inline
  def apply(): IAnimator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimator]
  }
  
  @scala.inline
  implicit class IAnimatorOps[Self <: IAnimator] (val x: Self) extends AnyVal {
    
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
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentIteration: Self = this.set("currentIteration", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setIsAnimator(value: Boolean): Self = this.set("isAnimator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnimator: Self = this.set("isAnimator", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setKeyframeStep(value: Double): Self = this.set("keyframeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframeStep: Self = this.set("keyframeStep", js.undefined)
    
    @scala.inline
    def setKeyframes(value: js.Any): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    
    @scala.inline
    def setTarget(value: ITarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
