package typings.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareOptions extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var highlightColor: js.UndefOr[String] = js.undefined
  var highlightStyle: js.UndefOr[HighlightStyle] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object CompareOptions {
  @scala.inline
  def apply(
    file: String = null,
    highlightColor: String = null,
    highlightStyle: HighlightStyle = null,
    tolerance: Int | Double = null
  ): CompareOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareOptions]
  }
}

