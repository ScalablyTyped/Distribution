package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartViewWindow extends js.Object {
  var max: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
  var min: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
}

object ChartViewWindow {
  @scala.inline
  def apply(
    max: scala.Double | stdLib.Date | js.Array[scala.Double] = null,
    min: scala.Double | stdLib.Date | js.Array[scala.Double] = null
  ): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartViewWindow]
  }
}

