package typings
package eslintLib.eslintMod.RuleTesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTestCase extends ValidTestCase {
  var errors: scala.Double | (js.Array[TestCaseError | java.lang.String])
  var output: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object InvalidTestCase {
  @scala.inline
  def apply(
    code: java.lang.String,
    errors: scala.Double | (js.Array[TestCaseError | java.lang.String]),
    filename: java.lang.String = null,
    globals: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    options: js.Any = null,
    output: java.lang.String = null,
    parser: java.lang.String = null,
    parserOptions: eslintLib.eslintMod.LinterNs.ParserOptions = null,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

