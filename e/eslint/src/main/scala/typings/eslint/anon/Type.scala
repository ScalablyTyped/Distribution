package typings.eslint.anon

import typings.eslint.eslintStrings.FunctionName
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression
  var parent: Null
  var `type`: FunctionName
}

object Type {
  @scala.inline
  def apply(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): Type = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

