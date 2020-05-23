package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMarkerDataLabelOffset extends js.Object {
  /** X value or horizontal offset to position the labels in chart.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Y value or vertical offset to position the labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesMarkerDataLabelOffset {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesMarkerDataLabelOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMarkerDataLabelOffset]
  }
}

