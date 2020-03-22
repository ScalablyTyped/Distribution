package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectorColor extends js.Object {
  var connectorColor: js.UndefOr[String] = js.undefined
  var connectorWidth: js.UndefOr[Double] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* barValue */ AnonValueText, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonConnectorColor {
  @scala.inline
  def apply(
    connectorColor: String = null,
    connectorWidth: Int | Double = null,
    customizeText: /* barValue */ AnonValueText => String = null,
    font: Font = null,
    format: format = null,
    indent: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonConnectorColor = {
    val __obj = js.Dynamic.literal()
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (connectorWidth != null) __obj.updateDynamic("connectorWidth")(connectorWidth.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectorColor]
  }
}

