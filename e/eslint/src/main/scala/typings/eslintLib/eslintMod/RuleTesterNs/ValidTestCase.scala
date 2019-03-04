package typings
package eslintLib.eslintMod.RuleTesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidTestCase extends js.Object {
  var code: java.lang.String
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var globals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var parser: js.UndefOr[java.lang.String] = js.undefined
  var parserOptions: js.UndefOr[eslintLib.eslintMod.LinterNs.ParserOptions] = js.undefined
  var settings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object ValidTestCase {
  @scala.inline
  def apply(
    code: java.lang.String,
    filename: java.lang.String = null,
    globals: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    options: js.Any = null,
    parser: java.lang.String = null,
    parserOptions: eslintLib.eslintMod.LinterNs.ParserOptions = null,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

