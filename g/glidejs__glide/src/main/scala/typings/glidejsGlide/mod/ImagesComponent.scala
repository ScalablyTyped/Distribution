package typings.glidejsGlide.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesComponent
  extends StObject
     with Component {
  
  /**
    * Binds `dragstart` event to prevent dragging on images.
    */
  def bind(): Unit
  
  /**
    * Event handler. Prevents dragging on images.
    */
  def dragstart(event: MouseEvent): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners for `<img>` elements.
    */
  @JSName("mount")
  def mount_MImagesComponent(): Unit
  
  /**
    * Removes previously added `dragstart` event.
    */
  def unbind(): Unit
}
object ImagesComponent {
  
  inline def apply(bind: () => Unit, dragstart: MouseEvent => Unit, mount: () => Unit, unbind: () => Unit): ImagesComponent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), dragstart = js.Any.fromFunction1(dragstart), mount = js.Any.fromFunction0(mount), unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[ImagesComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagesComponent] (val x: Self) extends AnyVal {
    
    inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    inline def setDragstart(value: MouseEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
  }
}
