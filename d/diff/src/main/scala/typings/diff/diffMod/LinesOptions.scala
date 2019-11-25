package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinesOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffTrimmedLines()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * `true` to treat newline characters as separate tokens. This allows for changes to the newline structure
    * to occur independently of the line content and to be treated as such. In general this is the more
    * human friendly form of `diffLines()` and `diffLines()` is better suited for patches and other computer
    * friendly output.
    */
  var newlineIsToken: js.UndefOr[Boolean] = js.undefined
}

object LinesOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[Boolean] = js.undefined,
    newlineIsToken: js.UndefOr[Boolean] = js.undefined
  ): LinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(newlineIsToken)) __obj.updateDynamic("newlineIsToken")(newlineIsToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinesOptions]
  }
}

