package typings.dv.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Box {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Box = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Box]
  }
}

