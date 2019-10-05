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

trait DefinitionType extends js.Object {
  var node: js.UndefOr[
    js.Any | ArrowFunctionExpression | CatchClause | ClassDeclaration | ClassExpression | FunctionDeclaration | FunctionExpression | ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier | Program | VariableDeclarator
  ] = js.undefined
  var parent: js.UndefOr[ImportDeclaration | Null | VariableDeclaration] = js.undefined
  var `type`: js.UndefOr[
    typings.eslint.eslintStrings.CatchClause | ClassName | FunctionName | ImplicitGlobalVariable | ImportBinding | Parameter | TDZ | typings.eslint.eslintStrings.Variable
  ] = js.undefined
}

object DefinitionType {
  @scala.inline
  def apply(
    node: CatchClause = null,
    parent: Null = null,
    `type`: typings.eslint.eslintStrings.CatchClause = null
  ): DefinitionType = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefinitionType]
  }
}

