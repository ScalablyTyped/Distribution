package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionName
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.FunctionName
}

object Anon_FunctionName {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression,
    parent: scala.Null,
    `type`: eslintLib.eslintLibStrings.FunctionName
  ): Anon_FunctionName = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FunctionName]
  }
}

