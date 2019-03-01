package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportBinding
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: estreeLib.estreeMod.ImportSpecifier | estreeLib.estreeMod.ImportDefaultSpecifier | estreeLib.estreeMod.ImportNamespaceSpecifier
  var parent: estreeLib.estreeMod.ImportDeclaration
  var `type`: eslintLib.eslintLibStrings.ImportBinding
}

object Anon_ImportBinding {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.ImportSpecifier | estreeLib.estreeMod.ImportDefaultSpecifier | estreeLib.estreeMod.ImportNamespaceSpecifier,
    parent: estreeLib.estreeMod.ImportDeclaration,
    `type`: eslintLib.eslintLibStrings.ImportBinding
  ): Anon_ImportBinding = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_ImportBinding]
  }
}

