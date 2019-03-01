package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Area {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, x: scala.Double, y: scala.Double): Area = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Area]
  }
}

