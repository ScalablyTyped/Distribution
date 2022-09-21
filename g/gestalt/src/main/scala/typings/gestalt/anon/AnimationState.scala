package typings.gestalt.anon

import typings.gestalt.mod.OnAnimationEndStateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  var animationState: OnAnimationEndStateType
}
object AnimationState {
  
  inline def apply(animationState: OnAnimationEndStateType): AnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
  
  extension [Self <: AnimationState](x: Self) {
    
    inline def setAnimationState(value: OnAnimationEndStateType): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
  }
}
