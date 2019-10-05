package typings.eslint.eslintMod.RuleTester

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.eslintMod.Linter.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTestCase extends ValidTestCase {
  var errors: Double | (js.Array[TestCaseError | String])
  var output: js.UndefOr[String | Null] = js.undefined
}

object InvalidTestCase {
  @scala.inline
  def apply(
    code: String,
    errors: Double | (js.Array[TestCaseError | String]),
    filename: String = null,
    globals: StringDictionary[Boolean] = null,
    options: js.Any = null,
    output: String = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    settings: StringDictionary[js.Any] = null
  ): InvalidTestCase = {
    val __obj = js.Dynamic.literal(code = code, errors = errors.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (options != null) __obj.updateDynamic("options")(options)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[InvalidTestCase]
  }
}

