package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEffect extends StObject {
  
  /**
    * `AnimationEffect`'s target node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * `AnimationEffect`'s delay.
    */
  var delay: Double
  
  /**
    * `AnimationEffect`'s playback direction.
    */
  var direction: String
  
  /**
    * `AnimationEffect`'s iteration duration.
    */
  var duration: Double
  
  /**
    * `AnimationEffect`'s timing function.
    */
  var easing: String
  
  /**
    * `AnimationEffect`'s end delay.
    */
  var endDelay: Double
  
  /**
    * `AnimationEffect`'s fill mode.
    */
  var fill: String
  
  /**
    * `AnimationEffect`'s iteration start.
    */
  var iterationStart: Double
  
  /**
    * `AnimationEffect`'s iterations.
    */
  var iterations: Double
  
  /**
    * `AnimationEffect`'s keyframes.
    */
  var keyframesRule: js.UndefOr[KeyframesRule] = js.undefined
}
object AnimationEffect {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AnimationEffect] (val x: Self) extends AnyVal {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setIterationStart(value: Double): Self = StObject.set(x, "iterationStart", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setKeyframesRule(value: KeyframesRule): Self = StObject.set(x, "keyframesRule", value.asInstanceOf[js.Any])
    
    inline def setKeyframesRuleUndefined: Self = StObject.set(x, "keyframesRule", js.undefined)
  }
}
