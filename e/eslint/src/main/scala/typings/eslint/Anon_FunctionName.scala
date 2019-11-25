package typings.eslint

import typings.eslint.eslintMod.Scope.DefinitionType
import typings.eslint.eslintStrings.FunctionName
import typings.estree.estreeMod.FunctionDeclaration
import typings.estree.estreeMod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionName extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression
  var parent: Null
  var `type`: FunctionName
}

object Anon_FunctionName {
  @scala.inline
  def apply(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): Anon_FunctionName = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FunctionName]
  }
}

