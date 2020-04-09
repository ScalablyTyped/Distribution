package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonValueValueText
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

trait dxChartArgumentAxisLabel extends dxChartCommonAxisSettingsLabel {
  /** @name dxChart.Options.argumentAxis.label.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* argument */ AnonValueValueText, String]] = js.undefined
  /** @name dxChart.Options.argumentAxis.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* argument */ AnonValueValueText, String]] = js.undefined
  /** @name dxChart.Options.argumentAxis.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxChartArgumentAxisLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    customizeHint: /* argument */ AnonValueValueText => String = null,
    customizeText: /* argument */ AnonValueValueText => String = null,
    displayMode: rotate | stagger | standard = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: rotate | stagger | none | hide = null,
    rotationAngle: Int | Double = null,
    staggeringSpacing: Int | Double = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): dxChartArgumentAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (staggeringSpacing != null) __obj.updateDynamic("staggeringSpacing")(staggeringSpacing.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartArgumentAxisLabel]
  }
}

