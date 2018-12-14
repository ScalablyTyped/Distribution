package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
object CLIEngineNs extends js.Object {
  
  trait LintReport extends js.Object {
    var errorCount: scala.Double
    var fixableErrorCount: scala.Double
    var fixableWarningCount: scala.Double
    var results: js.Array[LintResult]
    var warningCount: scala.Double
  }
  
  
  trait LintResult extends js.Object {
    var errorCount: scala.Double
    var filePath: java.lang.String
    var fixableErrorCount: scala.Double
    var fixableWarningCount: scala.Double
    var messages: js.Array[eslintLib.eslintMod.LinterNs.LintMessage]
    var output: js.UndefOr[java.lang.String] = js.undefined
    var source: js.UndefOr[java.lang.String] = js.undefined
    var warningCount: scala.Double
  }
  
  @js.native
  class Options () extends js.Object {
    var allowInlineConfig: js.UndefOr[scala.Boolean] = js.native
    var baseConfig: js.UndefOr[
        eslintLib.eslintLibNumbers.`false` | org.scalablytyped.runtime.StringDictionary[js.Any]
      ] = js.native
    var cache: js.UndefOr[scala.Boolean] = js.native
    var cacheFile: js.UndefOr[java.lang.String] = js.native
    var cacheLocation: js.UndefOr[java.lang.String] = js.native
    var configFile: js.UndefOr[java.lang.String] = js.native
    var cwd: js.UndefOr[java.lang.String] = js.native
    var envs: js.UndefOr[js.Array[java.lang.String]] = js.native
    var extensions: js.UndefOr[js.Array[java.lang.String]] = js.native
    var fix: js.UndefOr[scala.Boolean] = js.native
    var globals: js.UndefOr[js.Array[java.lang.String]] = js.native
    var ignore: js.UndefOr[scala.Boolean] = js.native
    var ignorePath: js.UndefOr[java.lang.String] = js.native
    var ignorePattern: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
    var parser: js.UndefOr[java.lang.String] = js.native
    var parserOptions: js.UndefOr[eslintLib.eslintMod.LinterNs.ParserOptions] = js.native
    var plugins: js.UndefOr[js.Array[java.lang.String]] = js.native
    var reportUnusedDisableDirectives: js.UndefOr[scala.Boolean] = js.native
    var rulePaths: js.UndefOr[js.Array[java.lang.String]] = js.native
    var rules: js.UndefOr[
        org.scalablytyped.runtime.StringDictionary[
          eslintLib.eslintMod.LinterNs.RuleLevel | eslintLib.eslintMod.LinterNs.RuleLevelAndOptions
        ]
      ] = js.native
    var useEslintrc: js.UndefOr[scala.Boolean] = js.native
  }
  
  type Formatter = js.Function1[/* results */ js.Array[LintResult], java.lang.String]
}

