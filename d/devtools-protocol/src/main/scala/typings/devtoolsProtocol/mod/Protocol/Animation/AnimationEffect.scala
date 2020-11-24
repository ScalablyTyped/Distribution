package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffect extends js.Object {
  
  /**
    * `AnimationEffect`'s target node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * `AnimationEffect`'s delay.
    */
  var delay: Double = js.native
  
  /**
    * `AnimationEffect`'s playback direction.
    */
  var direction: String = js.native
  
  /**
    * `AnimationEffect`'s iteration duration.
    */
  var duration: Double = js.native
  
  /**
    * `AnimationEffect`'s timing function.
    */
  var easing: String = js.native
  
  /**
    * `AnimationEffect`'s end delay.
    */
  var endDelay: Double = js.native
  
  /**
    * `AnimationEffect`'s fill mode.
    */
  var fill: String = js.native
  
  /**
    * `AnimationEffect`'s iteration start.
    */
  var iterationStart: Double = js.native
  
  /**
    * `AnimationEffect`'s iterations.
    */
  var iterations: Double = js.native
  
  /**
    * `AnimationEffect`'s keyframes.
    */
  var keyframesRule: js.UndefOr[KeyframesRule] = js.native
}
object AnimationEffect {
  
  @scala.inline
  def apply(
    delay: Double,
    direction: String,
    duration: Double,
    easing: String,
    endDelay: Double,
    fill: String,
    iterationStart: Double,
    iterations: Double
  ): AnimationEffect = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endDelay = endDelay.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], iterationStart = iterationStart.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffect]
  }
  
  @scala.inline
  implicit class AnimationEffectOps[Self <: AnimationEffect] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDelay(value: Double): Self = this.set("endDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationStart(value: Double): Self = this.set("iterationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    
    @scala.inline
    def setKeyframesRule(value: KeyframesRule): Self = this.set("keyframesRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframesRule: Self = this.set("keyframesRule", js.undefined)
  }
}
