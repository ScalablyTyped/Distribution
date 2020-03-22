package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisMinorTick extends dxPolarChartCommonAxisSettingsMinorTick {
  /** Shifts minor ticks from the reference position. */
  var shift: js.UndefOr[Double] = js.undefined
}

object dxPolarChartArgumentAxisMinorTick {
  @scala.inline
  def apply(
    color: String = null,
    length: Int | Double = null,
    opacity: Int | Double = null,
    shift: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartArgumentAxisMinorTick = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisMinorTick]
  }
}

