package typings.eslint.eslintMod.RuleTesterNs

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.eslintMod.LinterNs.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidTestCase extends js.Object {
  var code: String
  var filename: js.UndefOr[String] = js.undefined
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ValidTestCase {
  @scala.inline
  def apply(
    code: String,
    filename: String = null,
    globals: StringDictionary[Boolean] = null,
    options: js.Any = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    settings: StringDictionary[js.Any] = null
  ): ValidTestCase = {
    val __obj = js.Dynamic.literal(code = code)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (options != null) __obj.updateDynamic("options")(options)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ValidTestCase]
  }
}

