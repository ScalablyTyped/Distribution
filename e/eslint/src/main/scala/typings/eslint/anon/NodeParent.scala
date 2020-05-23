package typings.eslint.anon

import typings.eslint.eslintStrings.ImplicitGlobalVariable
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeParent extends DefinitionType {
  var node: Program
  var parent: Null
  var `type`: ImplicitGlobalVariable
}

object NodeParent {
  @scala.inline
  def apply(node: Program, parent: Null, `type`: ImplicitGlobalVariable): NodeParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParent]
  }
}

