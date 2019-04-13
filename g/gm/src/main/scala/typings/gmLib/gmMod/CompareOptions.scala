package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareOptions extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  var highlightStyle: js.UndefOr[HighlightStyle] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

object CompareOptions {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    highlightColor: java.lang.String = null,
    highlightStyle: HighlightStyle = null,
    tolerance: scala.Int | scala.Double = null
  ): CompareOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareOptions]
  }
}

