package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorLength
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeScale extends BaseGaugeScale {
  /** @name dxCircularGauge.Options.scale.label */
  @JSName("label")
  var label_dxCircularGaugeScale: js.UndefOr[dxCircularGaugeScaleLabel] = js.undefined
  /** @name dxCircularGauge.Options.scale.orientation */
  var orientation: js.UndefOr[center | inside | outside] = js.undefined
}

object dxCircularGaugeScale {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    customMinorTicks: js.Array[Double] = null,
    customTicks: js.Array[Double] = null,
    endValue: js.UndefOr[Double] = js.undefined,
    label: dxCircularGaugeScaleLabel = null,
    minorTick: ColorLength = null,
    minorTickInterval: js.UndefOr[Double] = js.undefined,
    orientation: center | inside | outside = null,
    scaleDivisionFactor: js.UndefOr[Double] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined,
    tick: ColorLength = null,
    tickInterval: js.UndefOr[Double] = js.undefined
  ): dxCircularGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (customMinorTicks != null) __obj.updateDynamic("customMinorTicks")(customMinorTicks.asInstanceOf[js.Any])
    if (customTicks != null) __obj.updateDynamic("customTicks")(customTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleDivisionFactor)) __obj.updateDynamic("scaleDivisionFactor")(scaleDivisionFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeScale]
  }
}

