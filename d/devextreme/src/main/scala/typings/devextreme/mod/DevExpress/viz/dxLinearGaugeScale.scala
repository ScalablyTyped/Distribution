package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLength
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLinearGaugeScale extends BaseGaugeScale {
  /** @name dxLinearGauge.Options.scale.horizontalOrientation */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.undefined
  /** @name dxLinearGauge.Options.scale.label */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.undefined
  /** @name dxLinearGauge.Options.scale.verticalOrientation */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.undefined
}

object dxLinearGaugeScale {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    customMinorTicks: js.Array[Double] = null,
    customTicks: js.Array[Double] = null,
    endValue: Int | Double = null,
    horizontalOrientation: center | left | right = null,
    label: dxLinearGaugeScaleLabel = null,
    minorTick: AnonColorLength = null,
    minorTickInterval: Int | Double = null,
    scaleDivisionFactor: Int | Double = null,
    startValue: Int | Double = null,
    tick: AnonColorLength = null,
    tickInterval: Int | Double = null,
    verticalOrientation: bottom | center | top = null
  ): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (customMinorTicks != null) __obj.updateDynamic("customMinorTicks")(customMinorTicks.asInstanceOf[js.Any])
    if (customTicks != null) __obj.updateDynamic("customTicks")(customTicks.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (scaleDivisionFactor != null) __obj.updateDynamic("scaleDivisionFactor")(scaleDivisionFactor.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
}

