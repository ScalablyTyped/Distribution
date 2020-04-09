package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching */
trait dxChartSeriesTypesCommonSeriesSelectionStyleHatching extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.direction */
  var direction: js.UndefOr[left | none | right] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.step */
  var step: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesSelectionStyleHatching {
  @scala.inline
  def apply(
    direction: left | none | right = null,
    opacity: Int | Double = null,
    step: Int | Double = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesSelectionStyleHatching = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyleHatching]
  }
}

