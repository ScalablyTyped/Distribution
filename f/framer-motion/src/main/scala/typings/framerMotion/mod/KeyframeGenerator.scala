package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeGenerator[V] extends StObject {
  
  var calculatedDuration: Null | Double
  
  def next(t: Double): AnimationState[V]
}
object KeyframeGenerator {
  
  inline def apply[V](next: Double => AnimationState[V]): KeyframeGenerator[V] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next), calculatedDuration = null)
    __obj.asInstanceOf[KeyframeGenerator[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframeGenerator[?], V] (val x: Self & KeyframeGenerator[V]) extends AnyVal {
    
    inline def setCalculatedDuration(value: Double): Self = StObject.set(x, "calculatedDuration", value.asInstanceOf[js.Any])
    
    inline def setCalculatedDurationNull: Self = StObject.set(x, "calculatedDuration", null)
    
    inline def setNext(value: Double => AnimationState[V]): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
