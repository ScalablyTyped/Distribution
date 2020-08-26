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

@js.native
trait Options extends js.Object {
  // Linting
  var allowInlineConfig: js.UndefOr[Boolean] = js.native
  var baseConfig: js.UndefOr[Config] = js.native
  // Cache-related
  var cache: js.UndefOr[Boolean] = js.native
  var cacheLocation: js.UndefOr[String] = js.native
  // File enumeration
  var cwd: js.UndefOr[String] = js.native
  var errorOnUnmatchedPattern: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  // Autofix
  var fix: js.UndefOr[Boolean | (js.Function1[/* message */ LintMessage, Boolean])] = js.native
  var fixTypes: js.UndefOr[js.Array[js.UndefOr[problem | suggestion | layout]]] = js.native
  var globInputPaths: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  var ignorePath: js.UndefOr[String] = js.native
  var overrideConfig: js.UndefOr[Config] = js.native
  var overrideConfigFile: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[Record[String, _]] = js.native
  var reportUnusedDisableDirectives: js.UndefOr[RuleLevel] = js.native
  var resolvePluginsRelativeTo: js.UndefOr[String] = js.native
  var rulePaths: js.UndefOr[js.Array[String]] = js.native
  var useEslintrc: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowInlineConfig(value: Boolean): Self = this.set("allowInlineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInlineConfig: Self = this.set("allowInlineConfig", js.undefined)
    @scala.inline
    def setBaseConfig(value: Config): Self = this.set("baseConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseConfig: Self = this.set("baseConfig", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheLocation(value: String): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setErrorOnUnmatchedPattern(value: Boolean): Self = this.set("errorOnUnmatchedPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorOnUnmatchedPattern: Self = this.set("errorOnUnmatchedPattern", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFixFunction1(value: /* message */ LintMessage => Boolean): Self = this.set("fix", js.Any.fromFunction1(value))
    @scala.inline
    def setFix(value: Boolean | (js.Function1[/* message */ LintMessage, Boolean])): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setFixTypesVarargs(value: (js.UndefOr[problem | suggestion | layout])*): Self = this.set("fixTypes", js.Array(value :_*))
    @scala.inline
    def setFixTypes(value: js.Array[js.UndefOr[problem | suggestion | layout]]): Self = this.set("fixTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixTypes: Self = this.set("fixTypes", js.undefined)
    @scala.inline
    def setGlobInputPaths(value: Boolean): Self = this.set("globInputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobInputPaths: Self = this.set("globInputPaths", js.undefined)
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnorePath(value: String): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    @scala.inline
    def setOverrideConfig(value: Config): Self = this.set("overrideConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideConfig: Self = this.set("overrideConfig", js.undefined)
    @scala.inline
    def setOverrideConfigFile(value: String): Self = this.set("overrideConfigFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideConfigFile: Self = this.set("overrideConfigFile", js.undefined)
    @scala.inline
    def setPlugins(value: Record[String, _]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setReportUnusedDisableDirectives(value: RuleLevel): Self = this.set("reportUnusedDisableDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUnusedDisableDirectives: Self = this.set("reportUnusedDisableDirectives", js.undefined)
    @scala.inline
    def setResolvePluginsRelativeTo(value: String): Self = this.set("resolvePluginsRelativeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvePluginsRelativeTo: Self = this.set("resolvePluginsRelativeTo", js.undefined)
    @scala.inline
    def setRulePathsVarargs(value: String*): Self = this.set("rulePaths", js.Array(value :_*))
    @scala.inline
    def setRulePaths(value: js.Array[String]): Self = this.set("rulePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulePaths: Self = this.set("rulePaths", js.undefined)
    @scala.inline
    def setUseEslintrc(value: Boolean): Self = this.set("useEslintrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEslintrc: Self = this.set("useEslintrc", js.undefined)
  }
  
}

