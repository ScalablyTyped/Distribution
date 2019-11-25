package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait axes extends js.Object {
  var x2axis: js.UndefOr[axis] = js.undefined
  var xaxis: axis
  var y2axis: js.UndefOr[axis] = js.undefined
  var yaxis: axis
}

object axes {
  @scala.inline
  def apply(xaxis: axis, yaxis: axis, x2axis: axis = null, y2axis: axis = null): axes = {
    val __obj = js.Dynamic.literal(xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    if (x2axis != null) __obj.updateDynamic("x2axis")(x2axis.asInstanceOf[js.Any])
    if (y2axis != null) __obj.updateDynamic("y2axis")(y2axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[axes]
  }
}

