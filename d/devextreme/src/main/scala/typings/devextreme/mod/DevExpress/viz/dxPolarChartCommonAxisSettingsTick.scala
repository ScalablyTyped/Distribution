package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsTick extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.tick.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.tick.length */
  var length: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.tick.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.tick.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.tick.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxPolarChartCommonAxisSettingsTick {
  @scala.inline
  def apply(
    color: String = null,
    length: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartCommonAxisSettingsTick = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsTick]
  }
}

