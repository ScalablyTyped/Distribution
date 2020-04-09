package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonValueValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxisLabel extends dxPolarChartCommonAxisSettingsLabel {
  /** @name dxPolarChart.Options.valueAxis.label.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxPolarChartValueAxisLabel {
  @scala.inline
  def apply(
    customizeHint: /* axisValue */ AnonValueValueText => String = null,
    customizeText: /* axisValue */ AnonValueValueText => String = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: none | hide = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxisLabel]
  }
}

