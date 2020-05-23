package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxisLabel extends dxPolarChartCommonAxisSettingsLabel {
  /** @name dxPolarChart.Options.valueAxis.label.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxPolarChartValueAxisLabel {
  @scala.inline
  def apply(
    customizeHint: /* axisValue */ ValueValueText => String = null,
    customizeText: /* axisValue */ ValueValueText => String = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: none | hide = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromAxis)) __obj.updateDynamic("indentFromAxis")(indentFromAxis.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxisLabel]
  }
}

