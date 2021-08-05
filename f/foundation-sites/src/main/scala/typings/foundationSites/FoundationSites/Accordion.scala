package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/accordion.html#javascript-reference
trait Accordion extends StObject {
  
  def destroy(): Unit
  
  def down($target: JQuery, firstTime: Boolean): Unit
  
  def toggle($target: JQuery): Unit
  
  def up($target: JQuery): Unit
}
object Accordion {
  
  inline def apply(destroy: () => Unit, down: (JQuery, Boolean) => Unit, toggle: JQuery => Unit, up: JQuery => Unit): Accordion = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[Accordion]
  }
  
  extension [Self <: Accordion](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDown(value: (JQuery, Boolean) => Unit): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    inline def setToggle(value: JQuery => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setUp(value: JQuery => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
  }
}
