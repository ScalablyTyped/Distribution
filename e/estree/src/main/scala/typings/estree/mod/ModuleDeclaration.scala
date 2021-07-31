package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ImportDeclaration
  - typings.estree.mod.ExportNamedDeclaration
  - typings.estree.mod.ExportDefaultDeclaration
  - typings.estree.mod.ExportAllDeclaration
*/
trait ModuleDeclaration
  extends StObject
     with Node
object ModuleDeclaration {
  
  @scala.inline
  def ExportAllDeclaration(source: Literal): typings.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(declaration: Declaration | Expression): typings.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration(specifiers: js.Array[ExportSpecifier]): typings.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  ): typings.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ImportDeclaration]
  }
}
