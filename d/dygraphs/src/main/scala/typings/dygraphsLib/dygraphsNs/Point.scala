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

