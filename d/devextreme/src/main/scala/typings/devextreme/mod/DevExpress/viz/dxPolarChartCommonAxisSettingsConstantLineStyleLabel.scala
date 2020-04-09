package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsConstantLineStyleLabel extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.label.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.label.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  @scala.inline
  def apply(font: Font = null, visible: js.UndefOr[Boolean] = js.undefined): dxPolarChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyleLabel]
  }
}

