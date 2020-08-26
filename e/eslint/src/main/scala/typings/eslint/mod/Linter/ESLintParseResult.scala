package typings.eslint.mod.Linter

import typings.eslint.mod.AST.Program
import typings.eslint.mod.Scope.ScopeManager
import typings.eslint.mod.SourceCode.ParserServices
import typings.eslint.mod.SourceCode.VisitorKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESLintParseResult extends js.Object {
  var ast: Program = js.native
  var parserServices: js.UndefOr[ParserServices] = js.native
  var scopeManager: js.UndefOr[ScopeManager] = js.native
  var visitorKeys: js.UndefOr[VisitorKeys] = js.native
}

object ESLintParseResult {
  @scala.inline
  def apply(ast: Program): ESLintParseResult = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESLintParseResult]
  }
  @scala.inline
  implicit class ESLintParseResultOps[Self <: ESLintParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAst(value: Program): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserServices(value: ParserServices): Self = this.set("parserServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserServices: Self = this.set("parserServices", js.undefined)
    @scala.inline
    def setScopeManager(value: ScopeManager): Self = this.set("scopeManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeManager: Self = this.set("scopeManager", js.undefined)
    @scala.inline
    def setVisitorKeys(value: VisitorKeys): Self = this.set("visitorKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitorKeys: Self = this.set("visitorKeys", js.undefined)
  }
  
}

