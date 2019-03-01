package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYCoord extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object XYCoord {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): XYCoord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[XYCoord]
  }
}

