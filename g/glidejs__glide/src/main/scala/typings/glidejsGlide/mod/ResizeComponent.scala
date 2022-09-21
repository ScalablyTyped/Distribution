package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeComponent
  extends StObject
     with Component {
  
  /**
    * Adds throttled `resize` event.
    */
  def bind(): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners at window object.
    */
  @JSName("mount")
  def mount_MResizeComponent(): Unit
  
  /**
    * Removes previously added `resize` event.
    */
  def unbind(): Unit
}
object ResizeComponent {
  
  inline def apply(bind: () => Unit, mount: () => Unit, unbind: () => Unit): ResizeComponent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), mount = js.Any.fromFunction0(mount), unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[ResizeComponent]
  }
  
  extension [Self <: ResizeComponent](x: Self) {
    
    inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
  }
}
