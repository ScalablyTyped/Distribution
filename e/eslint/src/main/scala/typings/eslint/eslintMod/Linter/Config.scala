package typings.eslint.eslintMod.Linter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends HasRules {
  var env: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var overrides: js.UndefOr[js.Array[RuleOverride]] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var processor: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[Boolean] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    env: StringDictionary[Boolean] = null,
    `extends`: String | js.Array[String] = null,
    globals: StringDictionary[Boolean] = null,
    overrides: js.Array[RuleOverride] = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    plugins: js.Array[String] = null,
    processor: String = null,
    root: js.UndefOr[Boolean] = js.undefined,
    rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null,
    settings: StringDictionary[js.Any] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (processor != null) __obj.updateDynamic("processor")(processor.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

