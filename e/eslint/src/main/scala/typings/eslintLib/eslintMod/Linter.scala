package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "Linter")
@js.native
class Linter () extends js.Object {
  var version: java.lang.String = js.native
  def defineParser(name: java.lang.String, parser: eslintLib.eslintMod.LinterNs.ParserModule): scala.Unit = js.native
  def defineRule(name: java.lang.String, rule: eslintLib.eslintMod.RuleNs.RuleModule): scala.Unit = js.native
  def defineRules(rules: ScalablyTyped.runtime.StringDictionary[eslintLib.eslintMod.RuleNs.RuleModule]): scala.Unit = js.native
  def getRules(): stdLib.Map[java.lang.String, eslintLib.eslintMod.RuleNs.RuleModule] = js.native
  def getSourceCode(): SourceCode = js.native
  def verify(code: SourceCode, config: eslintLib.eslintMod.LinterNs.Config): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verify(code: SourceCode, config: eslintLib.eslintMod.LinterNs.Config, filename: java.lang.String): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verify(
    code: SourceCode,
    config: eslintLib.eslintMod.LinterNs.Config,
    options: eslintLib.eslintMod.LinterNs.LintOptions
  ): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verify(code: java.lang.String, config: eslintLib.eslintMod.LinterNs.Config): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verify(code: java.lang.String, config: eslintLib.eslintMod.LinterNs.Config, filename: java.lang.String): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verify(
    code: java.lang.String,
    config: eslintLib.eslintMod.LinterNs.Config,
    options: eslintLib.eslintMod.LinterNs.LintOptions
  ): js.Array[eslintLib.eslintMod.LinterNs.LintMessage] = js.native
  def verifyAndFix(code: java.lang.String, config: eslintLib.eslintMod.LinterNs.Config): eslintLib.eslintMod.LinterNs.FixReport = js.native
  def verifyAndFix(code: java.lang.String, config: eslintLib.eslintMod.LinterNs.Config, filename: java.lang.String): eslintLib.eslintMod.LinterNs.FixReport = js.native
  def verifyAndFix(
    code: java.lang.String,
    config: eslintLib.eslintMod.LinterNs.Config,
    options: eslintLib.eslintMod.LinterNs.FixOptions
  ): eslintLib.eslintMod.LinterNs.FixReport = js.native
}

