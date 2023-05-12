package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState[V] extends StObject {
  
  var done: Boolean
  
  var value: V
}
object AnimationState {
  
  inline def apply[V](done: Boolean, value: V): AnimationState[V] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationState[?], V] (val x: Self & AnimationState[V]) extends AnyVal {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
