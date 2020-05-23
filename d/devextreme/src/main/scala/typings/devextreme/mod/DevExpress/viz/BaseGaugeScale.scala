package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.scale */
trait BaseGaugeScale extends js.Object {
  /** @name BaseGauge.Options.scale.allowDecimals */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** @name BaseGauge.Options.scale.customMinorTicks */
  var customMinorTicks: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name BaseGauge.Options.scale.customTicks */
  var customTicks: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name BaseGauge.Options.scale.endValue */
  var endValue: js.UndefOr[Double] = js.undefined
  /** @name BaseGauge.Options.scale.label */
  var label: js.UndefOr[BaseGaugeScaleLabel] = js.undefined
  /** @name BaseGauge.Options.scale.minorTick */
  var minorTick: js.UndefOr[ColorLength] = js.undefined
  /** @name BaseGauge.Options.scale.minorTickInterval */
  var minorTickInterval: js.UndefOr[Double] = js.undefined
  /** @name BaseGauge.Options.scale.scaleDivisionFactor */
  var scaleDivisionFactor: js.UndefOr[Double] = js.undefined
  /** @name BaseGauge.Options.scale.startValue */
  var startValue: js.UndefOr[Double] = js.undefined
  /** @name BaseGauge.Options.scale.tick */
  var tick: js.UndefOr[ColorLength] = js.undefined
  /** @name BaseGauge.Options.scale.tickInterval */
  var tickInterval: js.UndefOr[Double] = js.undefined
}

object BaseGaugeScale {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    customMinorTicks: js.Array[Double] = null,
    customTicks: js.Array[Double] = null,
    endValue: js.UndefOr[Double] = js.undefined,
    label: BaseGaugeScaleLabel = null,
    minorTick: ColorLength = null,
    minorTickInterval: js.UndefOr[Double] = js.undefined,
    scaleDivisionFactor: js.UndefOr[Double] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined,
    tick: ColorLength = null,
    tickInterval: js.UndefOr[Double] = js.undefined
  ): BaseGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (customMinorTicks != null) __obj.updateDynamic("customMinorTicks")(customMinorTicks.asInstanceOf[js.Any])
    if (customTicks != null) __obj.updateDynamic("customTicks")(customTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleDivisionFactor)) __obj.updateDynamic("scaleDivisionFactor")(scaleDivisionFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeScale]
  }
}

