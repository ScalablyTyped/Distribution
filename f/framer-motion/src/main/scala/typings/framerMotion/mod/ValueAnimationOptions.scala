package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAnimationOptions[V]
  extends StObject
     with ValueAnimationTransition[Any] {
  
  var keyframes: js.Array[V]
}
object ValueAnimationOptions {
  
  inline def apply[V](keyframes: js.Array[V]): ValueAnimationOptions[V] = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAnimationOptions[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueAnimationOptions[?], V] (val x: Self & ValueAnimationOptions[V]) extends AnyVal {
    
    inline def setKeyframes(value: js.Array[V]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: V*): Self = StObject.set(x, "keyframes", js.Array(value*))
  }
}
