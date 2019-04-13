package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionType extends js.Object {
  var node: js.UndefOr[
    js.Any | estreeLib.estreeMod.ArrowFunctionExpression | estreeLib.estreeMod.CatchClause | estreeLib.estreeMod.ClassDeclaration | estreeLib.estreeMod.ClassExpression | estreeLib.estreeMod.FunctionDeclaration | estreeLib.estreeMod.FunctionExpression | estreeLib.estreeMod.ImportDefaultSpecifier | estreeLib.estreeMod.ImportNamespaceSpecifier | estreeLib.estreeMod.ImportSpecifier | estreeLib.estreeMod.Program | estreeLib.estreeMod.VariableDeclarator
  ] = js.native
  var parent: js.UndefOr[
    estreeLib.estreeMod.ImportDeclaration | scala.Null | estreeLib.estreeMod.VariableDeclaration
  ] = js.native
  var `type`: js.UndefOr[
    eslintLib.eslintLibStrings.CatchClause | eslintLib.eslintLibStrings.ClassName | eslintLib.eslintLibStrings.FunctionName | eslintLib.eslintLibStrings.ImplicitGlobalVariable | eslintLib.eslintLibStrings.ImportBinding | eslintLib.eslintLibStrings.Parameter | eslintLib.eslintLibStrings.TDZ | eslintLib.eslintLibStrings.Variable
  ] = js.native
}

