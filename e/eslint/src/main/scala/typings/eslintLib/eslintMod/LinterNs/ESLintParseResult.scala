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

