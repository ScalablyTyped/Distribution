package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsConstantLineStyleLabel extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.position */
  var position: js.UndefOr[inside | outside] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxChartCommonAxisSettingsConstantLineStyleLabel {
  @scala.inline
  def apply(font: Font = null, position: inside | outside = null, visible: js.UndefOr[Boolean] = js.undefined): dxChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyleLabel]
  }
}

