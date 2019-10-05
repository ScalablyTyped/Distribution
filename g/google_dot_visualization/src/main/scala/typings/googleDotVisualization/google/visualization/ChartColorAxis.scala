package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorAxis extends js.Object {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var legend: js.UndefOr[ChartLegend] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object ChartColorAxis {
  @scala.inline
  def apply(
    colors: js.Array[String] = null,
    legend: ChartLegend = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    values: js.Array[Double] = null
  ): ChartColorAxis = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ChartColorAxis]
  }
}

