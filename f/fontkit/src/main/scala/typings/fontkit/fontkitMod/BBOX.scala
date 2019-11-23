package typings.fontkit.fontkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBOX extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
}

object BBOX {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): BBOX = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[BBOX]
  }
}

