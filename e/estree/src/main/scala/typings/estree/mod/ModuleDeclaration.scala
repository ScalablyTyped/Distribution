package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ImportDeclaration
  - typings.estree.mod.ExportNamedDeclaration
  - typings.estree.mod.ExportDefaultDeclaration
  - typings.estree.mod.ExportAllDeclaration
*/
trait ModuleDeclaration extends Node

object ModuleDeclaration {
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typings.estree.estreeStrings.ImportDeclaration
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ExportNamedDeclaration(specifiers: js.Array[ExportSpecifier], `type`: typings.estree.estreeStrings.ExportNamedDeclaration): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: Declaration | Expression,
    `type`: typings.estree.estreeStrings.ExportDefaultDeclaration
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ExportAllDeclaration(source: Literal, `type`: typings.estree.estreeStrings.ExportAllDeclaration): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
}

