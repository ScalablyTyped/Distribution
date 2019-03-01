package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartGridlines extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
}

object ChartGridlines {
  @scala.inline
  def apply(color: java.lang.String = null, count: scala.Int | scala.Double = null): ChartGridlines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartGridlines]
  }
}

