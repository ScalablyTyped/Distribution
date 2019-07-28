package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchOptions extends LinesOptions {
  /**
    * Describes how many lines of context should be included.
    * @default 4
    */
  var context: js.UndefOr[Double] = js.undefined
}

object PatchOptions {
  @scala.inline
  def apply(
    context: Int | Double = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[Boolean] = js.undefined,
    newlineIsToken: js.UndefOr[Boolean] = js.undefined
  ): PatchOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace)
    if (!js.isUndefined(newlineIsToken)) __obj.updateDynamic("newlineIsToken")(newlineIsToken)
    __obj.asInstanceOf[PatchOptions]
  }
}

