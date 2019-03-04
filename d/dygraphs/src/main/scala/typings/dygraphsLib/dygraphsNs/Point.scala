package typings
package dygraphsLib.dygraphsNs

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
  var idx: scala.Double
  var name: java.lang.String
  var x: js.UndefOr[scala.Double] = js.undefined
  var xval: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  var y_bottom: js.UndefOr[scala.Double] = js.undefined
  var y_stacked: js.UndefOr[scala.Double] = js.undefined
  var y_top: js.UndefOr[scala.Double] = js.undefined
  var yval: js.UndefOr[scala.Double] = js.undefined
  var yval_minus: js.UndefOr[scala.Double] = js.undefined
  var yval_plus: js.UndefOr[scala.Double] = js.undefined
  var yval_stacked: js.UndefOr[scala.Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    idx: scala.Double,
    name: java.lang.String,
    annotation: Annotation = null,
    x: scala.Int | scala.Double = null,
    xval: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    y_bottom: scala.Int | scala.Double = null,
    y_stacked: scala.Int | scala.Double = null,
    y_top: scala.Int | scala.Double = null,
    yval: scala.Int | scala.Double = null,
    yval_minus: scala.Int | scala.Double = null,
    yval_plus: scala.Int | scala.Double = null,
    yval_stacked: scala.Int | scala.Double = null
  ): Point = {
    val __obj = js.Dynamic.literal(idx = idx, name = name)
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xval != null) __obj.updateDynamic("xval")(xval.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y_bottom != null) __obj.updateDynamic("y_bottom")(y_bottom.asInstanceOf[js.Any])
    if (y_stacked != null) __obj.updateDynamic("y_stacked")(y_stacked.asInstanceOf[js.Any])
    if (y_top != null) __obj.updateDynamic("y_top")(y_top.asInstanceOf[js.Any])
    if (yval != null) __obj.updateDynamic("yval")(yval.asInstanceOf[js.Any])
    if (yval_minus != null) __obj.updateDynamic("yval_minus")(yval_minus.asInstanceOf[js.Any])
    if (yval_plus != null) __obj.updateDynamic("yval_plus")(yval_plus.asInstanceOf[js.Any])
    if (yval_stacked != null) __obj.updateDynamic("yval_stacked")(yval_stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

