package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatchClause
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.CatchClause
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.CatchClause
}

object Anon_CatchClause {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.CatchClause,
    parent: scala.Null,
    `type`: eslintLib.eslintLibStrings.CatchClause
  ): Anon_CatchClause = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_CatchClause]
  }
}

