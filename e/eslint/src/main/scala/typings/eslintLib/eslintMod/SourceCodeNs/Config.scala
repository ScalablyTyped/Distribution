package typings
package eslintLib.eslintMod.SourceCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ast: eslintLib.eslintMod.ASTNs.Program
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  var scopeManager: js.UndefOr[eslintLib.eslintMod.ScopeNs.ScopeManager] = js.undefined
  var text: java.lang.String
  var visitorKeys: js.UndefOr[VisitorKeys] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ast: eslintLib.eslintMod.ASTNs.Program,
    text: java.lang.String,
    parserServices: ParserServices = null,
    scopeManager: eslintLib.eslintMod.ScopeNs.ScopeManager = null,
    visitorKeys: VisitorKeys = null
  ): Config = {
    val __obj = js.Dynamic.literal(ast = ast, text = text)
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices)
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager)
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys)
    __obj.asInstanceOf[Config]
  }
}

