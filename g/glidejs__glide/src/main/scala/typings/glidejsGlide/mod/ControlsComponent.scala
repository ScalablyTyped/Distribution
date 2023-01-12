package typings.glidejsGlide.mod

import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlsComponent
  extends StObject
     with Component {
  
  /**
    * Adds click listeners to controls.
    */
  def addBindings(): Unit
  
  /**
    * Toggles an active class on a passed collection of HTML elements based on the current index.
    */
  def addClass(controls: HTMLElement): Unit
  
  /**
    * Toggles an active class on a passed collection of HTML elements based on the current index.
    */
  def bind(elements: HTMLCollection): Unit
  
  /**
    * Control's click event handler which makes movement based on its direction pattern.
    */
  def click(event: MouseEvent): Unit
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val items: HTMLCollectionOf[HTMLAnchorElement]
  
  @JSName("mount")
  def mount_MControlsComponent(): Unit
  
  /**
    * Removes active class from navigation controls.
    */
  def removeActive(): Unit
  
  /**
    * Removes click listeners from controls.
    */
  def removeBindings(): Unit
  
  /**
    * Removes an active class from passed collection of HTML elements.
    */
  def removeClass(controls: HTMLElement): Unit
  
  /**
    * Sets an active class to navigation controls.
    */
  def setActive(): Unit
  
  /**
    * Removes an active class from passed collection of HTML elements.
    */
  def unbind(elements: HTMLCollection): Unit
}
object ControlsComponent {
  
  inline def apply(
    addBindings: () => Unit,
    addClass: HTMLElement => Unit,
    bind: HTMLCollection => Unit,
    click: MouseEvent => Unit,
    items: HTMLCollectionOf[HTMLAnchorElement],
    mount: () => Unit,
    removeActive: () => Unit,
    removeBindings: () => Unit,
    removeClass: HTMLElement => Unit,
    setActive: () => Unit,
    unbind: HTMLCollection => Unit
  ): ControlsComponent = {
    val __obj = js.Dynamic.literal(addBindings = js.Any.fromFunction0(addBindings), addClass = js.Any.fromFunction1(addClass), bind = js.Any.fromFunction1(bind), click = js.Any.fromFunction1(click), items = items.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount), removeActive = js.Any.fromFunction0(removeActive), removeBindings = js.Any.fromFunction0(removeBindings), removeClass = js.Any.fromFunction1(removeClass), setActive = js.Any.fromFunction0(setActive), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[ControlsComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlsComponent] (val x: Self) extends AnyVal {
    
    inline def setAddBindings(value: () => Unit): Self = StObject.set(x, "addBindings", js.Any.fromFunction0(value))
    
    inline def setAddClass(value: HTMLElement => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
    
    inline def setBind(value: HTMLCollection => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setClick(value: MouseEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setItems(value: HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setRemoveActive(value: () => Unit): Self = StObject.set(x, "removeActive", js.Any.fromFunction0(value))
    
    inline def setRemoveBindings(value: () => Unit): Self = StObject.set(x, "removeBindings", js.Any.fromFunction0(value))
    
    inline def setRemoveClass(value: HTMLElement => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    
    inline def setSetActive(value: () => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction0(value))
    
    inline def setUnbind(value: HTMLCollection => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
