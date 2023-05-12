package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionValueEventCallbacks[V] extends StObject {
  
  def animationCancel(): Unit
  
  def animationComplete(): Unit
  
  def animationStart(): Unit
  
  def change(latestValue: V): Unit
  
  def renderRequest(): Unit
  
  def velocityChange(latestVelocity: Double): Unit
}
object MotionValueEventCallbacks {
  
  inline def apply[V](
    animationCancel: () => Unit,
    animationComplete: () => Unit,
    animationStart: () => Unit,
    change: V => Unit,
    renderRequest: () => Unit,
    velocityChange: Double => Unit
  ): MotionValueEventCallbacks[V] = {
    val __obj = js.Dynamic.literal(animationCancel = js.Any.fromFunction0(animationCancel), animationComplete = js.Any.fromFunction0(animationComplete), animationStart = js.Any.fromFunction0(animationStart), change = js.Any.fromFunction1(change), renderRequest = js.Any.fromFunction0(renderRequest), velocityChange = js.Any.fromFunction1(velocityChange))
    __obj.asInstanceOf[MotionValueEventCallbacks[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionValueEventCallbacks[?], V] (val x: Self & MotionValueEventCallbacks[V]) extends AnyVal {
    
    inline def setAnimationCancel(value: () => Unit): Self = StObject.set(x, "animationCancel", js.Any.fromFunction0(value))
    
    inline def setAnimationComplete(value: () => Unit): Self = StObject.set(x, "animationComplete", js.Any.fromFunction0(value))
    
    inline def setAnimationStart(value: () => Unit): Self = StObject.set(x, "animationStart", js.Any.fromFunction0(value))
    
    inline def setChange(value: V => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setRenderRequest(value: () => Unit): Self = StObject.set(x, "renderRequest", js.Any.fromFunction0(value))
    
    inline def setVelocityChange(value: Double => Unit): Self = StObject.set(x, "velocityChange", js.Any.fromFunction1(value))
  }
}
