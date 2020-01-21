package typings.eslint.mod.CLIEngine

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.eslintBooleans.`false`
import typings.eslint.mod.Linter.ParserOptions
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Linter.RuleLevelAndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine.Options")
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
  var resolvePluginsRelativeTo: js.UndefOr[String] = js.native
  var rulePaths: js.UndefOr[js.Array[String]] = js.native
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.native
  var useEslintrc: js.UndefOr[Boolean] = js.native
}

