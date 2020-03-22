package typings.eslint

import typings.eslint.eslintStrings.TDZ
import typings.eslint.mod.Scope.DefinitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeAny extends DefinitionType {
  var node: js.Any
  var parent: Null
  var `type`: TDZ
}

object AnonNodeAny {
  @scala.inline
  def apply(node: js.Any, parent: Null, `type`: TDZ): AnonNodeAny = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeAny]
  }
}

