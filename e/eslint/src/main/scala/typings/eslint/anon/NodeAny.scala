package typings.eslint.anon

import typings.eslint.eslintStrings.TDZ
import typings.eslint.mod.Scope.DefinitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAny extends DefinitionType {
  var node: js.Any
  var parent: Null
  var `type`: TDZ
}

object NodeAny {
  @scala.inline
  def apply(node: js.Any, parent: Null, `type`: TDZ): NodeAny = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAny]
  }
}

