package typings.eslint.eslintMod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.eslintMod.CLIEngineNs.LintResult
import typings.eslint.eslintMod.LinterNs.LintMessage
import typings.eslint.eslintMod.LinterNs.ParserOptions
import typings.eslint.eslintMod.LinterNs.RuleLevel
import typings.eslint.eslintMod.LinterNs.RuleLevelAndOptions
import typings.eslint.eslintNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
object CLIEngineNs extends js.Object {
  trait LintReport extends js.Object {
    var errorCount: Double
    var fixableErrorCount: Double
    var fixableWarningCount: Double
    var results: js.Array[LintResult]
    var warningCount: Double
  }
  
  trait LintResult extends js.Object {
    var errorCount: Double
    var filePath: String
    var fixableErrorCount: Double
    var fixableWarningCount: Double
    var messages: js.Array[LintMessage]
    var output: js.UndefOr[String] = js.undefined
    var source: js.UndefOr[String] = js.undefined
    var warningCount: Double
  }
  
  @js.native
  class Options () extends js.Object {
    var allowInlineConfig: js.UndefOr[Boolean] = js.native
    var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
    var cache: js.UndefOr[Boolean] = js.native
    var cacheFile: js.UndefOr[String] = js.native
    var cacheLocation: js.UndefOr[String] = js.native
    var configFile: js.UndefOr[String] = js.native
    var cwd: js.UndefOr[String] = js.native
    var envs: js.UndefOr[js.Array[String]] = js.native
    var extensions: js.UndefOr[js.Array[String]] = js.native
    var fix: js.UndefOr[Boolean] = js.native
    var globals: js.UndefOr[js.Array[String]] = js.native
    var ignore: js.UndefOr[Boolean] = js.native
    var ignorePath: js.UndefOr[String] = js.native
    var ignorePattern: js.UndefOr[String | js.Array[String]] = js.native
    var parser: js.UndefOr[String] = js.native
    var parserOptions: js.UndefOr[ParserOptions] = js.native
    var plugins: js.UndefOr[js.Array[String]] = js.native
    var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.native
    var rulePaths: js.UndefOr[js.Array[String]] = js.native
    var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.native
    var useEslintrc: js.UndefOr[Boolean] = js.native
  }
  
  type Formatter = js.Function1[/* results */ js.Array[LintResult], String]
}

