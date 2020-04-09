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
    length: Int | Double = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartCommonAxisSettingsTick = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsTick]
  }
}

