package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinesOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffTrimmedLines()`.
    */
  var ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to treat newline characters as separate tokens. This allows for changes to the newline structure
    * to occur independently of the line content and to be treated as such. In general this is the more
    * human friendly form of `diffLines()` and `diffLines()` is better suited for patches and other computer
    * friendly output.
    */
  var newlineIsToken: js.UndefOr[scala.Boolean] = js.undefined
}

object LinesOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    newlineIsToken: js.UndefOr[scala.Boolean] = js.undefined
  ): LinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace)
    if (!js.isUndefined(newlineIsToken)) __obj.updateDynamic("newlineIsToken")(newlineIsToken)
    __obj.asInstanceOf[LinesOptions]
  }
}

