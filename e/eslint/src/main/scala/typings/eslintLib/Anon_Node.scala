package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression | estreeLib.estreeMod.ArrowFunctionExpression
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.Parameter
}

object Anon_Node {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression | estreeLib.estreeMod.ArrowFunctionExpression,
    parent: scala.Null,
    `type`: eslintLib.eslintLibStrings.Parameter
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Node]
  }
}

