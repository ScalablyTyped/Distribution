package typings.embroiderSharedInternals.anon

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.ExportDefaultDeclaration_
import typings.babelTypes.mod.ExportNamedDeclaration_
import typings.embroiderSharedInternals.srcTemplateColocationPluginMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultDeclaration extends StObject {
  
  def ExportDefaultDeclaration(path: NodePath[ExportDefaultDeclaration_], state: State): Unit
  
  def ExportNamedDeclaration(path: NodePath[ExportNamedDeclaration_], state: State): Unit
  
  var Program: Enter
}
object ExportDefaultDeclaration {
  
  inline def apply(
    ExportDefaultDeclaration: (NodePath[ExportDefaultDeclaration_], State) => Unit,
    ExportNamedDeclaration: (NodePath[ExportNamedDeclaration_], State) => Unit,
    Program: Enter
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(ExportDefaultDeclaration = js.Any.fromFunction2(ExportDefaultDeclaration), ExportNamedDeclaration = js.Any.fromFunction2(ExportNamedDeclaration), Program = Program.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDefaultDeclaration] (val x: Self) extends AnyVal {
    
    inline def setExportDefaultDeclaration(value: (NodePath[ExportDefaultDeclaration_], State) => Unit): Self = StObject.set(x, "ExportDefaultDeclaration", js.Any.fromFunction2(value))
    
    inline def setExportNamedDeclaration(value: (NodePath[ExportNamedDeclaration_], State) => Unit): Self = StObject.set(x, "ExportNamedDeclaration", js.Any.fromFunction2(value))
    
    inline def setProgram(value: Enter): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
  }
}
