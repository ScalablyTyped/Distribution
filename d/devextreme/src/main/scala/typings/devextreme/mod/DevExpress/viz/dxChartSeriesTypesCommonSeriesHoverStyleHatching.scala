package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures hatching that applies when a user points to the series. */
trait dxChartSeriesTypesCommonSeriesHoverStyleHatching extends js.Object {
  /** Specifies the direction of hatching lines. */
  var direction: js.UndefOr[left | none | right] = js.undefined
  /** Specifies how transparent hatching lines should be. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the distance between two side-by-side hatching lines in pixels. */
  var step: js.UndefOr[Double] = js.undefined
  /** Specifies the width of hatching lines in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesHoverStyleHatching {
  @scala.inline
  def apply(
    direction: left | none | right = null,
    opacity: Int | Double = null,
    step: Int | Double = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesHoverStyleHatching = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyleHatching]
  }
}

