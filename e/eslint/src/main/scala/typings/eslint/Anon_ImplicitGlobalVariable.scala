package typings.eslint

import typings.eslint.eslintMod.Scope.DefinitionType
import typings.eslint.eslintStrings.ImplicitGlobalVariable
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImplicitGlobalVariable extends DefinitionType {
  var node: Program
  var parent: Null
  var `type`: ImplicitGlobalVariable
}

object Anon_ImplicitGlobalVariable {
  @scala.inline
  def apply(node: Program, parent: Null, `type`: ImplicitGlobalVariable): Anon_ImplicitGlobalVariable = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImplicitGlobalVariable]
  }
}

