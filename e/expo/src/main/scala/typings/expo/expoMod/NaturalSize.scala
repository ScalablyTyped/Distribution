package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NaturalSize extends js.Object {
  var height: Double
  var orientation: Orientation
  var width: Double
}

object NaturalSize {
  @scala.inline
  def apply(height: Double, orientation: Orientation, width: Double): NaturalSize = {
    val __obj = js.Dynamic.literal(height = height, orientation = orientation, width = width)
  
    __obj.asInstanceOf[NaturalSize]
  }
}

