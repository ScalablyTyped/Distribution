package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeParentType
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.VariableDeclarator
  var parent: estreeLib.estreeMod.VariableDeclaration
  var `type`: eslintLib.eslintLibStrings.Variable
}

object Anon_NodeParentType {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.VariableDeclarator,
    parent: estreeLib.estreeMod.VariableDeclaration,
    `type`: eslintLib.eslintLibStrings.Variable
  ): Anon_NodeParentType = {
    val __obj = js.Dynamic.literal(node = node, parent = parent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NodeParentType]
  }
}

