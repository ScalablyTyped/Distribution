package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var declaration: Declaration | Expression
  
  @JSName("type")
  var type_ExportDefaultDeclaration: typings.estree.estreeStrings.ExportDefaultDeclaration
}
object ExportDefaultDeclaration {
  
  inline def apply(declaration: Declaration | Expression): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDefaultDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDeclaration(value: Declaration | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
