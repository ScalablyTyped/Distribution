package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseChart.Options.adaptiveLayout */
trait BaseChartAdaptiveLayout extends js.Object {
  /** @name BaseChart.Options.adaptiveLayout.height */
  var height: js.UndefOr[Double] = js.undefined
  /** @name BaseChart.Options.adaptiveLayout.keepLabels */
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  /** @name BaseChart.Options.adaptiveLayout.width */
  var width: js.UndefOr[Double] = js.undefined
}

object BaseChartAdaptiveLayout {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    keepLabels: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): BaseChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLabels)) __obj.updateDynamic("keepLabels")(keepLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartAdaptiveLayout]
  }
}

