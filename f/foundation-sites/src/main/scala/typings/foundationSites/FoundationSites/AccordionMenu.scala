package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/accordion-menu.html#javascript-reference
trait AccordionMenu extends StObject {
  
  def down(target: JQuery, firstTime: Boolean): Unit
  
  def hideAll(): Unit
  
  def showAll(): Unit
  
  def toggle(target: JQuery): Unit
  
  def up(target: JQuery): Unit
}
object AccordionMenu {
  
  inline def apply(
    down: (JQuery, Boolean) => Unit,
    hideAll: () => Unit,
    showAll: () => Unit,
    toggle: JQuery => Unit,
    up: JQuery => Unit
  ): AccordionMenu = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction2(down), hideAll = js.Any.fromFunction0(hideAll), showAll = js.Any.fromFunction0(showAll), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[AccordionMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccordionMenu] (val x: Self) extends AnyVal {
    
    inline def setDown(value: (JQuery, Boolean) => Unit): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    inline def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
    
    inline def setToggle(value: JQuery => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setUp(value: JQuery => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
  }
}
