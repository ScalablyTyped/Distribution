package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorAxis extends js.Object {
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var legend: js.UndefOr[ChartLegend] = js.undefined
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object ChartColorAxis {
  @scala.inline
  def apply(
    colors: js.Array[java.lang.String] = null,
    legend: ChartLegend = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    values: js.Array[scala.Double] = null
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

