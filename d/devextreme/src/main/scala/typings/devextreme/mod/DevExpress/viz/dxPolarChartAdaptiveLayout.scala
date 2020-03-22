package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartAdaptiveLayout extends BaseChartAdaptiveLayout

object dxPolarChartAdaptiveLayout {
  @scala.inline
  def apply(
    height: Int | Double = null,
    keepLabels: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLabels)) __obj.updateDynamic("keepLabels")(keepLabels.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartAdaptiveLayout]
  }
}

