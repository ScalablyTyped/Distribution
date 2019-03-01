package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions extends LinesOptions {
  /**
    * Replacer used to stringify the properties of the passed objects.
    */
  var stringifyReplacer: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  /**
    * The value to use when `undefined` values in the passed objects are encountered during stringification.
    * Will only be used if `stringifyReplacer` option wasn't specified.
    * @default undefined
    */
  var undefinedReplacement: js.UndefOr[js.Any] = js.undefined
}

object JsonOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    newlineIsToken: js.UndefOr[scala.Boolean] = js.undefined,
    stringifyReplacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = null,
    undefinedReplacement: js.Any = null
  ): JsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace)
    if (!js.isUndefined(newlineIsToken)) __obj.updateDynamic("newlineIsToken")(newlineIsToken)
    if (stringifyReplacer != null) __obj.updateDynamic("stringifyReplacer")(stringifyReplacer)
    if (undefinedReplacement != null) __obj.updateDynamic("undefinedReplacement")(undefinedReplacement)
    __obj.asInstanceOf[JsonOptions]
  }
}

