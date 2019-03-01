package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis1 extends js.Object {
  var axis1: js.Any
  var axis2: js.Any
  var dimension: js.Any
  var origin: scala.Double
}

object Anon_Axis1 {
  @scala.inline
  def apply(axis1: js.Any, axis2: js.Any, dimension: js.Any, origin: scala.Double): Anon_Axis1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis1")(axis1)
    __obj.updateDynamic("axis2")(axis2)
    __obj.updateDynamic("dimension")(dimension)
    __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[Anon_Axis1]
  }
}

