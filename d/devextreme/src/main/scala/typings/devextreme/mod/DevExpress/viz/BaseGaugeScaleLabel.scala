package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.scale.label */
@js.native
trait BaseGaugeScaleLabel extends js.Object {
  /** @name BaseGauge.Options.scale.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueText, String]] = js.native
  /** @name BaseGauge.Options.scale.label.font */
  var font: js.UndefOr[Font] = js.native
  /** @name BaseGauge.Options.scale.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  /** @name BaseGauge.Options.scale.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[hide | none] = js.native
  /** @name BaseGauge.Options.scale.label.useRangeColors */
  var useRangeColors: js.UndefOr[Boolean] = js.native
  /** @name BaseGauge.Options.scale.label.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object BaseGaugeScaleLabel {
  @scala.inline
  def apply(): BaseGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScaleLabel]
  }
  @scala.inline
  implicit class BaseGaugeScaleLabelOps[Self <: BaseGaugeScaleLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomizeText(value: /* scaleValue */ ValueText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOverlappingBehavior(value: hide | none): Self = this.set("overlappingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlappingBehavior: Self = this.set("overlappingBehavior", js.undefined)
    @scala.inline
    def setUseRangeColors(value: Boolean): Self = this.set("useRangeColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseRangeColors: Self = this.set("useRangeColors", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

