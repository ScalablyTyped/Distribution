package typings.gestalt.anon

import typings.gestalt.gestaltStrings.in
import typings.gestalt.gestaltStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  var animationState: in | out
}
object AnimationState {
  
  inline def apply(animationState: in | out): AnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
    
    inline def setAnimationState(value: in | out): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
  }
}
