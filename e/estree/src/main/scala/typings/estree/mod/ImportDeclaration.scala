package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration
  extends BaseNode
     with ModuleDeclaration {
  
  var source: Literal = js.native
  
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier] = js.native
  
  @JSName("type")
  var type_ImportDeclaration: typings.estree.estreeStrings.ImportDeclaration = js.native
}
object ImportDeclaration {
  
  @scala.inline
  def apply(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typings.estree.estreeStrings.ImportDeclaration
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration]
  }
  
  @scala.inline
  implicit class ImportDeclarationOps[Self <: ImportDeclaration] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Literal): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: (ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier)*): Self = this.set("specifiers", js.Array(value :_*))
    
    @scala.inline
    def setSpecifiers(value: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ImportDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
