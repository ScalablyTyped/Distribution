package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* indicatedValue */ ValueText, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
}

object Indent {
  @scala.inline
  def apply(
    customizeText: /* indicatedValue */ ValueText => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    indent: js.UndefOr[Double] = js.undefined
  ): Indent = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

