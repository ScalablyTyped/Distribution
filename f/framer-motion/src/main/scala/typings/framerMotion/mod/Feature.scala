package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature[T /* <: Any */] extends StObject {
  
  var isMounted: Boolean
  
  def mount(): Unit
  
  var node: VisualElement[T, Any, js.Object]
  
  def unmount(): Unit
  
  def update(): Unit
}
object Feature {
  
  inline def apply[T /* <: Any */](
    isMounted: Boolean,
    mount: () => Unit,
    node: VisualElement[T, Any, js.Object],
    unmount: () => Unit,
    update: () => Unit
  ): Feature[T] = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount), node = node.asInstanceOf[js.Any], unmount = js.Any.fromFunction0(unmount), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Feature[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature[?], T /* <: Any */] (val x: Self & Feature[T]) extends AnyVal {
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setNode(value: VisualElement[T, Any, js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
