package typings.eslint.anon

import typings.eslint.eslintStrings.Parameter
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeParentType extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression = js.native
  var parent: Null = js.native
  var `type`: Parameter = js.native
}

object NodeParentType {
  @scala.inline
  def apply(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): NodeParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParentType]
  }
  @scala.inline
  implicit class NodeParentTypeOps[Self <: NodeParentType] (val x: Self) extends AnyVal {
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
    def setNode(value: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Parameter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

