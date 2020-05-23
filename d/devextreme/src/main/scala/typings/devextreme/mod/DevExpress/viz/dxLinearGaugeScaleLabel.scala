package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLinearGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** @name dxLinearGauge.Options.scale.label.indentFromTick */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}

object dxLinearGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ ValueText => String = null,
    font: Font = null,
    format: format = null,
    indentFromTick: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: hide | none = null,
    useRangeColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxLinearGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromTick)) __obj.updateDynamic("indentFromTick")(indentFromTick.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLinearGaugeScaleLabel]
  }
}

