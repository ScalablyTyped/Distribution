package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSizeAxis extends js.Object {
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object ChartSizeAxis {
  @scala.inline
  def apply(
    maxSize: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): ChartSizeAxis = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSizeAxis]
  }
}

