package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyboard extends StObject {
  
  def findFocusable($element: js.Object): js.Object
  
  def handleKey(event: js.Any, component: js.Any, functions: js.Any): Unit
  
  def parseKey(event: js.Any): String
}
object Keyboard {
  
  inline def apply(
    findFocusable: js.Object => js.Object,
    handleKey: (js.Any, js.Any, js.Any) => Unit,
    parseKey: js.Any => String
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3(handleKey), parseKey = js.Any.fromFunction1(parseKey))
    __obj.asInstanceOf[Keyboard]
  }
  
  extension [Self <: Keyboard](x: Self) {
    
    inline def setFindFocusable(value: js.Object => js.Object): Self = StObject.set(x, "findFocusable", js.Any.fromFunction1(value))
    
    inline def setHandleKey(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "handleKey", js.Any.fromFunction3(value))
    
    inline def setParseKey(value: js.Any => String): Self = StObject.set(x, "parseKey", js.Any.fromFunction1(value))
  }
}
