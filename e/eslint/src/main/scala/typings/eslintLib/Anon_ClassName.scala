package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.ClassDeclaration | estreeLib.estreeMod.ClassExpression
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.ClassName
}

object Anon_ClassName {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.ClassDeclaration | estreeLib.estreeMod.ClassExpression,
    parent: scala.Null,
    `type`: eslintLib.eslintLibStrings.ClassName
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

