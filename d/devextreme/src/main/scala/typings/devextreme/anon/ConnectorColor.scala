package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorColor extends js.Object {
  var connectorColor: js.UndefOr[String] = js.undefined
  var connectorWidth: js.UndefOr[Double] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* barValue */ ValueText, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ConnectorColor {
  @scala.inline
  def apply(
    connectorColor: String = null,
    connectorWidth: js.UndefOr[Double] = js.undefined,
    customizeText: /* barValue */ ValueText => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    indent: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ConnectorColor = {
    val __obj = js.Dynamic.literal()
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorWidth)) __obj.updateDynamic("connectorWidth")(connectorWidth.get.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorColor]
  }
}

