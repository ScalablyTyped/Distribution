package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordsOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffWords()`.
    */
  var ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined
}

object WordsOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  ): WordsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace)
    __obj.asInstanceOf[WordsOptions]
  }
}

