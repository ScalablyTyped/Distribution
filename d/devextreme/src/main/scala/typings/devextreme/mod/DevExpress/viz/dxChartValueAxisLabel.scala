package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueValueText
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.rotate
import typings.devextreme.devextremeStrings.stagger
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisLabel extends dxChartCommonAxisSettingsLabel {
  /** @name dxChart.Options.valueAxis.label.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  /** @name dxChart.Options.valueAxis.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  /** @name dxChart.Options.valueAxis.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxChartValueAxisLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    customizeHint: /* axisValue */ ValueValueText => String = null,
    customizeText: /* axisValue */ ValueValueText => String = null,
    displayMode: rotate | stagger | standard = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: rotate | stagger | none | hide = null,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    staggeringSpacing: js.UndefOr[Double] = js.undefined,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): dxChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromAxis)) __obj.updateDynamic("indentFromAxis")(indentFromAxis.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staggeringSpacing)) __obj.updateDynamic("staggeringSpacing")(staggeringSpacing.get.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisLabel]
  }
}

