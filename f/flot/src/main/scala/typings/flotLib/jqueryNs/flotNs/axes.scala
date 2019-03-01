package typings
package flotLib.jqueryNs.flotNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xaxis")(xaxis)
    __obj.updateDynamic("yaxis")(yaxis)
    if (x2axis != null) __obj.updateDynamic("x2axis")(x2axis)
    if (y2axis != null) __obj.updateDynamic("y2axis")(y2axis)
    __obj.asInstanceOf[axes]
  }
}

