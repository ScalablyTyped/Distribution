package typings.eslint.anon

import typings.eslint.eslintStrings.ImplicitGlobalVariable
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeParent extends DefinitionType {
  var node: Program = js.native
  var parent: Null = js.native
  var `type`: ImplicitGlobalVariable = js.native
}

object NodeParent {
  @scala.inline
  def apply(node: Program, parent: Null, `type`: ImplicitGlobalVariable): NodeParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParent]
  }
  @scala.inline
  implicit class NodeParentOps[Self <: NodeParent] (val x: Self) extends AnyVal {
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
    def setNode(value: Program): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImplicitGlobalVariable): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

