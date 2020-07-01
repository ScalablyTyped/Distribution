package typings.eslint.mod.ESLint

import typings.eslint.eslintStrings.layout
import typings.eslint.eslintStrings.problem
import typings.eslint.eslintStrings.suggestion
import typings.eslint.mod.Linter.Config
import typings.eslint.mod.Linter.LintMessage
import typings.eslint.mod.Linter.RuleLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Linting
  var allowInlineConfig: js.UndefOr[Boolean] = js.undefined
  var baseConfig: js.UndefOr[Config] = js.undefined
  // Cache-related
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheLocation: js.UndefOr[String] = js.undefined
  // File enumeration
  var cwd: js.UndefOr[String] = js.undefined
  var errorOnUnmatchedPattern: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  // Autofix
  var fix: js.UndefOr[Boolean | (js.Function1[/* message */ LintMessage, Boolean])] = js.undefined
  var fixTypes: js.UndefOr[js.Array[js.UndefOr[problem | suggestion | layout]]] = js.undefined
  var globInputPaths: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[Boolean] = js.undefined
  var ignorePath: js.UndefOr[String] = js.undefined
  var overrideConfig: js.UndefOr[Config] = js.undefined
  var overrideConfigFile: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[Record[String, _]] = js.undefined
  var reportUnusedDisableDirectives: js.UndefOr[RuleLevel] = js.undefined
  var resolvePluginsRelativeTo: js.UndefOr[String] = js.undefined
  var rulePaths: js.UndefOr[js.Array[String]] = js.undefined
  var useEslintrc: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[Boolean] = js.undefined,
    baseConfig: Config = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheLocation: String = null,
    cwd: String = null,
    errorOnUnmatchedPattern: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    fix: Boolean | (js.Function1[/* message */ LintMessage, Boolean]) = null,
    fixTypes: js.Array[js.UndefOr[problem | suggestion | layout]] = null,
    globInputPaths: js.UndefOr[Boolean] = js.undefined,
    ignore: js.UndefOr[Boolean] = js.undefined,
    ignorePath: String = null,
    overrideConfig: Config = null,
    overrideConfigFile: String = null,
    plugins: Record[String, _] = null,
    reportUnusedDisableDirectives: RuleLevel = null,
    resolvePluginsRelativeTo: String = null,
    rulePaths: js.Array[String] = null,
    useEslintrc: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig.get.asInstanceOf[js.Any])
    if (baseConfig != null) __obj.updateDynamic("baseConfig")(baseConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnUnmatchedPattern)) __obj.updateDynamic("errorOnUnmatchedPattern")(errorOnUnmatchedPattern.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (fixTypes != null) __obj.updateDynamic("fixTypes")(fixTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(globInputPaths)) __obj.updateDynamic("globInputPaths")(globInputPaths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (overrideConfig != null) __obj.updateDynamic("overrideConfig")(overrideConfig.asInstanceOf[js.Any])
    if (overrideConfigFile != null) __obj.updateDynamic("overrideConfigFile")(overrideConfigFile.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (reportUnusedDisableDirectives != null) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives.asInstanceOf[js.Any])
    if (resolvePluginsRelativeTo != null) __obj.updateDynamic("resolvePluginsRelativeTo")(resolvePluginsRelativeTo.asInstanceOf[js.Any])
    if (rulePaths != null) __obj.updateDynamic("rulePaths")(rulePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(useEslintrc)) __obj.updateDynamic("useEslintrc")(useEslintrc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

