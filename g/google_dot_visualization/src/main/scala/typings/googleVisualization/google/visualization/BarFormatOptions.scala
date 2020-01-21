package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarFormatOptions extends js.Object {
  /**
    * A number that is the base value to compare the cell value against. If the cell value is higher, it will be drawn to the right of the base; if lower, it will be drawn to the left. Default value is 0.
    */
  var base: js.UndefOr[Double] = js.undefined
  /**
    * A string indicating the negative value section of bars. Possible values are 'red', 'green' and 'blue'; default value is 'red'.
    */
  var colorNegative: js.UndefOr[String] = js.undefined
  /**
    * A string indicating the color of the positive value section of bars. Possible values are 'red', 'green' and 'blue'. Default is 'blue'.
    */
  var colorPositive: js.UndefOr[String] = js.undefined
  /**
    * A boolean indicating if to draw a 1 pixel dark base line when negative values are present. The dark line is there to enhance visual scanning of the bars. Default value is 'false'.
    */
  var drawZeroLine: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number value for the bar range. Default value is the highest value in the table.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number value for the bar range. Default value is the lowest value in the table.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * If true, shows values and bars; if false, shows only bars. Default value is true.
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Thickness of each bar, in pixels. Default value is 100.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object BarFormatOptions {
  @scala.inline
  def apply(
    base: Int | Double = null,
    colorNegative: String = null,
    colorPositive: String = null,
    drawZeroLine: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    showValue: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): BarFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (colorNegative != null) __obj.updateDynamic("colorNegative")(colorNegative.asInstanceOf[js.Any])
    if (colorPositive != null) __obj.updateDynamic("colorPositive")(colorPositive.asInstanceOf[js.Any])
    if (!js.isUndefined(drawZeroLine)) __obj.updateDynamic("drawZeroLine")(drawZeroLine.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarFormatOptions]
  }
}

