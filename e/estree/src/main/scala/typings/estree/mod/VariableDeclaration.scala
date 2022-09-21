package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration
  extends StObject
     with BaseNode
     with Declaration {
  
  var declarations: js.Array[VariableDeclarator]
  
  var kind: `var` | let | const
  
  @JSName("type")
  var type_VariableDeclaration: typings.estree.estreeStrings.VariableDeclaration
}
object VariableDeclaration {
  
  inline def apply(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration]
  }
  
  extension [Self <: VariableDeclaration](x: Self) {
    
    inline def setDeclarations(value: js.Array[VariableDeclarator]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: VariableDeclarator*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
