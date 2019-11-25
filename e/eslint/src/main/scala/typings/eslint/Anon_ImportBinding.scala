package typings.eslint

import typings.eslint.eslintMod.Scope.DefinitionType
import typings.eslint.eslintStrings.ImportBinding
import typings.estree.estreeMod.ImportDeclaration
import typings.estree.estreeMod.ImportDefaultSpecifier
import typings.estree.estreeMod.ImportNamespaceSpecifier
import typings.estree.estreeMod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportBinding extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier
  var parent: ImportDeclaration
  var `type`: ImportBinding
}

object Anon_ImportBinding {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): Anon_ImportBinding = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImportBinding]
  }
}

