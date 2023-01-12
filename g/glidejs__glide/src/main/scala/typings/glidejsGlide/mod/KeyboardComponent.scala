package typings.glidejsGlide.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardComponent
  extends StObject
     with Component {
  
  /**
    * Binds `keyup` event listener for key presses.
    */
  def bind(): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners for keyboard key presses.
    */
  @JSName("mount")
  def mount_MKeyboardComponent(): Unit
  
  /**
    * `keyup` event handler. Makes Makes movement base on arrow key direction.
    */
  def press(event: KeyboardEvent): Unit
  
  /**
    * Removes previously added `keyup` event.
    */
  def unbind(): Unit
}
object KeyboardComponent {
  
  inline def apply(bind: () => Unit, mount: () => Unit, press: KeyboardEvent => Unit, unbind: () => Unit): KeyboardComponent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), mount = js.Any.fromFunction0(mount), press = js.Any.fromFunction1(press), unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[KeyboardComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardComponent] (val x: Self) extends AnyVal {
    
    inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setPress(value: KeyboardEvent => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
  }
}
