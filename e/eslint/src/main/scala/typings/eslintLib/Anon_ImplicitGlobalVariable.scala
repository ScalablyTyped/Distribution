package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImplicitGlobalVariable
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.Program
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.ImplicitGlobalVariable
}

object Anon_ImplicitGlobalVariable {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.Program,
    parent: scala.Null,
    `type`: eslintLib.eslintLibStrings.ImplicitGlobalVariable
  ): Anon_ImplicitGlobalVariable = {
    val __obj = js.Dynamic.literal(node = node, parent = parent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ImplicitGlobalVariable]
  }
}

