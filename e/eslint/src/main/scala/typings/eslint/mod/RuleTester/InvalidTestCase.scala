package typings.eslint.mod.RuleTester

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.ParserOptions
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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTestCase]
  }
}

