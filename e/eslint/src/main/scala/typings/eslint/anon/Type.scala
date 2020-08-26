package typings.eslint.anon

import typings.eslint.eslintStrings.FunctionName
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression = js.native
  var parent: Null = js.native
  var `type`: FunctionName = js.native
}

object Type {
  @scala.inline
  def apply(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): Type = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setNode(value: FunctionDeclaration | FunctionExpression): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FunctionName): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

