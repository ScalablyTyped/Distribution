package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESLintParseResult extends js.Object {
  var ast: eslintLib.eslintMod.ASTNs.Program
  var parserServices: js.UndefOr[eslintLib.eslintMod.SourceCodeNs.ParserServices] = js.undefined
  var scopeManager: js.UndefOr[eslintLib.eslintMod.ScopeNs.ScopeManager] = js.undefined
  var visitorKeys: js.UndefOr[eslintLib.eslintMod.SourceCodeNs.VisitorKeys] = js.undefined
}

object ESLintParseResult {
  @scala.inline
  def apply(
    ast: eslintLib.eslintMod.ASTNs.Program,
    parserServices: eslintLib.eslintMod.SourceCodeNs.ParserServices = null,
    scopeManager: eslintLib.eslintMod.ScopeNs.ScopeManager = null,
    visitorKeys: eslintLib.eslintMod.SourceCodeNs.VisitorKeys = null
  ): ESLintParseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices)
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager)
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys)
    __obj.asInstanceOf[ESLintParseResult]
  }
}

