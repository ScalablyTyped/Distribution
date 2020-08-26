package typings.eslint.anon

import typings.eslint.eslintStrings.ImportBinding
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.ImportDeclaration
import typings.estree.mod.ImportDefaultSpecifier
import typings.estree.mod.ImportNamespaceSpecifier
import typings.estree.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentType extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier = js.native
  var parent: ImportDeclaration = js.native
  var `type`: ImportBinding = js.native
}

object ParentType {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): ParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentType]
  }
  @scala.inline
  implicit class ParentTypeOps[Self <: ParentType] (val x: Self) extends AnyVal {
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
    def setNode(value: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ImportDeclaration): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImportBinding): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

