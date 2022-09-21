package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyboard extends StObject {
  
  def findFocusable(element: JQuery): js.Object
  
  def handleKey(event: Any, component: Any, functions: Any): Unit
  
  def parseKey(event: Any): String
  
  def register(componentName: Any, cmds: Any): Unit
  
  def releaseFocus(element: JQuery): Unit
  
  def trapFocus(element: JQuery): Unit
}
object Keyboard {
  
  inline def apply(
    findFocusable: JQuery => js.Object,
    handleKey: (Any, Any, Any) => Unit,
    parseKey: Any => String,
    register: (Any, Any) => Unit,
    releaseFocus: JQuery => Unit,
    trapFocus: JQuery => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3(handleKey), parseKey = js.Any.fromFunction1(parseKey), register = js.Any.fromFunction2(register), releaseFocus = js.Any.fromFunction1(releaseFocus), trapFocus = js.Any.fromFunction1(trapFocus))
    __obj.asInstanceOf[Keyboard]
  }
  
  extension [Self <: Keyboard](x: Self) {
    
    inline def setFindFocusable(value: JQuery => js.Object): Self = StObject.set(x, "findFocusable", js.Any.fromFunction1(value))
    
    inline def setHandleKey(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "handleKey", js.Any.fromFunction3(value))
    
    inline def setParseKey(value: Any => String): Self = StObject.set(x, "parseKey", js.Any.fromFunction1(value))
    
    inline def setRegister(value: (Any, Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    inline def setReleaseFocus(value: JQuery => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction1(value))
    
    inline def setTrapFocus(value: JQuery => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction1(value))
  }
}
