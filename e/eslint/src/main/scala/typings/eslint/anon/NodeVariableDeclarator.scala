package typings.eslint.anon

import typings.eslint.eslintStrings.Variable
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeVariableDeclarator extends DefinitionType {
  var node: VariableDeclarator = js.native
  var parent: VariableDeclaration = js.native
  var `type`: Variable = js.native
}

object NodeVariableDeclarator {
  @scala.inline
  def apply(node: VariableDeclarator, parent: VariableDeclaration, `type`: Variable): NodeVariableDeclarator = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVariableDeclarator]
  }
  @scala.inline
  implicit class NodeVariableDeclaratorOps[Self <: NodeVariableDeclarator] (val x: Self) extends AnyVal {
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
    def setNode(value: VariableDeclarator): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: VariableDeclaration): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Variable): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

