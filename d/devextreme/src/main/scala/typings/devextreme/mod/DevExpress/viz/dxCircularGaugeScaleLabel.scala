package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonValueText
import typings.devextreme.devextremeStrings.first
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.last
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** Specifies which label to hide in case of overlapping. */
  var hideFirstOrLast: js.UndefOr[first | last] = js.undefined
  /** Specifies the spacing between scale labels and ticks. */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}

object dxCircularGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ AnonValueText => String = null,
    font: Font = null,
    format: format = null,
    hideFirstOrLast: first | last = null,
    indentFromTick: Int | Double = null,
    overlappingBehavior: hide | none = null,
    useRangeColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hideFirstOrLast != null) __obj.updateDynamic("hideFirstOrLast")(hideFirstOrLast.asInstanceOf[js.Any])
    if (indentFromTick != null) __obj.updateDynamic("indentFromTick")(indentFromTick.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
}

