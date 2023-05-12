package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(node: Any): Unit
  
  def exit(node: Any): Unit
}
object Enter {
  
  inline def apply(enter: Any => Unit, exit: Any => Unit): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Enter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
    
    inline def setEnter(value: Any => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    inline def setExit(value: Any => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
  }
}
