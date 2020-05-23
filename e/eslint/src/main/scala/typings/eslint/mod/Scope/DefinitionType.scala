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
  - typings.eslint.anon.Node
  - typings.eslint.anon.Parent
  - typings.eslint.anon.Type
  - typings.eslint.anon.NodeParent
  - typings.eslint.anon.ParentType
  - typings.eslint.anon.NodeParentType
  - typings.eslint.anon.NodeAny
  - typings.eslint.anon.NodeVariableDeclarator
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def Parent(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Node(node: CatchClause, parent: Null, `type`: typings.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeAny(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Type(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeParentType(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeParent(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeVariableDeclarator(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typings.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def ParentType(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}

