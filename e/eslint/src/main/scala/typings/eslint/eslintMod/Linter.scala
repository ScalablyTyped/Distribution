package typings.eslint.eslintMod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.eslintMod.LinterNs.Config
import typings.eslint.eslintMod.LinterNs.FixOptions
import typings.eslint.eslintMod.LinterNs.FixReport
import typings.eslint.eslintMod.LinterNs.LintMessage
import typings.eslint.eslintMod.LinterNs.LintOptions
import typings.eslint.eslintMod.LinterNs.ParserModule
import typings.eslint.eslintMod.RuleNs.RuleModule
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "Linter")
@js.native
class Linter () extends js.Object {
  var version: String = js.native
  def defineParser(name: String, parser: ParserModule): Unit = js.native
  def defineRule(name: String, rule: RuleModule): Unit = js.native
  def defineRules(rules: StringDictionary[RuleModule]): Unit = js.native
  def getRules(): Map[String, RuleModule] = js.native
  def getSourceCode(): SourceCode = js.native
  def verify(code: String, config: Config): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  def verifyAndFix(code: String, config: Config): FixReport = js.native
  def verifyAndFix(code: String, config: Config, filename: String): FixReport = js.native
  def verifyAndFix(code: String, config: Config, options: FixOptions): FixReport = js.native
}

