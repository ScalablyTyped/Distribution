package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies common options for scale labels. */
trait BaseGaugeScaleLabel extends js.Object {
  /** Specifies a callback function that returns the text to be displayed in scale labels. */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ AnonValueText, String]] = js.undefined
  /** Specifies font options for the text displayed in the scale labels of the gauge. */
  var font: js.UndefOr[Font] = js.undefined
  /** Formats a value before it is displayed in a scale label. Accepts only numeric formats. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Decides how to arrange scale labels when there is not enough space to keep all of them. */
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  /** Specifies whether or not scale labels should be colored similarly to their corresponding ranges in the range container. */
  var useRangeColors: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not scale labels are visible on the gauge. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BaseGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ AnonValueText => String = null,
    font: Font = null,
    format: format = null,
    overlappingBehavior: hide | none = null,
    useRangeColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BaseGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeScaleLabel]
  }
}

