package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/dropdown.html#javascript-reference
trait Dropdown extends StObject {
  
  def close(): Unit
  
  def destroy(): Unit
  
  def getPositionClass(): String
  
  def open(): Unit
  
  def toggle(): Unit
}
object Dropdown {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    getPositionClass: () => String,
    open: () => Unit,
    toggle: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), getPositionClass = js.Any.fromFunction0(getPositionClass), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Dropdown]
  }
  
  extension [Self <: Dropdown](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetPositionClass(value: () => String): Self = StObject.set(x, "getPositionClass", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
