package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclaration
  extends Declaration
     with BaseNode {
  
  var declarations: js.Array[VariableDeclarator] = js.native
  
  var kind: `var` | let | const = js.native
  
  @JSName("type")
  var type_VariableDeclaration: typings.estree.estreeStrings.VariableDeclaration = js.native
}
object VariableDeclaration {
  
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typings.estree.estreeStrings.VariableDeclaration
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
  
  @scala.inline
  implicit class VariableDeclarationOps[Self <: VariableDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeclarationsVarargs(value: VariableDeclarator*): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[VariableDeclarator]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.VariableDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
