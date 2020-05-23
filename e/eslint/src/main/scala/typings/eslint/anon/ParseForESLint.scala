package typings.eslint.anon

import typings.eslint.mod.Linter.ESLintParseResult
import typings.eslint.mod.Linter.ParserModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseForESLint extends ParserModule {
  def parseForESLint(text: String): ESLintParseResult = js.native
  def parseForESLint(text: String, options: js.Any): ESLintParseResult = js.native
}

