package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object XY {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): XY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[XY]
  }
}

