package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Point structure.
  *
  * xval_* and yval_* are the original unscaled data values,
  * while x_* and y_* are scaled to the range (0.0-1.0) for plotting.
  * yval_stacked is the cumulative Y value used for stacking graphs,
  * and bottom/top/minus/plus are used for error bar graphs.
  */
trait Point extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.undefined
  var idx: Double
  var name: String
  var x: js.UndefOr[Double] = js.undefined
  var xval: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var y_bottom: js.UndefOr[Double] = js.undefined
  var y_stacked: js.UndefOr[Double] = js.undefined
  var y_top: js.UndefOr[Double] = js.undefined
  var yval: js.UndefOr[Double] = js.undefined
  var yval_minus: js.UndefOr[Double] = js.undefined
  var yval_plus: js.UndefOr[Double] = js.undefined
  var yval_stacked: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    idx: Double,
    name: String,
    annotation: Annotation = null,
    x: js.UndefOr[Double] = js.undefined,
    xval: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    y_bottom: js.UndefOr[Double] = js.undefined,
    y_stacked: js.UndefOr[Double] = js.undefined,
    y_top: js.UndefOr[Double] = js.undefined,
    yval: js.UndefOr[Double] = js.undefined,
    yval_minus: js.UndefOr[Double] = js.undefined,
    yval_plus: js.UndefOr[Double] = js.undefined,
    yval_stacked: js.UndefOr[Double] = js.undefined
  ): Point = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xval)) __obj.updateDynamic("xval")(xval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_bottom)) __obj.updateDynamic("y_bottom")(y_bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_stacked)) __obj.updateDynamic("y_stacked")(y_stacked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_top)) __obj.updateDynamic("y_top")(y_top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yval)) __obj.updateDynamic("yval")(yval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yval_minus)) __obj.updateDynamic("yval_minus")(yval_minus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yval_plus)) __obj.updateDynamic("yval_plus")(yval_plus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yval_stacked)) __obj.updateDynamic("yval_stacked")(yval_stacked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

