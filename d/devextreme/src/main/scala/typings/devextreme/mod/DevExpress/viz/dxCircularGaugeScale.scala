package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLength
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeScale extends BaseGaugeScale {
  /** Specifies common options for scale labels. */
  @JSName("label")
  var label_dxCircularGaugeScale: js.UndefOr[dxCircularGaugeScaleLabel] = js.undefined
  /** Specifies the orientation of scale ticks. */
  var orientation: js.UndefOr[center | inside | outside] = js.undefined
}

object dxCircularGaugeScale {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    customMinorTicks: js.Array[Double] = null,
    customTicks: js.Array[Double] = null,
    endValue: Int | Double = null,
    label: dxCircularGaugeScaleLabel = null,
    minorTick: AnonColorLength = null,
    minorTickInterval: Int | Double = null,
    orientation: center | inside | outside = null,
    scaleDivisionFactor: Int | Double = null,
    startValue: Int | Double = null,
    tick: AnonColorLength = null,
    tickInterval: Int | Double = null
  ): dxCircularGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (customMinorTicks != null) __obj.updateDynamic("customMinorTicks")(customMinorTicks.asInstanceOf[js.Any])
    if (customTicks != null) __obj.updateDynamic("customTicks")(customTicks.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (scaleDivisionFactor != null) __obj.updateDynamic("scaleDivisionFactor")(scaleDivisionFactor.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeScale]
  }
}

