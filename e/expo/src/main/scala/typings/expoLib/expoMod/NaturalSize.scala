package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NaturalSize extends js.Object {
  var height: scala.Double
  var orientation: Orientation
  var width: scala.Double
}

object NaturalSize {
  @scala.inline
  def apply(height: scala.Double, orientation: Orientation, width: scala.Double): NaturalSize = {
    val __obj = js.Dynamic.literal(height = height, orientation = orientation, width = width)
  
    __obj.asInstanceOf[NaturalSize]
  }
}

