package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/tooltip.html#javascript-reference
trait Tooltip extends StObject {
  
  def destroy(): Unit
  
  def hide(): Unit
  
  def show(): Unit
  
  def toggle(): Unit
}
object Tooltip {
  
  @scala.inline
  def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit): Tooltip = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
