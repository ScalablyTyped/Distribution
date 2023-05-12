package typings.embroiderSharedInternals.anon

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Program_
import typings.embroiderSharedInternals.srcTemplateColocationPluginMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(path: NodePath[Program_], state: State): Unit
  
  def exit(path: NodePath[Program_], state: State): Unit
}
object Enter {
  
  inline def apply(enter: (NodePath[Program_], State) => Unit, exit: (NodePath[Program_], State) => Unit): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction2(enter), exit = js.Any.fromFunction2(exit))
    __obj.asInstanceOf[Enter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
    
    inline def setEnter(value: (NodePath[Program_], State) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setExit(value: (NodePath[Program_], State) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
  }
}
