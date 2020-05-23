package typings.firstMate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxLineLength extends js.Object {
  var maxLineLength: js.UndefOr[Double] = js.undefined
  var maxTokensPerLine: js.UndefOr[Double] = js.undefined
}

object MaxLineLength {
  @scala.inline
  def apply(
    maxLineLength: js.UndefOr[Double] = js.undefined,
    maxTokensPerLine: js.UndefOr[Double] = js.undefined
  ): MaxLineLength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxLineLength)) __obj.updateDynamic("maxLineLength")(maxLineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTokensPerLine)) __obj.updateDynamic("maxTokensPerLine")(maxTokensPerLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLineLength]
  }
}

