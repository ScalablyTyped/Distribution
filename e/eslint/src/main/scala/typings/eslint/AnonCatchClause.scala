package typings.eslint

import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCatchClause extends DefinitionType {
  var node: CatchClause
  var parent: Null
  var `type`: typings.eslint.eslintStrings.CatchClause
}

object AnonCatchClause {
  @scala.inline
  def apply(node: CatchClause, parent: Null, `type`: typings.eslint.eslintStrings.CatchClause): AnonCatchClause = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCatchClause]
  }
}

