package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYZ extends XY {
  var z: scala.Double
}

object XYZ {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): XYZ = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[XYZ]
  }
}

