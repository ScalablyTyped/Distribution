package typings.eslint.mod.Linter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConfig extends HasRules {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var noInlineConfig: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[js.Array[ConfigOverride]] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var processor: js.UndefOr[String] = js.undefined
  var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object BaseConfig {
  @scala.inline
  def apply(
    $schema: String = null,
    env: StringDictionary[Boolean] = null,
    `extends`: String | js.Array[String] = null,
    globals: StringDictionary[Boolean] = null,
    noInlineConfig: js.UndefOr[Boolean] = js.undefined,
    overrides: js.Array[ConfigOverride] = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    plugins: js.Array[String] = null,
    processor: String = null,
    reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined,
    rules: js.Object = null,
    settings: StringDictionary[js.Any] = null
  ): BaseConfig = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(noInlineConfig)) __obj.updateDynamic("noInlineConfig")(noInlineConfig.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (processor != null) __obj.updateDynamic("processor")(processor.asInstanceOf[js.Any])
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfig]
  }
}

