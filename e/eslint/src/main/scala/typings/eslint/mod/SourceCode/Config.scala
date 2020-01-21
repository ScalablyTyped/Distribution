package typings.eslint.mod.SourceCode

import typings.eslint.mod.AST.Program
import typings.eslint.mod.Scope.ScopeManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ast: Program
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  var scopeManager: js.UndefOr[ScopeManager] = js.undefined
  var text: String
  var visitorKeys: js.UndefOr[VisitorKeys] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ast: Program,
    text: String,
    parserServices: ParserServices = null,
    scopeManager: ScopeManager = null,
    visitorKeys: VisitorKeys = null
  ): Config = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices.asInstanceOf[js.Any])
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager.asInstanceOf[js.Any])
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

