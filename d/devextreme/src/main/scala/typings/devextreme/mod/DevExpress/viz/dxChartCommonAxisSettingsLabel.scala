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
  /** Aligns axis labels in relation to ticks. */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** Allows you to rotate or stagger axis labels. Applies to the horizontal axis only. */
  var displayMode: js.UndefOr[rotate | stagger | standard] = js.undefined
  /** Specifies font options for axis labels. */
  var font: js.UndefOr[Font] = js.undefined
  /** Adds a pixel-measured empty space between an axis and its labels. */
  var indentFromAxis: js.UndefOr[Double] = js.undefined
  /** Decides how to arrange axis labels when there is not enough space to keep all of them. */
  var overlappingBehavior: js.UndefOr[rotate | stagger | none | hide] = js.undefined
  /** Specifies the rotation angle of axis labels. Applies only if displayMode or overlappingBehavior is "rotate". */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  /** Adds a pixel-measured empty space between two staggered rows of axis labels. Applies only if displayMode or overlappingBehavior is "stagger". */
  var staggeringSpacing: js.UndefOr[Double] = js.undefined
  /** Specifies what to do with axis labels that overflow the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** Shows/hides axis labels. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies how to wrap texts that do not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object dxChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    displayMode: rotate | stagger | standard = null,
    font: Font = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: rotate | stagger | none | hide = null,
    rotationAngle: Int | Double = null,
    staggeringSpacing: Int | Double = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): dxChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (staggeringSpacing != null) __obj.updateDynamic("staggeringSpacing")(staggeringSpacing.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsLabel]
  }
}

