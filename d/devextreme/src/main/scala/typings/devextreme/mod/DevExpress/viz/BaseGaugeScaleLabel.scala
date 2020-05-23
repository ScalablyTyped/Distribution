package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.scale.label */
trait BaseGaugeScaleLabel extends js.Object {
  /** @name BaseGauge.Options.scale.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueText, String]] = js.undefined
  /** @name BaseGauge.Options.scale.label.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name BaseGauge.Options.scale.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** @name BaseGauge.Options.scale.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  /** @name BaseGauge.Options.scale.label.useRangeColors */
  var useRangeColors: js.UndefOr[Boolean] = js.undefined
  /** @name BaseGauge.Options.scale.label.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BaseGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ ValueText => String = null,
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
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeScaleLabel]
  }
}

