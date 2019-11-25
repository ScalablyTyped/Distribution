package typings.eslint

import typings.eslint.eslintMod.Scope.DefinitionType
import typings.estree.estreeMod.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatchClause extends DefinitionType {
  var node: CatchClause
  var parent: Null
  var `type`: typings.eslint.eslintStrings.CatchClause
}

object Anon_CatchClause {
  @scala.inline
  def apply(node: CatchClause, parent: Null, `type`: typings.eslint.eslintStrings.CatchClause): Anon_CatchClause = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CatchClause]
  }
}

