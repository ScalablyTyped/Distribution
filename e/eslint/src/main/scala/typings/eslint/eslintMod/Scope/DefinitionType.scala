package typings.eslint.eslintMod.Scope

import typings.eslint.eslintStrings.ClassName
import typings.eslint.eslintStrings.FunctionName
import typings.eslint.eslintStrings.ImplicitGlobalVariable
import typings.eslint.eslintStrings.ImportBinding
import typings.eslint.eslintStrings.Parameter
import typings.eslint.eslintStrings.TDZ
import typings.estree.estreeMod.ArrowFunctionExpression
import typings.estree.estreeMod.CatchClause
import typings.estree.estreeMod.ClassDeclaration
import typings.estree.estreeMod.ClassExpression
import typings.estree.estreeMod.FunctionDeclaration
import typings.estree.estreeMod.FunctionExpression
import typings.estree.estreeMod.ImportDeclaration
import typings.estree.estreeMod.ImportDefaultSpecifier
import typings.estree.estreeMod.ImportNamespaceSpecifier
import typings.estree.estreeMod.ImportSpecifier
import typings.estree.estreeMod.Program
import typings.estree.estreeMod.VariableDeclaration
import typings.estree.estreeMod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.Anon_CatchClause
  - typings.eslint.Anon_ClassName
  - typings.eslint.Anon_FunctionName
  - typings.eslint.Anon_ImplicitGlobalVariable
  - typings.eslint.Anon_ImportBinding
  - typings.eslint.Anon_Node
  - typings.eslint.Anon_NodeParent
  - typings.eslint.Anon_NodeParentType
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def Anon_ImplicitGlobalVariable(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_NodeParent(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_FunctionName(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_CatchClause(node: CatchClause, parent: Null, `type`: typings.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_ImportBinding(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_ClassName(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_Node(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_NodeParentType(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typings.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}

