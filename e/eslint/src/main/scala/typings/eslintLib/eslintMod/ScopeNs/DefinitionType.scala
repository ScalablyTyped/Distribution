package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionType extends js.Object {
  var node: js.UndefOr[
    js.Any | estreeLib.estreeMod.ArrowFunctionExpression | estreeLib.estreeMod.CatchClause | estreeLib.estreeMod.ClassDeclaration | estreeLib.estreeMod.ClassExpression | estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression | estreeLib.estreeMod.ImportDefaultSpecifier | estreeLib.estreeMod.ImportNamespaceSpecifier | estreeLib.estreeMod.ImportSpecifier | estreeLib.estreeMod.Program | estreeLib.estreeMod.VariableDeclarator
  ] = js.undefined
  var parent: js.UndefOr[
    estreeLib.estreeMod.ImportDeclaration | scala.Null | estreeLib.estreeMod.VariableDeclaration
  ] = js.undefined
  var `type`: js.UndefOr[
    eslintLib.eslintLibStrings.CatchClause | eslintLib.eslintLibStrings.ClassName | eslintLib.eslintLibStrings.FunctionName | eslintLib.eslintLibStrings.ImplicitGlobalVariable | eslintLib.eslintLibStrings.ImportBinding | eslintLib.eslintLibStrings.Parameter | eslintLib.eslintLibStrings.TDZ | eslintLib.eslintLibStrings.Variable
  ] = js.undefined
}

object DefinitionType {
  @scala.inline
  def apply(
    node: estreeLib.estreeMod.CatchClause = null,
    parent: scala.Null = null,
    `type`: eslintLib.eslintLibStrings.CatchClause = null
  ): DefinitionType = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefinitionType]
  }
}

