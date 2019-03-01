package typings
package firstDashMateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLineLength extends js.Object {
  var maxLineLength: js.UndefOr[scala.Double] = js.undefined
  var maxTokensPerLine: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxLineLength {
  @scala.inline
  def apply(maxLineLength: scala.Int | scala.Double = null, maxTokensPerLine: scala.Int | scala.Double = null): Anon_MaxLineLength = {
    val __obj = js.Dynamic.literal()
    if (maxLineLength != null) __obj.updateDynamic("maxLineLength")(maxLineLength.asInstanceOf[js.Any])
    if (maxTokensPerLine != null) __obj.updateDynamic("maxTokensPerLine")(maxTokensPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxLineLength]
  }
}

