package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var globals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var parser: js.UndefOr[java.lang.String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var rules: js.UndefOr[org.scalablytyped.runtime.StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.undefined
  var settings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    env: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    globals: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    parser: java.lang.String = null,
    parserOptions: ParserOptions = null,
    rules: org.scalablytyped.runtime.StringDictionary[RuleLevel | RuleLevelAndOptions] = null,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Config]
  }
}

