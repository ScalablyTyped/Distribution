package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationScope[T] extends StObject {
  
  var animations: js.Array[AnimationPlaybackControls]
  
  val current: T
}
object AnimationScope {
  
  inline def apply[T](animations: js.Array[AnimationPlaybackControls], current: T): AnimationScope[T] = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationScope[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationScope[?], T] (val x: Self & AnimationScope[T]) extends AnyVal {
    
    inline def setAnimations(value: js.Array[AnimationPlaybackControls]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: AnimationPlaybackControls*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
