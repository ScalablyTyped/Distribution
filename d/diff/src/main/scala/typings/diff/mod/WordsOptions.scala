package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordsOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffWords()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
}

object WordsOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
  ): WordsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordsOptions]
  }
}

