package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/toggler.html#javascript-reference
trait Toggler extends StObject {
  
  def destroy(): Unit
  
  def toggle(): Unit
}
object Toggler {
  
  @scala.inline
  def apply(destroy: () => Unit, toggle: () => Unit): Toggler = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Toggler]
  }
  
  @scala.inline
  implicit class TogglerMutableBuilder[Self <: Toggler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
