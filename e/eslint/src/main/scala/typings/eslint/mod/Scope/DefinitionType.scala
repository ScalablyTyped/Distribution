package typings.eslint.mod.Scope

import typings.eslint.eslintStrings.ClassName
import typings.eslint.eslintStrings.FunctionName
import typings.eslint.eslintStrings.ImplicitGlobalVariable
import typings.eslint.eslintStrings.ImportBinding
import typings.eslint.eslintStrings.Parameter
import typings.eslint.eslintStrings.TDZ
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.CatchClause
import typings.estree.mod.ClassDeclaration
import typings.estree.mod.ClassExpression
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import typings.estree.mod.ImportDeclaration
import typings.estree.mod.ImportDefaultSpecifier
import typings.estree.mod.ImportNamespaceSpecifier
import typings.estree.mod.ImportSpecifier
import typings.estree.mod.Program
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.AnonCatchClause
  - typings.eslint.AnonClassName
  - typings.eslint.AnonFunctionName
  - typings.eslint.AnonImplicitGlobalVariable
  - typings.eslint.AnonImportBinding
  - typings.eslint.AnonNode
  - typings.eslint.AnonNodeParent
  - typings.eslint.AnonNodeParentType
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def AnonNodeParentType(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typings.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonImplicitGlobalVariable(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonCatchClause(node: CatchClause, parent: Null, `type`: typings.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNode(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonClassName(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNodeParent(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonImportBinding(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonFunctionName(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}

