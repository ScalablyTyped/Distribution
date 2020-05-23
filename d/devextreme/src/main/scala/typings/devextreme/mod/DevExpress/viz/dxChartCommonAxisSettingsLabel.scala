package typings.devextreme.mod.DevExpress.viz

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsLabel extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.label.alignment */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.displayMode */
  var displayMode: js.UndefOr[rotate | stagger | standard] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.indentFromAxis */
  var indentFromAxis: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[rotate | stagger | none | hide] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.rotationAngle */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.staggeringSpacing */
  var staggeringSpacing: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object dxChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    displayMode: rotate | stagger | standard = null,
    font: Font = null,
    indentFromAxis: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: rotate | stagger | none | hide = null,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    staggeringSpacing: js.UndefOr[Double] = js.undefined,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): dxChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromAxis)) __obj.updateDynamic("indentFromAxis")(indentFromAxis.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staggeringSpacing)) __obj.updateDynamic("staggeringSpacing")(staggeringSpacing.get.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsLabel]
  }
}

