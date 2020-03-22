package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndent extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* indicatedValue */ AnonValueText, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
}

object AnonIndent {
  @scala.inline
  def apply(
    customizeText: /* indicatedValue */ AnonValueText => String = null,
    font: Font = null,
    format: format = null,
    indent: Int | Double = null
  ): AnonIndent = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndent]
  }
}

