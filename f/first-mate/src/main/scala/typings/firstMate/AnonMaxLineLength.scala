package typings.firstMate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxLineLength extends js.Object {
  var maxLineLength: js.UndefOr[Double] = js.undefined
  var maxTokensPerLine: js.UndefOr[Double] = js.undefined
}

object AnonMaxLineLength {
  @scala.inline
  def apply(maxLineLength: Int | Double = null, maxTokensPerLine: Int | Double = null): AnonMaxLineLength = {
    val __obj = js.Dynamic.literal()
    if (maxLineLength != null) __obj.updateDynamic("maxLineLength")(maxLineLength.asInstanceOf[js.Any])
    if (maxTokensPerLine != null) __obj.updateDynamic("maxTokensPerLine")(maxTokensPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxLineLength]
  }
}

