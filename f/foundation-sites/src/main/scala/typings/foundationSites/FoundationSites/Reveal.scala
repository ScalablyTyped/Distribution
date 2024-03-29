package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/reveal.html#javascript-reference
trait Reveal extends StObject {
  
  def close(): Unit
  
  def open(): Unit
  
  def toggle(): Unit
}
object Reveal {
  
  inline def apply(close: () => Unit, open: () => Unit, toggle: () => Unit): Reveal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Reveal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reveal] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
